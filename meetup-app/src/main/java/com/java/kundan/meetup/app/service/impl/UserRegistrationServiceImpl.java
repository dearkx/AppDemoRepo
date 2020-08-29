package com.java.kundan.meetup.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.kundan.meetup.app.custom.exception.UserNotFoundException;
import com.java.kundan.meetup.app.entity.registration.UserRegistration;
import com.java.kundan.meetup.app.repository.UserRegistrationRepository;
import com.java.kundan.meetup.app.request.UserRegistrationRequest;
import com.java.kundan.meetup.app.response.UserRegistrationResponse;
import com.java.kundan.meetup.app.service.UserRegistrationService;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

	@Autowired
	private UserRegistrationRepository registrationRepository;

	@Override
	public UserRegistrationResponse save(UserRegistrationRequest req) {
		UserRegistration entity = new UserRegistration();
		if (req != null) {
			entity.setFirstName(req.getFirstName());
			entity.setLastName(req.getLastName());
			entity.setEmail(req.getEmail());
			entity.setUsername(req.getUsername());
			entity.setPassword(req.getPassword());
			UserRegistration meetUpUserReg = registrationRepository.save(entity);
			UserRegistrationResponse response = new UserRegistrationResponse();
			response.setMeetUpUsers(meetUpUserReg);

			return response;
		}

		return null;
	}
	

	@Override
	public UserRegistration getUserById(long meetUpID) {
		Optional<UserRegistration> user = registrationRepository.findById(meetUpID);
			if(!user.isPresent()){
				throw new UserNotFoundException("User is not available");
			}
		return user.get();
	}


	@Override
	public List<UserRegistration> getAllUser() {
		
		return registrationRepository.findAll();
	}


	@Override
	public UserRegistration updateUser(UserRegistrationRequest req) {
		Optional<UserRegistration> users = registrationRepository.findById(req.getMeetUpID());
		if (!users.isPresent()) {
			throw new UserNotFoundException("User is not available");
		} else {
			UserRegistration entity = users.get();
			entity.setFirstName(req.getFirstName());
			entity.setLastName(req.getLastName());
			entity.setPassword(req.getPassword());
			UserRegistration userR = registrationRepository.save(entity);
			return userR;
		}

	}


	@Override
	public String deleteUser(Long id) {
		String message = null;
		if (null == id) {
			throw new UserNotFoundException("User is not available");
		} else {
			registrationRepository.deleteById(id);
			message="deleted user for id "+id;
			return message;
		}
	}


	@Override
	public UserRegistration getByUser(String user) {
		UserRegistration findByUsername = registrationRepository.findByUsername(user);
		return findByUsername;
	}
}
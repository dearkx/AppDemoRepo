package com.java.kundan.meetup.app.service;

import java.util.List;

import com.java.kundan.meetup.app.entity.registration.UserRegistration;
import com.java.kundan.meetup.app.request.UserRegistrationRequest;
import com.java.kundan.meetup.app.response.UserRegistrationResponse;

public interface UserRegistrationService {
	
	public UserRegistrationResponse save(UserRegistrationRequest req);
	
	public UserRegistration getUserById(long id);
	
	public List<UserRegistration>getAllUser();
	
	public UserRegistration updateUser(UserRegistrationRequest req);
	
	public String deleteUser(Long id);

}

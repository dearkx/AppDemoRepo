package com.java.kundan.meetup.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.kundan.meetup.app.entity.registration.UserRegistration;

@Repository
public interface UserRegistrationRepository extends JpaRepository<UserRegistration, Long> {
	
	public UserRegistration findByUsername(String user);

}

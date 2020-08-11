package com.java.kundan.meetup.app.response;

import java.util.List;

import com.java.kundan.meetup.app.entity.registration.UserRegistration;

import lombok.Data;

@Data
public class UserRegistrationResponse {
	
	public  UserRegistration meetUpUsers;
	
	public  List<UserRegistration> listOfMeetUpUsers;
	
	
	

}

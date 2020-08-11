package com.java.kundan.meetup.app.request;

import lombok.Data;

@Data
public class UserRegistrationRequest {

	private long meetUpID;

	private String firstName;
	
	private String lastName;

	private String email;
	
	private String username;

	private String password;
	
	
 
}

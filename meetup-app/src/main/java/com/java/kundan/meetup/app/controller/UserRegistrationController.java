package com.java.kundan.meetup.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.kundan.meetup.app.entity.registration.UserRegistration;
import com.java.kundan.meetup.app.request.UserRegistrationRequest;
import com.java.kundan.meetup.app.response.UserRegistrationResponse;
import com.java.kundan.meetup.app.service.UserRegistrationService;

@RestController
@RequestMapping("meetup")
public class UserRegistrationController {
	
	@Autowired
	private UserRegistrationService meetUpservice;
	
	@PostMapping
	public UserRegistrationResponse save(@RequestBody UserRegistrationRequest request){
		
		
		return meetUpservice.save(request);
		
	}
	
	@GetMapping("/meetUpID/{meetUpID}")
	public UserRegistration getUserById(@PathVariable(value="meetUpID")Long meetUpID){
		
		
		return meetUpservice.getUserById(meetUpID);
		
		
	}
	
	@GetMapping("/username/{username}")
	public UserRegistration getUserAndPass(@PathVariable(value="username")String username){
		UserRegistration byUser = meetUpservice.getByUser(username);
		return byUser;
		
		
	}
	@GetMapping("all")
	public List<UserRegistration> getAllMessage(){
		return meetUpservice.getAllUser();
	}
	
	@PutMapping("update")
	public UserRegistration update(@RequestBody UserRegistrationRequest requestDto){
		return meetUpservice.updateUser(requestDto);
		
	}
	
	@DeleteMapping("/delete/{meetUpID}")
	public String deleteUser(@PathVariable(value="meetUpID") Long meetUpID){
		return meetUpservice.deleteUser(meetUpID);
		
	}
}

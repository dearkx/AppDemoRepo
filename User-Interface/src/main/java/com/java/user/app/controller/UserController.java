package com.java.user.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.user.app.entity.EventResponse;
import com.java.user.app.entity.User;
import com.java.user.app.proxy.EventProxyService;
import com.java.user.app.proxy.UserProxyService;

@RestController
@RequestMapping("/user")
@RefreshScope
public class UserController {

	@Autowired
	UserProxyService userProxyService;
	
	@Autowired
	EventProxyService eventProxyService;

	@GetMapping
	public List<EventResponse> validateUser(@RequestBody User user) {
		String isvalid = "not valid";
		if (user.getUsername() != null && user.getUsername() != "" && user.getPassword() != null
				&& user.getPassword() != "") {

			System.out.println("==before validate the user in db==");
			
			try {
				User userDetails = userProxyService.getUserDetails(user.getUsername());
				if (userDetails.getUsername().equals(user.getUsername())
						&& userDetails.getPassword().equals(user.getPassword())) {
					List<EventResponse> allEvent = eventProxyService.getAllEvent();
					System.out.println("user have following events: ");
					System.out.println(allEvent);
					//isvalid = "Dear " + userDetails.getUsername() + " today we have following events :";
					return allEvent;
				}
			} catch (Exception e) {
				//return isvalid;
			}

		}
		return null;
	}
	@GetMapping("/eventPlace/{eventPlace}")
	public EventResponse getEventDetails(@PathVariable("eventPlace")String eventPlace){
		
		EventResponse eventDetails = eventProxyService.getEventDetails(eventPlace);
		return eventDetails;
		
	}
	
}

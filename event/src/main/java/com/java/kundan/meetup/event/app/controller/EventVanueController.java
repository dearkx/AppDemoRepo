package com.java.kundan.meetup.event.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.kundan.meetup.event.app.request.EventVanueRequest;
import com.java.kundan.meetup.event.app.response.EventResponse;
import com.java.kundan.meetup.event.app.response.EventVanueResponse;
import com.java.kundan.meetup.event.app.service.EventVanueService;

@RestController
@RequestMapping("event")
public class EventVanueController {
	
	@Autowired
	private EventVanueService eventVanueService;
	
	@PostMapping
	public EventResponse save(@RequestBody EventVanueRequest request){
		
		
		return eventVanueService.save(request);
		
	}
	
	@GetMapping("/id/{eVID}")
	public ResponseEntity<EventVanueResponse> getUserById(@PathVariable(value="eVID")Long eVID) {
			return ResponseEntity.ok(eventVanueService.getEventById(eVID));
	}
	
	@GetMapping("/{eventPlace}")
	public EventVanueResponse findByEventPlace(@PathVariable(value="eventPlace")String eventPlace){
		
		
		return eventVanueService.findByEventPlace(eventPlace);
		
		
	}
	
}

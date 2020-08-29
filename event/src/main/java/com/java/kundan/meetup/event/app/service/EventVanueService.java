package com.java.kundan.meetup.event.app.service;

import java.util.List;

import com.java.kundan.meetup.event.app.request.EventVanueRequest;
import com.java.kundan.meetup.event.app.response.EventResponse;


public interface EventVanueService {
	
	public EventResponse save(EventVanueRequest req);
	
	public EventResponse getEventById(Long id) ;
		
	//public EventVanueResponse updateUser(EventVanueRequest req);
		
	public EventResponse findByEventPlace(String placeName);
	
	public List<EventResponse> findAllPlace();

}

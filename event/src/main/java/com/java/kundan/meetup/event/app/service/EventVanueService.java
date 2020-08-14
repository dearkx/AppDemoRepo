package com.java.kundan.meetup.event.app.service;

import com.java.kundan.meetup.event.app.request.EventVanueRequest;
import com.java.kundan.meetup.event.app.response.EventResponse;
import com.java.kundan.meetup.event.app.response.EventVanueResponse;


public interface EventVanueService {
	
	public EventResponse save(EventVanueRequest req);
	
	public EventVanueResponse getEventById(Long id) ;
		
	//public EventVanueResponse updateUser(EventVanueRequest req);
		
	public EventVanueResponse findByEventPlace(String placeName);

}

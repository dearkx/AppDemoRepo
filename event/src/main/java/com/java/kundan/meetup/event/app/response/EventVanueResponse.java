package com.java.kundan.meetup.event.app.response;

import com.java.kundan.meetup.event.app.entity.EventVanue;

import lombok.Data;

@Data
public class EventVanueResponse {

	private EventVanue eventVenue;
	
	private EventResponse eventResponse;;
}

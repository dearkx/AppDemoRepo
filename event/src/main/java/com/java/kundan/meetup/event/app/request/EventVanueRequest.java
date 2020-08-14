package com.java.kundan.meetup.event.app.request;

import java.util.List;

import com.java.kundan.meetup.event.app.entity.Event;

import lombok.Data;

@Data
public class EventVanueRequest {
	
	
   private String eventPlace;
	
	private List<Event>event;
 
}

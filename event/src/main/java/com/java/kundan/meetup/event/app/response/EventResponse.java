package com.java.kundan.meetup.event.app.response;

import java.util.List;

import com.java.kundan.meetup.event.app.entity.Event;

import lombok.Data;

@Data
public class EventResponse {
	
	private Long eVid;
	private String eventPlace;
	private List<Event>event;
	
	

}

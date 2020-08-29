package com.java.user.app.entity;

import java.util.List;

public class EventResponse {

	//private Long eVid;
	private String eventPlace;
	private List<Event>event;
	

	/*public void seteVid(Long eVid) {
		this.eVid = eVid;
	}
	public Long geteVid() {
		return eVid;
	}*/
	public String getEventPlace() {
		return eventPlace;
	}
	public void setEventPlace(String eventPlace) {
		this.eventPlace = eventPlace;
	}
	public List<Event> getEvent() {
		return event;
	}
	public void setEvent(List<Event> event) {
		this.event = event;
	}
	
	
}

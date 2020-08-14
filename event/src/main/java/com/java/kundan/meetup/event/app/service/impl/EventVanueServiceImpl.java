package com.java.kundan.meetup.event.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.kundan.meetup.event.app.entity.Event;
import com.java.kundan.meetup.event.app.entity.EventVanue;
import com.java.kundan.meetup.event.app.repository.EventVanueRepository;
import com.java.kundan.meetup.event.app.request.EventVanueRequest;
import com.java.kundan.meetup.event.app.response.EventResponse;
import com.java.kundan.meetup.event.app.response.EventVanueResponse;
import com.java.kundan.meetup.event.app.service.EventVanueService;

@Service
public class EventVanueServiceImpl implements EventVanueService {

	@Autowired
	private EventVanueRepository eventRepository;

	@Override
	public EventResponse save(EventVanueRequest req) {
		EventVanue ev = new EventVanue();
		ev.setEventPlace(req.getEventPlace());

		List<Event> events = new ArrayList<>();
		if (!req.getEvent().isEmpty()) {
			List<Event> reqEvent = req.getEvent();
			for (Event event : reqEvent) {
				Event entity = new Event();
				entity.setDate(event.getDate());
				entity.setEventDescription(event.getEventDescription());
				entity.setEventName(event.getEventName());
				entity.setEventVanue(ev);
				events.add(entity);
			}
		}
		ev.setEvent(events);
		EventVanue eventV = eventRepository.save(ev);

		EventResponse er = new EventResponse();
		er.setEVid(eventV.getEVid());
		er.setEventPlace(eventV.getEventPlace());

		List<Event> event = eventV.getEvent();
		er.setEvent(event);
		return er;
	}

	
	@Override
	public EventVanueResponse findByEventPlace(String placeName) {
		EventVanue findByEventPlace = eventRepository.findByEventPlace(placeName);
		if (findByEventPlace != null) {
			EventVanueResponse response = new EventVanueResponse();
			response.setEventVenue(findByEventPlace);
			return response;
		}
		return null;
	}


	@Override
	public EventVanueResponse getEventById(Long id){
		EventVanue eventVenue = eventRepository.findById(id).get();
		EventVanueResponse res = new EventVanueResponse();
		res.setEventVenue(eventVenue);
		return res;
	}

}
package com.java.user.app.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.java.user.app.entity.EventResponse;

@FeignClient(name="EVENT")
public interface EventProxyService {
	
	@GetMapping("/event/{eventPlace}")
	public EventResponse getEventDetails(@PathVariable("eventPlace") String eventPlace);
	
	@GetMapping("/event/all")
	public List<EventResponse> getAllEvent();

}

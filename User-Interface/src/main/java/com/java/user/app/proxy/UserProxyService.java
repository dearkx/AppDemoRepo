package com.java.user.app.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.java.user.app.entity.User;

@FeignClient(name="meetup-app")
public interface UserProxyService {

	@GetMapping("meetup/username/{username}")
	public User	getUserDetails(@PathVariable("username")String userName);
		


			
}

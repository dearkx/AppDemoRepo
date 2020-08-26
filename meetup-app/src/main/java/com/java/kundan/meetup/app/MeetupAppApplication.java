package com.java.kundan.meetup.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MeetupAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeetupAppApplication.class, args);
		
	}

}

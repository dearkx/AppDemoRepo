package com.java.kundan.meetup.event.app.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.java.kundan.meetup.event.app.exception.EventNotFoundException;
import com.java.kundan.meetup.event.app.response.ErrorMessage;



@ControllerAdvice
public class EventExceptionHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler(EventNotFoundException.class)
	public ResponseEntity<ErrorMessage>handleEventNotFound(Exception e){
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorMessage("404",e.getMessage()));
	}

}

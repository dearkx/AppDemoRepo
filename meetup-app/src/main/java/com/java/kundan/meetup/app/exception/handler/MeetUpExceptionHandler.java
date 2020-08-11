package com.java.kundan.meetup.app.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import com.java.kundan.meetup.app.custom.exception.UserNotFoundException;
import com.java.kundan.meetup.app.response.ErrorMessage;



@ControllerAdvice
public class MeetUpExceptionHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ErrorMessage>handleMessageNotFound(Exception e){
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorMessage("404",e.getMessage()));
	}

}

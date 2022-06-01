package com.imr.course.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.imr.course.services.exceptions.DataBaseException;
import com.imr.course.services.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {

		@ExceptionHandler(ResourceNotFoundException.class)
		public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
			String ERROR = "Resource not found.";
			Integer STATUS =  HttpStatus.NOT_FOUND.value();
			
			StandardError es = new StandardError(Instant.now(), STATUS, ERROR, e.getMessage() , request.getRequestURI());
			
			return ResponseEntity.status(STATUS).body(es);
		}
		
		@ExceptionHandler(DataBaseException.class)
		public ResponseEntity<StandardError> resourceNotFound(DataBaseException e, HttpServletRequest request){
			
			String ERROR = "DataBase error.";
			Integer STATUS =  HttpStatus.BAD_REQUEST.value();
			
			StandardError es = new StandardError(Instant.now(), STATUS, ERROR, e.getMessage() , request.getRequestURI());
			
			return ResponseEntity.status(STATUS).body(es);
		}
	
}

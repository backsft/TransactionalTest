package com.TransactionalTest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	// Handle InvalidDataException
	@ExceptionHandler(InvalidDataException.class)
	public ResponseEntity<String> handleInvalidDataException(InvalidDataException ex) {
		// Return the exception message as the response body
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}

}

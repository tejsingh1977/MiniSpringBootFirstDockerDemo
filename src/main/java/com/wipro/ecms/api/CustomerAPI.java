package com.wipro.ecms.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerAPI {
		
	@GetMapping(value = "/customers")
	public ResponseEntity<String> getDockerMessage() {
		String strMessage = "Welcome to Docker Deployment Process Demo";		
		return new ResponseEntity<>(strMessage, HttpStatus.OK);
	}
	
	
}

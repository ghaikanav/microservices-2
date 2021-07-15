package com.project.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@GetMapping("/health")
	public String respond() {
		return "Hello from user service. Service is up"; 
	}
}

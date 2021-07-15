package com.project.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@GetMapping("/health")
	public String respond() {
		return "Hello from product service. Service is up"; 
	}
}

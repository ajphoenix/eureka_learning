package com.learning.eureka.helloserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServiceController {
	
	@GetMapping("/server/hello")
	public String hello() {
		System.out.println("in the server");
		return "Hello world I am here!!";
	}
	
}

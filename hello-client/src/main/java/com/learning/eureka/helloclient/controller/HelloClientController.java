package com.learning.eureka.helloclient.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloClientController {

//	@Autowired
//	@Qualifier("helloService1")
//	private WebClient webClient;

	@Autowired
	public RestTemplate restTemplate;

	@GetMapping("/client/hello")
	public String hello() {
		System.out.println("in the client");

//		ResponseSpec responseSpec = webClient.get().uri(uriBuilder -> uriBuilder.path("/server/hello").build())
//				.retrieve()
//				.onStatus(HttpStatus::is4xxClientError, response -> Mono.error(new RuntimeException("Error")));
//		return responseSpec.bodyToMono(String.class).block();

		URI uri = URI.create("http://hello-service1/server/hello");
		return this.restTemplate.getForObject(uri, String.class);

	}

}

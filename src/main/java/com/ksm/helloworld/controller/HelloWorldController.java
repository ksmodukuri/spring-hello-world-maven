package com.ksm.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	
	@GetMapping("/")
	public String helloworldRoot() {
		return "Hello World Root";
	}
	
	@GetMapping("/helloworld")
	public String helloworld() {
		return "Hello World";
	}

}

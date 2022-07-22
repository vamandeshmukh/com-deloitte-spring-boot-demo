package com.deloitte.spring.boot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

//	http://localhost:9999/hello

	@GetMapping("/hello")
	public String hello() {
		System.out.println("Hello");
		return "Hello world!";
	}

	@GetMapping("/hi")
	public String hi() {
		System.out.println("Hi");
		return "Hi there!";
	}
}

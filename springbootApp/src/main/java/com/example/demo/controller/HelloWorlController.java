package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class HelloWorlController {
	
	@RequestMapping("/")
	public String helloWorld() {
		return"<h1>Welcome<h1>";
		
	}
	
	
	

}

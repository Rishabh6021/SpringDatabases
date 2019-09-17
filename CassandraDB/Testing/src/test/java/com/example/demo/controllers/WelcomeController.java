package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Sp
public class WelcomeController {
	
	@GetMapping("/greet")
	public String getMessage()
	{
		return "Unit Testing";
	}

}

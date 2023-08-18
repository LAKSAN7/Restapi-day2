package com.example.demo.control;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day_2 {
	@Value("${var}")
	private String name;
	@GetMapping("/name")
	public String display() {
		return "I'm "+name;
	}

}
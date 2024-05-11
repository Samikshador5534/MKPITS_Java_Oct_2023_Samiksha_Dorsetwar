package com.mkpits.demo.DemoApplication.test;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyDemoController {

	@GetMapping
	public String getDetails() {
		return "hello good morning";
	}
	
}

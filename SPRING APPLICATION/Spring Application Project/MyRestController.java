package com.mkpits.spring.Spring.Application1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@GetMapping
	public String getData() {
		return"my spring application";
	}
}

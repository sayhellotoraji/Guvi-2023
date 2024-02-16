package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class RequestController {

	@GetMapping("/getdetail")
	public String getName() {
		return "Thiru";
	}
	
}

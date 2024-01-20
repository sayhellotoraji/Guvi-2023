package com.spring.eureka.provider.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-api")
public class PaymentController {
	
	@GetMapping("/payment/{price}")
	public String pay(@PathVariable int price) {
		return "Payment "+price+"is success";
	}

}

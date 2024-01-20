package spring.cloud.payment_client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payment_api")
public class PaymentController {

	@GetMapping("{price}")
	public String payment(@PathVariable int price) {
		return "Payment of " + price + " has been made.";
	}
}

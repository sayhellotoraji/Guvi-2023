package spring.cloud.order_client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("order_api")
public class OrderController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/{price}")
	public String invokePayment(@PathVariable int price) {
		String url = "http://localhost:8082/payment_api/" + price;
		return restTemplate.getForObject(url, String.class);
	}

}

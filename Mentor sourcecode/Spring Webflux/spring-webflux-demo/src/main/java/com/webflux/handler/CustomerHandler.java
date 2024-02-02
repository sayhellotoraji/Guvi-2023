package com.webflux.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.webflux.dao.CustomerDao;
import com.webflux.dto.Customer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerHandler {
	
	@Autowired
	private CustomerDao dao;
	
	
	public Mono<ServerResponse> loadCustomers(ServerRequest req) {
		Flux<Customer> customerList = dao.getCustomerList();
		return ServerResponse.ok().body(customerList, Customer.class);
	}
	
	public Mono<ServerResponse> loadCustomerById(ServerRequest req) {
		Integer customerId = Integer.valueOf(req.pathVariable("input"));
		Mono<Customer> customerMono = dao.getCustomerList().filter(c->c.getId() == customerId).next();
		return ServerResponse.ok().body(customerMono, Customer.class);
	}
	
	public Mono<ServerResponse> saveCustomer(ServerRequest req) {
		Mono<Customer> customerMono = req.bodyToMono(Customer.class);
		Mono<String> saveResponse = customerMono.map(dto->dto.getId()+" : "+dto.getName());
		return ServerResponse.ok().body(saveResponse, String.class);
	}
	
}

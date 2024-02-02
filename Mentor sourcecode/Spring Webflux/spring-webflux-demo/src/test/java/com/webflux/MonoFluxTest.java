package com.webflux;

import javax.management.RuntimeErrorException;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoFluxTest {

	@Test
	public void testMono() {
//		Mono<String> monoString = Mono.just("webflux").log();
		
		Mono<?> monoString = Mono.just("webflux")
		.then(Mono.error(new RuntimeException("Exception Occcured")))
		.log();
	//	monoString.subscribe(System.out::print);
		monoString.subscribe(System.out::println, (e)->System.out.println(e.getMessage()));
	}
	
	@Test
	public void testFlux() {
		Flux<String> fluxString = Flux.just("Spring", "SpringBoot", "Hibernate", "Microservice")
				.concatWithValues("AWS").
				concatWith(Flux.error(new RuntimeException("Exception Occured in Flux"))).log();
		fluxString.subscribe(System.out::println, (e)->System.out.println(e.getMessage()));
		
	}
	
}

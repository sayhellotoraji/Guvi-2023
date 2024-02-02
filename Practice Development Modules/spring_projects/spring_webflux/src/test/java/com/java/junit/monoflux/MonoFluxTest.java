package com.java.junit.monoflux;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoFluxTest {

	/*
	 * 2 Types in WebFlux 0 - 1 items: Mono, 1 - n items: Flux
	 */

	@Test
	public void testMono() {

		// Enable logging while creating mono instance
		Mono<String> monoString = Mono.just("Raja").log();

		// This doesn' t work because mono instance has already been created
		// monoString.log();

		// Subscribe to a publisher
		monoString.subscribe(System.out::println);
	}

	@Test
	public void testFlux() {

		// Enable logging while creating flux instance
		Flux<String> fluxString = Flux.just("Maha", "Mohan", "Raja").log();

		// This doesn' t work because flux instance has already been created
		// fluxString.log();

		// Subscribe to a publisher
		fluxString.subscribe(System.out::println);
	}
}

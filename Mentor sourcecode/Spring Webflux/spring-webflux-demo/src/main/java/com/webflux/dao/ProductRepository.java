package com.webflux.dao;

import org.springframework.data.domain.Range;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.webflux.dto.Product;

import reactor.core.publisher.Flux;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product, String> {

	Flux<Product> findByPriceBetween(Range<Double> priceRange);

}

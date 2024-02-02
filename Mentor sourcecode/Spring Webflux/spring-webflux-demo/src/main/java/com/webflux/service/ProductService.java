package com.webflux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Range;
import org.springframework.stereotype.Service;

import com.webflux.dao.ProductRepository;
import com.webflux.dto.Product;
import com.webflux.util.AppUtils;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Flux<Product> getProducts() {
		return productRepository.findAll().map(AppUtils::entityToDto);
	}
	
	public Mono<Product> getProduct(String id) {
		return productRepository.findById(id).map(AppUtils::entityToDto);
	}
	
	
	public Flux<Product> getProductInRange(double min, double max) {
		return productRepository.findByPriceBetween(Range.closed(min, max));
	}
	
	public Mono<Product> saveProduct(Mono<Product> productMono) {
		return productMono.map(AppUtils::dtoToEntity)
			.flatMap(productRepository::insert)
			.map(AppUtils::entityToDto);
	}
	
	
	public Mono<Product> updateProduct(Mono<Product> productMono, String id) {
		return productRepository.findById(id)
				.flatMap(p -> productMono.map(AppUtils::dtoToEntity))
				.doOnNext(e->e.setId(id))
				.flatMap(productRepository::save)
				.map(AppUtils::entityToDto);
	}
	
	public Mono<Void> deleteProduct(String id) {
		return productRepository.deleteById(id);
	}
	
	
}

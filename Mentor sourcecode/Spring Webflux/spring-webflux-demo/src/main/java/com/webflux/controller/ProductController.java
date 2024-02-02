package com.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webflux.dto.Product;
import com.webflux.service.ProductService;

import jakarta.annotation.PostConstruct;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/get-products")
	public Flux<Product> getProducts() {
		return productService.getProducts();
	}
	
	@GetMapping("/get-product/{id}")
	public Mono<Product> getProduct(@PathVariable String id) {
		return productService.getProduct(id);
	}

	@GetMapping("/product-range")
	public Flux<Product> getfindByPriceBetween(@RequestParam("min") double min, @RequestParam double max){
		return productService.getProductInRange(min, max);
		
	}
	
	@PostMapping("/save-product")
	public Mono<Product> save(@RequestBody Mono<Product> product) {
		return productService.saveProduct(product);
	}
	
	@PutMapping("/update-product")
	public Mono<Product> update(@RequestBody Mono<Product> product, @PathVariable String id) {
		return productService.updateProduct(product, id);
	}
	
	@DeleteMapping("/delete-product")
	public Mono<Void> delete(@PathVariable String id) {
		return productService.deleteProduct(id);
	}
	
}

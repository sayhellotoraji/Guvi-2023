package com.webflux.util;

import org.springframework.beans.BeanUtils;

import com.webflux.dto.Product;

public class AppUtils {

	
	public static Product entityToDto(Product product) {
		Product products = new Product();
		BeanUtils.copyProperties(product, products);
		return products;
	}
	
	public static Product dtoToEntity(Product product) {
		Product products = new Product();
		BeanUtils.copyProperties(product, products);
		return products;
	}
	
}

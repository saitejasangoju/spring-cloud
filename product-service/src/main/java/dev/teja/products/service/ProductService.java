package dev.teja.products.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import dev.teja.entities.Product;

@Service
public class ProductService {

	public List<Product> findAll() {
		Product iphone = Product.builder().name("iphone").id("123").price(50000.0).quantity(1).build();
		Product samsung = Product.builder().name("samsung").id("234").price(45000.0).quantity(1).build();
		return Arrays.asList(iphone, samsung);
	}

}

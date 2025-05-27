package dev.teja.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.teja.entities.Product;
import dev.teja.products.service.ProductService;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping
	public List<Product> findAll() {
		return productService.findAll();
	}
}

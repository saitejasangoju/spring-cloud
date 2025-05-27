package dev.teja.orders.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import dev.teja.entities.Product;

@FeignClient(name = "product-service")
public interface ProductClient {

	@GetMapping("/api/v1/products")
	List<Product> findAll();
}

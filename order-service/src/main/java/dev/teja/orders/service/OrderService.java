package dev.teja.orders.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.teja.entities.Order;
import dev.teja.entities.Product;
import dev.teja.orders.client.ProductClient;

@Service
public class OrderService {

	@Autowired
	private ProductClient productClient;

	public Order findById(String id) {
		List<Product> products = productClient.findAll();
		return Order.builder().id(id).products(products).build();
	}

}

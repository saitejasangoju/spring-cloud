package dev.teja.orders.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.teja.entities.Order;
import dev.teja.orders.service.OrderService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/{id}")
	@CircuitBreaker(name = "orderCircuitBreaker", fallbackMethod = "findOrdersById")
	public Order findById(@PathVariable String id) {
		return orderService.findById(id);
	}
	
	public Order findOrdersById(Throwable throwable) {
		return Order.builder().id("x").products(Arrays.asList()).build();
	}
	
    
}

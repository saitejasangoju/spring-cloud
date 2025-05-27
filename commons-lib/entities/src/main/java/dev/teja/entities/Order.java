package dev.teja.entities;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Order {

	private String id;
	private List<Product> products;
}

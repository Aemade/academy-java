package com.bptn.course._27_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Product{
	
	int id;
	String name;
	double price;
	
	Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	int getId() {
		return id;
	}

	String getName() {
		return name;
	}

	double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return String.format("Product [id=%s, name=%s, price=%s]", id, name, price);
	}
}

public class _01_StreamExample {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product(1,"HP Laptop", 25000));
		products.add(new Product(2,"Dell Laptop", 30000));
		products.add(new Product(3,"Lenovo Laptop", 28000));
		products.add(new Product(4,"Sony Laptop", 28000));
		products.add(new Product(5,"Apple Laptop", 90000));

		/*
		 * Statement:
		 * We need to create a list of prices that are less than 30,000
		 */
		
		/* Object Oriented Programming */
		
		List<Double> prices = new ArrayList<>();
		
		for (Product product : products) {
			
			if (product.getPrice() < 30_000) {
				prices.add(product.getPrice());
			}
		}
		
		System.out.println("OOP: " + prices);
		
		/* Functional Programming - Streams */
		
		// predicate -> boolean test(T t)
		// function -> R apply(T t)
		
		Optional<Double>  opt = products.stream()
				                     .filter(p -> p.getPrice() < 30_000)
				                     .map(Product::getPrice)
				                     .sorted()
				                     .findAny();
		
		
		System.out.println("price: " + opt.get());
		
		
		String str = null; // get the string from the DB;
		
		Optional<String> op = Optional.ofNullable(str);
		
		if ( op.isEmpty() ) {
			
			System.out.println("str is null");
		}
		
		
		
				           //.toList();

		//System.out.println("FP: " + prices);
	}

}

package com.bptn.course._25_lambdas._02_lambda_examples;

import java.util.ArrayList;
import java.util.List;

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

public class SortArrayList {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product(1,"HP Laptop", 25000));
		products.add(new Product(2,"Dell Laptop", 30000));
		products.add(new Product(3,"Lenovo Laptop", 28000));
		products.add(new Product(4,"Sony Laptop", 28000));
		products.add(new Product(5,"Apple Laptop", 90000));

		// int compare(T o1, T o2)

		//String str
		
		
		//products.sort( (a,b) -> Double.compare(a.getPrice(), b.getPrice()) );
		products.sort( (a,b) -> a.getName().compareTo(b.getName()) );
		
		
		
		System.out.println( products );
		
	}

}

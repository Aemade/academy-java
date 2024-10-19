package com.bptn.course._25_lambdas._02_lambda_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class PrintArrayList {

	public static void main(String[] args) {

		List<String> list  = new ArrayList<>(List.of("John","Jane", "Mike", "Lily"));
		
		/*
		for (String str: list) {
			System.out.println(str);
		}*/
	
		Consumer<String> consumer = str -> System.out.println(str); // Lambda
		
		list.forEach( consumer );

		//list.forEach(System.out::println);
		
	}

}

package com.bptn.course._10_interfaces.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class AbstractionExample {

	public static void main(String[] args) {

		ArrayList<String> strings = new ArrayList<>();
		
		strings.add("Hello");
		strings.add("I");
		strings.add("love");
		strings.add("coding");

		print(strings);
		
		LinkedList<String> strings2 = new LinkedList<>();
		
		strings2.add("Hello");
		strings2.add("I");
		strings2.add("love");
		strings2.add("coding");
		
		print(strings2);

		Vector<String> strings3 = new Vector<>();
		
		strings3.add("Hello");
		strings3.add("I");
		strings3.add("love");
		strings3.add("coding");
		
		print(strings3);
		
	}
	
	
	static void print(List<String> strings) {
		
		for (String string : strings) {
			System.out.println(string);
		}			
	}
	
	

}

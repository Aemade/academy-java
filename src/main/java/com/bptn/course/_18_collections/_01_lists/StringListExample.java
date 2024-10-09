package com.bptn.course._18_collections._01_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class StringListExample {

	public static void main(String[] args) {

		int[] array = { 1 ,2, 3 };
		
		//ArrayList<String> list = new ArrayList<String>();
		
		List<String> list = new ArrayList<>(1000);
		list.add("John"); // 0
		list.add("John"); // 1
		list.add("Jane"); // 2
		list.add("Mike"); // 3
		list.add("Pete"); // 4 
		list.add("Mike"); // 5
		
		
		List<String> list2 = new ArrayList<>(List.of("John", "Jane", "Mike"));
		
		List<Scanner> list3 = new ArrayList<>();
		
		System.out.println("list2: " + list2 );
		list2.remove("John");
		
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println(list.get(3));
		// Insert an element in the ArrayList
		list.add(2,"Nick");
		System.out.println(list);
		
		// Replace an element in the ArrayList  
		list.set(2,"Lily");
		System.out.println(list);
		
		System.out.println(list.indexOf("Mike"));
		list.remove("Mike");
		System.out.println(list);
	
		/*
		 * 1. Classic for-loop / C for-loop / Traditional for-loop
		 * 
		 */

		for (int i = 0; i < list.size(); i++) {
			//System.out.println(list.get(i));
		}
		
        /*
         * 2. for-each loop - Enhanced for-loop
         */
		
        for (String str : list) {
        	//list.remove(str);
			//System.out.println(str);
		}
        
        /*
         * 3. forEach() method - Using Lambda Expressions - Java 8
         */
        //list.forEach( str -> System.out.println(str) );
        
        /*
         * 4. Iterator
         * 
         * Iterators are useful when you want to remove elements from the
         * ArrayList while traversing. If you try to remove elements from
         * the arrayList using: traditional for-loop, for-each loop, or 
         * forEach() method, you will get ConcurrentModificationException.
         */
        
        ListIterator<String> ite = list.listIterator();
		
        List<String> list4 = new ArrayList<>();
        
        while (ite.hasNext()) { // Ask if the List has more elements
			String str = (String) ite.next(); // Jump to the next element
			
			if (str.startsWith("A")) {
				list4.add(str);
			}
			//System.out.println(str);	
		}
        
        System.out.println(list);
        
        Collections.shuffle(list);
        System.out.println(list);
       
        
	}

}

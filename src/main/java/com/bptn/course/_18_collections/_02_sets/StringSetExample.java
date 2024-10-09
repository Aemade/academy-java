package com.bptn.course._18_collections._02_sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StringSetExample {

	public static void main(String[] args) {

		//HashSet<String> list = new HashSet<String>();
		Set<String> set = new TreeSet<>();
		
		set.add("John");		
		boolean out = set.add("John");		
		set.add("Jane");		
		set.add("Mike");		
		set.add("Pete");		
		set.add("Mike");		

		System.out.println(set);
		System.out.println(set.size());
		System.out.println(out);
	
		Set<String> set1 = new HashSet<>(Set.of("John","Jane","Mike","Pete"));
		System.out.println(set1);
		set1.add("Nick");
		
		List<String> list = new ArrayList<>();
		list.add("John"); // 0
		list.add("John"); // 1
		list.add("Jane"); // 2
		list.add("Mike"); // 3
		list.add("Pete"); // 4 
		list.add("Mike"); // 5
		
		Set<String> set2 = new HashSet<>(list);
		System.out.println(set2);

		Set<String> set3 = new HashSet<>();
		set3.addAll(list);
		System.out.println(set3);
		
		System.out.println(set3.contains("Mike"));
		
		set3.remove("Mike");
	    System.out.println(set3);
	    
	    List<String> list1 = new ArrayList<>(List.of("John", "Jane", "Mike"));
	    List<String> list2 = new ArrayList<>(List.of("Nick", "Lily", "Tony"));
	    
	    list1.addAll(list2);
	    System.out.println(list1);
	    
        /*
         * Traversing HashSets
         * Iterating HashSets
         * Loop Over HashSets
         */	    
	    
        /*
         * 1. for-each loop - Enhanced for-loop
         */
		
        for (String str : set3) {
			//System.out.println(str);
		}
        
        /*
         * 2. forEach() method - Using Lambda Expressions - Java 8
         */
        //set3.forEach( str -> System.out.println(str) );

        /*
         * 3. Iterator
         * 
         * Iterators are useful when you want to remove elements from the
         * HashSet while traversing. If you try to remove elements from
         * the HashSet using: for-each loop, or 
         * forEach() method, you will get ConcurrentModificationException.
         */
        Iterator<String> ite = set3.iterator();
		
        while (ite.hasNext()) { // Ask if the List has more elements
			String str = (String) ite.next(); // Jump to the next element
			System.out.println(str);	
		}
        
	}

}

package com.bptn.course._18_collections._03_maps;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class IntegerMapExample {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new TreeMap<>();
		
		map.put(5, "John");  // Key = 5, value = "John
		map.put(6, "Jane");
		map.put(7, "Mike");
		map.put(8, "Lily");
		map.put(9, "Pete");
		
		map.put(9, "Robert"); // If the key already exists, It replaces the existing key value pair with the new one
		
		map.put(10, "Mike"); // Duplicate values are allowed
		map.put(1, "Carlos");
		map.put(2, "Hrithik");
		
//		System.out.println(map);
//		map.replace(6, "Brendan");
		
//		System.out.println(map);
//		map.replace(15, "Peter"); // Replace the key value pair if exist, else no changes made
		
		
		System.out.println(map);
		System.out.println(map.size());
		
		/*
		 * Search for a key
		 * Constant Time Performance
		 * All the searches take the same amount of time
		 */
		
		System.out.println(map.get(8)); // Return Lily
		System.out.println(map.get(20)); // returns null if the key doesn't exist
		
		
		/*
		 * Remove an entry using a key
		 */
		map.remove(9); // removes Robert
		System.out.println(map);
		
		/*
		 * Traversing Maps
		 * Iterating Maps
		 * Loop Over Maps
		 */
		
		/*
		 * 1.1. Using for-each loop using keySet()
		 *  (1,2,3,4,.. )
		 */
		     
		for (Integer key: map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		
		/*
		 * 1.2. for-each loop using entrySet()
		 * 
		 */
		
		for (Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		/*
		 * 2. forEach() method - Using Lambda Expression - As of Java 8
 		 */
		
		map.forEach( (k,v) -> System.out.println(k + ": " + v) ); 
	
		/*
		 * 3.1. Iterator using entrySet().iterator()
		 */
		
		Iterator<Entry<Integer, String>> ite = map.entrySet().iterator();
		
		while (ite.hasNext()) { // Ask if the iterator has more elements
			Entry<Integer, String> entry = ite.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
			
		}
		
		
		/*
		 * 3.2. Iterator using keySet()).iterator()
		 */
		
		Iterator<Integer> iter = map.keySet().iterator();
		
		while (iter.hasNext()) { // Ask if the iterator has more elements
			Integer key = iter.next();
			System.out.println(key + ": " + map.get(key));
			
		}

	}

}

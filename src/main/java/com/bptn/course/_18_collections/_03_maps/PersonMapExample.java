package com.bptn.course._18_collections._03_maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.bptn.course._18_collections.Person;

public class PersonMapExample {

	public static void main(String[] args) {
		
		Map<Integer, Person> map = new HashMap<>();
		
//		Person person = new Person(5, "John", 30);
		
		map.put(5, new Person(5, "John", 30));  // key = 5, value = Person(5, "John", 30)
		map.put(11, new Person(11, "Jane", 20));
		map.put(121, new Person(121, "Mike", 35));
		map.put(13, new Person(13, "Nick", 37));
		map.put(47, new Person(47, "Bill", 25));
		map.put(53, new Person(53, "Robert", 45));
		
//		map.put(60, new Person(53, "Robert", 45)); // Duplicate values are possible
		map.put(11, new Person(11, "Pete", 15)); // If a key already exists, the new value replaces the old one
		
		
		System.out.println(map);
		
		/*
		 * Remove an entry using a key.
		 */
		
		map.remove(13); // remove Nick
		System.out.println(map);
		
		/*
		 * Search for a key
		 * Constant Time Performance
		 * All the searches take the same amount of time
		 */
		
		System.out.println(map.get(47));
		
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
		
		for (Entry<Integer, Person> entry: map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		/*
		 * 2. forEach() method - Using Lambda Expression - As of Java 8
 		 */
		
		map.forEach( (k,v) -> System.out.println(k + ": " + v) ); 
		
		/*
		 * 3.1. Iterator using entrySet().iterator()
		 */
		
		Iterator<Entry<Integer, Person>> ite = map.entrySet().iterator();
		
		while (ite.hasNext()) { // Ask if the iterator has more elements
			Entry<Integer, Person> entry = ite.next();
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

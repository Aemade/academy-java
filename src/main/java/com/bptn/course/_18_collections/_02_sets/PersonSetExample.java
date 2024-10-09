package com.bptn.course._18_collections._02_sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.bptn.course._18_collections.Person;

public class PersonSetExample {

	public static void main(String[] args) {

		Set<Person> persons = new TreeSet<>();

		persons.add(new Person(1,"John",30)); 
		persons.add(new Person(1,"John",30)); 
		persons.add(new Person(2,"Jane",28)); 
		persons.add(new Person(3,"Mike",21)); 
		persons.add(new Person(4,"Pete",35)); 
		persons.add(new Person(3,"Mike",21)); 
		
		
		System.out.println(persons);
		System.out.println(persons.size());
		
		Set<Person> set1 = new HashSet<>(Set.of(new Person(1,"John",30),new Person(2,"Jane",28),new Person(3,"Mike",21)));
		System.out.println(set1);
		
		System.out.println(persons.contains(new Person(4,"Pete",35)));
		
		persons.remove(new Person(4,"Pete",35));
		System.out.println(persons);
		System.out.println(persons.size());
		
        /*
         * Traversing HashSets
         * Iterating HashSets
         * Loop Over HashSets
         */	    
	    
        /*
         * 1. for-each loop - Enhanced for-loop
         */
		
        for (Person p : persons) {
			//System.out.println(p);
		}
        
        /*
         * 2. forEach() method - Using Lambda Expressions - Java 8
         */
        //persons.forEach( p -> System.out.println(p) );

        /*
         * 3. Iterator
         * 
         * Iterators are useful when you want to remove elements from the
         * HashSet while traversing. If you try to remove elements from
         * the HashSet using: for-each loop, or 
         * forEach() method, you will get ConcurrentModificationException.
         */
        Iterator<Person> ite = persons.iterator();
		
        while (ite.hasNext()) { // Ask if the List has more elements
			Person str = (Person) ite.next(); // Jump to the next element
			System.out.println(str);	
		}
	}

}

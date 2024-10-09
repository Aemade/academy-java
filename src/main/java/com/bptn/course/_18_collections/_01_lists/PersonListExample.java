package com.bptn.course._18_collections._01_lists;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.bptn.course._18_collections.Person;

public class PersonListExample {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();
		
		persons.add(new Person(1,"John",30)); // 0
		persons.add(new Person(1,"John",30)); // 1 
		persons.add(new Person(2,"Jane",28)); // 2
		persons.add(new Person(3,"Mike",21)); // 3
		persons.add(new Person(4,"Pete",35)); // 4
		persons.add(new Person(3,"Mike",21)); // 5
		
		System.out.println(persons.size());

		System.out.println(persons.get(2));
		persons.add(3,new Person(5,"Nick",22));
		persons.set(3,new Person(6,"Lily",23));
		
		System.out.println(persons);
		System.out.println(persons.size());
		
		persons.remove(new Person(3,"Mike",21));
		
		System.out.println(persons);
		System.out.println(persons.size());
		System.out.println(persons.indexOf(new Person(6,"Lily",23)));
		
		
		/*
		 * 1. Classic for-loop / C for-loop / Traditional for-loop
		 * 
		 */

		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i));
		}
		
        /*
         * 2. for-each loop - Enhanced for-loop
         */
		
        for (Person p : persons) {
        	//list.remove(str);
			System.out.println(p);
		}
        
        /*
         * 3. forEach() method - Using Lambda Expressions - Java 8
         */
        persons.forEach( p -> System.out.println(p) );
        
        /*
         * 4. Iterator
         * 
         * Iterators are useful when you want to remove elements from the
         * ArrayList while traversing. If you try to remove elements from
         * the arrayList using: traditional for-loop, for-each loop, or 
         * forEach() method, you will get ConcurrentModificationException.
         */
        
        ListIterator<Person> ite = persons.listIterator();
		
        while (ite.hasNext()) { // Ask if the List has more elements
			Person p = (Person) ite.next(); // Jump to the next element
			ite.remove();
			//System.out.println(str);	
		}
	}

}

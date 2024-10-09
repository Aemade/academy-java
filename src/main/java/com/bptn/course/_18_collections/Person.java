package com.bptn.course._18_collections;

import java.util.Objects;

public class Person implements Comparable<Person>{

	// Java Bean - Model
	
	int id;
	String name;
	int age;
	
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return String.format("Person [id=%s, name=%s, age=%s]", id, name, age);
	}

	@Override
	public int compareTo(Person p) {
		// TODO Auto-generated method stub
		//return this.name.compareTo(p.getName());
		return p.getName().compareTo(this.name);
		//return Integer.compare(p.getId(),this.id);
	}


		
}

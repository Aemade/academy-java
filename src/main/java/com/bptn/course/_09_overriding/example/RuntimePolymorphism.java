package com.bptn.course._09_overriding.example;


class Animal{
	
	void sound() {
		System.out.println("Animal Sound");
	}
}

class Bird extends Animal{
	
	@Override
	void sound() {
		System.out.println("Bird Sound");
	}
}

class Dog extends Animal{
	
	@Override
	void sound() {
		System.out.println("Dog Sound");
	}
}

class Cat extends Animal{

	@Override
	void sound() {
		System.out.println("Cat Sound");
	}
}

public class RuntimePolymorphism {

	public static void main(String[] args) {

		
		Animal cat = new Cat();
		//cat.sound();
		
		
		String[] strings = new String[4];
		Animal[] animals = new Animal[4];
		
		
		animals[0] = new Bird();
		animals[1] = new Dog(); 
		animals[2] = new Cat();
		animals[3] = new Animal();
		
		
		for (Animal animal : animals) {
			animal.sound();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

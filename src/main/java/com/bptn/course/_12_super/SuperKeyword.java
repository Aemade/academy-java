package com.bptn.course._12_super;

/*
 * The super keyword is used to refer the immediate parent class.
 * We need inheritance to use the super keyword.
 * 
 * We can refer:
 * 
 * 1. Parent's Attributes
 * 2. Parent's Methods
 * 3. Parent's Constructors.
 * 
 */

//class Grandparent {
//    
//	Grandparent(String name) {
//        System.out.println("Grandparent constructor called with: " + name);
//    }
//	
//}



class Parent {
	
	String name = "Parent";
	
	Parent(String str){
		System.out.println("Parent constructor printing: " + str );
	}
	
	
	Parent(String str, int num){
		System.out.println("Parent constructor pring string: " + str + " and num: " + num);
	}
	
    Parent() {
        System.out.println("Parent constructor");
    }
    
    void doSomething() {
    	System.out.println("Parent is doing something");
    }
}

class Child extends Parent {
	
	String name = "Child";
	
	/*
	 * The Child must always call the parent constructor.
	 * It will try to call the default or no-arg parent constructor.
	 * If no default nor no-arg constructors exist in the parent then we
	 * need to manually specify in the child which parent constructor we 
	 * want to call. 
	 */
	
	Child(){
//		super(); // no arg-contructor or default constructor is implicitly called if super() is not used
//		super("Hello");
		super("Hello", 3);
		System.out.println("Child Constructor");
	}
	
	void display() {
		System.out.println(this.name);
		System.out.println(super.name);
		
	}
	
	
	@Override
	void doSomething() {
		System.out.println("Child is doing something");
		super.doSomething();
		
	}
	
	
	
	
}



public class SuperKeyword {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.display();
		child.doSomething();

	}

}

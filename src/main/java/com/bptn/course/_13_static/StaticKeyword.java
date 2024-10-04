package com.bptn.course._13_static;


/*
 * Static means that a member of class (attribute or method) belongs to the class
 * not to the instance.
 */



class MyClass{
	
	
	/*
	 * If a variable is static then it is shared across ALL the objects.
	 * Any change made to an static instance variable affects all the objects of
	 * the class. 
	 */
	static int num; // static
	
	String str; // non-static
	
	/*
	 * If a method is static then it belongs to the class, therefore it could be
	 * invoked directly using the class instead of an object.
	 * 
	 * The advantage of calling a method directly from a class is that you don't 
	 * need to create object (less code)
	 * 
	 * A method should be static when the logic inside the method depends only on 
	 * the parameters of the method and not on the attributes of the class. 
	 */
	
	static int addNumbers(int a, int b) {
		
		int x = 4;
		
		/*
		 * str = "Hello"; We cannot access non-static variables and non-static methods
		 * from a static methods.
		*/
		
		return a + b;
	}
	
	void print(int a, int b) {
		
		this.str = "";
		
		this.num = 4;
		
		/*
		 * We can access static attributes and methods from non-static methods
		 * 
		 * The reason is that the non-static method belongs to the object so if
		 * we want to access a static member (belongs to the class), Java knows
		 * exactly which class (there is just one class) 
		 */
		
		int hello = num;
		
		int sum = MyClass.addNumbers(a, b);
			
		
	}
	
	
}

class MyChild extends MyClass{
	
	void printChild(int a, int b) {
		
		int hello = num;
		
		int sum = MyClass.addNumbers(a, b);
		System.out.println("Sum: " + sum);
	}
	
	
}



public class StaticKeyword {
	
	public static void main(String[] args) {
		
		MyChild obj1 = new MyChild();
		obj1.num = 10;
		
		MyChild obj2 = new MyChild();
		obj2.num = 20;
		
		MyChild obj3 = new MyChild();
		obj3.num = 30;
		
		
		System.out.println(obj1.num);
		
		
		MyClass obj = new MyClass();
		System.out.println(MyClass.addNumbers(4, 7));
		
		StaticKeyword sk = new StaticKeyword();
		
//		StaticKeyword.hello();
		sk.hello();
		
		MyChild child = new MyChild();
		child.printChild(10,50);
		
		int sum = MyChild.addNumbers(10, 60);
		System.out.println("Sum: " + sum);
		
			
	}
	
	void printHello() {
		hello();
	}
	
	void hello() {
		System.out.println("Hello");
	}

}

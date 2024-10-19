package com.bptn.course._25_lambdas._01_lambda_basics;

/*
 * The functional interface annotation is an informative annotative (optional) used 
 * to express our intention to use the interface with a Lambda Expression.
 * 
 * The functional interface annotation is not mandatory but improves the code readability.
 * 
 * Also, the functional interface tells Java to check if your interface has just ONE 
 * abstract method. You can have: default and static methods, even constants in your
 * functional interface but ONLY one abstract method.
 */

@FunctionalInterface
interface Sayable{
	
	/*
	 * SAM Interface
	 * 
	 * We can only have ONE ABSTRACT METHOD in the functional interface.
	 * We can have as many default and static methods as we want.
	 */
	String say();
	
	default long say(long i) {
		return i * 10;
	}
}


@FunctionalInterface
interface Sayable2{
	
	String say(String str);
}

@FunctionalInterface
interface Addable {

	int add(int a, int b);
}

/*
class MyClass implements Sayable{

	@Override
	public String say() {
		return "I love Java";
	}	
}*/


public class LambdaExample {

	public static void main(String[] args) {

		/*
		 * 1. Lambda Expressions allow us to create anonymous methods.
		 * 2. Lambda Expressions allow us to the define the body of an 
		 *    interface's abstract method without a class that implements
		 *    the interface.
		 * 3. The Lambda Expression must be compatible with the interface's
		 *    abstract method. In other words the Lambda expression must have
		 *    the same number and type of parameters, and the same output type
		 *    as the interface's abstract method.
		 * 4. A Lambda Expression is comprised of:
		 *    1. Parameters
		 *    2. Arrow Token (constant)
		 *    3. Body   
		 * 
		 *       (parameters) -> { body }
		 */

		//Sayable obj = new MyClass();
		//System.out.println( obj.say() );

		Sayable obj2 = 	() -> {
			              return "I love Java";
		                };
		                
		System.out.println( obj2.say() );

		Sayable obj3 = 	() -> "I love Java";
		
		System.out.println( obj3.say() );
		
		Sayable2 obj4 = str -> "I love Java " + str;
		System.out.println( obj4.say("BPTN") );
		
		Addable obj5 = (a,b) -> {
			                       a = a * 2;
			                       return a + b;
							    };
		
		System.out.println( obj5.add(4, 7) );					    
		//hello();
				
				
	}
	
	
	static void hello() {
		
		Sayable obj2 = 	() -> {
            return "I love Java";
         };
		System.out.println( obj2.say() );
	}

}

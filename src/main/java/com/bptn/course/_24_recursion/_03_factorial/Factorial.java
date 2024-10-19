package com.bptn.course._24_recursion._03_factorial;

public class Factorial {

	static int num = 1;
	
	public static void main(String[] args) {

		factorial2(1);
		//System.out.println("Factorial Recursive (5): " + factorial2(5));
		System.out.println("Factorial Recursive 2 (1): " + num);
		System.out.println("Factorial Iterative (5): " + factorialIterative(5));
	}
	
	static int factorial(int n) {

		if (n==1) {
			return n;
		}
		
		return n * factorial(n-1);
	}

	static void factorial2(int n) {
		
		if (n==1) {
			return;
		}
		System.out.println(num + "  " + n);
		num = num * n;
		
		factorial2(n-1);
	}

	static int factorialIterative(int n) {
		
		// 5 x 4 x 3 x 2 x 1 
		// 1 x 2 x 3 x 4 x 5 

		int factorial = 1;

		for (int i = 1; i <= n ; i++) {
			
			//factorial = factorial * i;
			factorial *= i;
		}
		
		return factorial;
	}
	
	/*
	 *  We know that:
	 *  
	 *  base case: n=1 -> 1
	 *  
	 *   n! = n x (n - 1)!
	 *  
	 */
	
	// factorial 5 = 5 * factorial (4)
	// factorial 4 = 4 * factorial (3)
	// factorial 3 = 3 * factorial (2)
	// factorial 2 = 2 * factorial (1)
	// factorial 1 = 1

}

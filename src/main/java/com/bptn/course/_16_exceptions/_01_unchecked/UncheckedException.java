package com.bptn.course._16_exceptions._01_unchecked;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bptn.course._16_exceptions.HelloException;





public class UncheckedException {

	
	
	
	
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);

		
		/*
		 * It is recommended to use multiple catch-blocks or having multiple
		 * exceptions joined with the pipe (|) operator instead of catching just
		 * one Generic Exception.
		 * 
		 * The finally block is always executed. No matter what. And we use it to
		 * clean up resources.
		 */
		while(true) {
			
			try {
				System.out.println("Please input a whole number: ");
				
				int num = scan.nextInt();

				
				int res = 100 / num;
				
				if (res > 10) {
					
					throw new HelloException("Result cannot be greater than 10");
					
				}
				
				String str = "";
				str.length();
				
				System.out.println("The result is: " + res);
				
				break;
			}
			catch( NullPointerException | InputMismatchException | ArithmeticException ex ) {
				
				System.out.println("Execution " + ex.getMessage());
				ex.printStackTrace();
			}

			finally {
				System.out.println("Always executed");
				scan.nextLine();
			}
			
		}
		
		
		
		
		
		scan.close();
	}

}

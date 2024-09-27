package com.bptn.course._03_flow_control._03_if_statement;

public class IfStatement {

	public static void main(String[] args) {

			int a = 6;
			int b = 8;
			
			// Approach 1
			
			if ( a < b ) {
				//System.out.println("a is smaller than b");
			}
			else if ( a > b ) {
				//System.out.println("a is bigger than b");						
			}				
		
			else {
				//System.out.println("a is equal to b");			
			}

			// Approach 2
			
			if ( a < b ) {
				//System.out.println("a is smaller than b");
			}
			
			if ( a > b ) {
				//System.out.println("a is bigger than b");						
			}		
			
			if ( a == b ) {
				//System.out.println("a is equal to b");			
			}
			
			
			
			int x = 10;
			int y = 5;
			
			String str;
			
			if ( x > y ) {
				str = "x is bigger than y"; 
			}
			else {			
				str = "y is bigger or equal than x"; 
			}
			
			System.out.println(str);
			
			// Ternary operator (3 operands) operand1 ? operand2 : operand3
			
			
			str = ( x > y ) ? "x is bigger than y" : "y is bigger than x";
			
			System.out.println(str);
			
			
						
			
			
		}

	}

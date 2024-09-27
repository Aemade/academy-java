package com.bptn.course._03_flow_control._01_while_loop;

public class WhileLoop {

	public static void main(String[] args) {

		
		int cnt = 1;
		
		while (cnt<10) {
			
			if (cnt ==5) {
				break;
			}
			System.out.println(cnt);
			
			cnt = cnt + 1;
		}
		
		
		
		// do.. while
		/*
		 * With the do-while, the block of code is executed at least
		 * one time because the condition is evaluated after the execution.
		 */
		
		/*
		do {			
			System.out.println(cnt);
			cnt++; // cnt = cnt + 1;
		} while (cnt<10 || cnt>5);
		*/
		
	}

}

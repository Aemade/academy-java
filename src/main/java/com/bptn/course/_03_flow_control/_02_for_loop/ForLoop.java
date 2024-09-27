package com.bptn.course._03_flow_control._02_for_loop;

public class ForLoop {

	/*
	 * We use for loops to execute a block of code multiple times.
	 */
	
	public static void main(String[] args) {

		/*int cnt = 1;
		
		while (cnt<10) {
			System.out.println(cnt);
			cnt = cnt + 1;
		}*/
		
		
		for (int cnt = 1; cnt<10; cnt++) {
			
			if (cnt == 5) {
				continue;
			}
			System.out.println(cnt);			
		}
		
	}

}

package com.bptn.course._16_exceptions._02_checked;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Option1= Handle the exception
 * Option2= throw the exception up the caller
 */
public class CheckException {

	
	static void process() {
		
		
		// 1. Open the File
		// 2. Read the file line by line
		// 3. Close the File
		
		BufferedReader file = null;
		
		try {
			file = File.open("testfile.txt");
			
			String str = null;
			
			while((str = File.read(file))!= null) {
				System.out.println(str);
			}
			
			
		} 
		catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {			
			File.close(file);
		}
		
	}

	static void process2() throws FileNotFoundException, IOException{
		
		
		// 1. Open the File
		// 2. Read the file line by line
		// 3. Close the File
		
		BufferedReader file = null;
		

			file = File.open("testfile.txt");
			
			String str = null;
			
			while((str = File.read(file))!= null) {
				System.out.println(str);
			}
			
			File.close(file);

		
	}
	
	
	/*
	 * DON'tT DDDDDOOOOOOOOO THIS

	void process3() throws ArithmeticException  {
		
		int a = 4;
		int b = 0;
		
		try {
			int res = a / b;
			
		}
		catch(ArithmeticException ex) {
			
		}

	}	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		try {
			process2();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

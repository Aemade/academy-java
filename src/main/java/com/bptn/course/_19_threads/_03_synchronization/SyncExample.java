package com.bptn.course._19_threads._03_synchronization;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class MyThread extends Thread {

	List<Integer> list;
	
	MyThread(String name, List<Integer> list) {
		super(name);
		this.list = list;
	}

	@Override
	public void run() {
		System.out.println("Running: " + this.getName() + " - " + this.getState());

		//synchronized(list) {
			
			insertNextId(this.list);
			
		//}
				
		System.out.println("Exiting: " + this.getName() + " - " + this.getState());
	}
	
	static synchronized private void insertNextId(List<Integer> list) {
		
		int max = 0;
		
		for (int num : list) {
			
			if (num>max) {
				max = num;
			}
		}
		
		list.add(++max);		
	}
	
}

public class SyncExample {

	public static void main(String[] args) throws InterruptedException {

		String name = Thread.currentThread().getName();
		
		System.out.println("Running: " + name + " - " + Thread.currentThread().getState());
		System.out.printf("Running: %s - %s %n",Thread.currentThread().getName(), Thread.currentThread().getState());

		/* Shared List */ 
		List<Integer> list = new CopyOnWriteArrayList<>(List.of(5,1,4,3,6,2));
		
		MyThread t1 = new MyThread("T-1", list);
		System.out.println("Running: " + t1.getName() + " - " + t1.getState());

		MyThread t2 = new MyThread("T-2", list);
		System.out.println("Running: " + t2.getName() + " - " + t2.getState());
		
		System.out.println("List Before: " + list);

		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("List After: " + list);
		
		System.out.println("Running: " + Thread.currentThread().getName() + " - " + Thread.currentThread().getState());
		
	}

}

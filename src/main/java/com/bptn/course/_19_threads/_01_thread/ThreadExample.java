package com.bptn.course._19_threads._01_thread;

/*
 * We can create Threads in two ways:
 * 
 * 1. Extending the Thread class.
 * 2. Implementing the Runnable interface.
 */


class MyThread extends Thread {

	
	MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("Running: " + this.getName() + " - " + this.getState());

		for (int i = 0; i < 10; i++) {
			System.out.println("Running: " + this.getName() + " - " + this.getState() + " - " + i);
			
			try {
				Thread.sleep(400); /* The thread sleeps for 400 milliseconds */
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
				
		System.out.println("Exiting: " + this.getName() + " - " + this.getState());
	}	
}


public class ThreadExample {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Running: " + Thread.currentThread().getName() + " - " + Thread.currentThread().getState());

		MyThread t1 = new MyThread("T-1");
		System.out.println("Running: " + t1.getName() + " - " + t1.getState());

		MyThread t2 = new MyThread("T-2");
		System.out.println("Running: " + t2.getName() + " - " + t2.getState());
		
		/*
		 * To start the thread we must call the start() method and the start() method
		 * calls the run() method internally.
		 * 
		 * If we call the run() method directly, the thread is not started and the
		 * run() method is executed in the main thread.
		 */		
		t1.start();
		t2.start();
		
		System.out.println("Hello from main");
		
		/* The main thread to wait for the threads to finish */
		t1.join();
		t2.join();
		
		System.out.println("Ending: " + t1.getName() + " - " + t1.getState());
		System.out.println("Ending: " + t2.getName() + " - " + t2.getState());
		System.out.println("Running: " + Thread.currentThread().getName() + " - " + Thread.currentThread().getState());
	}

}

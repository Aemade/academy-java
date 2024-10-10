package com.bptn.course._19_threads._02_runnable;


class MyThread implements Runnable{

	/*
	 * The advantage of implementing the Runnable interface is that
	 * we still extend a class if we need to.
	 */
	@Override
	public void run() {

		System.out.println("Running: " + Thread.currentThread().getName() + " - " + Thread.currentThread().getState());

		for (int i = 0; i < 10; i++) {
			System.out.println("Running: " + Thread.currentThread().getName() + " - " + Thread.currentThread().getState() + " - " + i);
			
			try {
				Thread.sleep(400); /* The thread sleeps for 400 milliseconds */
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
				
		System.out.println("Exiting: " + Thread.currentThread().getName() + " - " + Thread.currentThread().getState());
		
	}
	
}

public class RunnableExample {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Running: " + Thread.currentThread().getName() + " - " + Thread.currentThread().getState());

		MyThread r1 = new MyThread();
		Thread t1 = new Thread(r1,"T-1");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("Running: " + t1.getName() + " - " + t1.getState());

		MyThread r2 = new MyThread();
		Thread t2 = new Thread(r2,"T-2");
		t2.setPriority(Thread.MIN_PRIORITY);
		
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
		
		
		/* The main thread to wait for the threads to finish */
		t1.join();
		t2.join();
		
		System.out.println("Ending: " + t1.getName() + " - " + t1.getState());
		System.out.println("Ending: " + t2.getName() + " - " + t2.getState());
		System.out.println("Running: " + Thread.currentThread().getName() + " - " + Thread.currentThread().getState());
	}

}

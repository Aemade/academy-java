package com.bptn.course._synchronization;

public class Main {
    
    public static void main(String[] args) {
        //#4 Creating instance
        SynchronizedPrinter printer = new SynchronizedPrinter();

        //#4.1 use same printer object in both threads
        MyThread t1 = new MyThread(printer);
        MyThread t2 = new MyThread(printer);

        //#4.2 start the threads t1 and t2
        System.out.println("Start thread1");
        t1.start();
        System.out.println("Start thread2");
        t2.start();
        
    }    
}

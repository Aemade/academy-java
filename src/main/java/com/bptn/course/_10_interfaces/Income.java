package com.bptn.course._10_interfaces;

/*
 * An Interface is a template where we declare (not define) methods that must
 * be implemented by a class.
 * 
 * By default all the methods in the interface are public abstract.
 */ 

interface Income {

	double calculatePay(double salary, double taxes);
	void doSomething();
	
	int getId();

	void setId(int id);
    /*
     * As of Java 8 - 2014
     * 
     * Default and Static methods in interfaces were created as a workaround to 
     * allow us to add new methods to old interfaces without breaking someone
     * else's code.
     * 
     * The default method can be overridden in the class implementing the interface
     * 
     * The default keyword indicates that we will implement the method in the 
     * interface.
     * 
     * We should only use this feature to avoid breaking someone else's
     * code (compilation)
     */
    
    default void doSomething2() {
    	System.out.println("Doing Something 2");
    }

    static void doSomething3() {
    	System.out.println("Doing Something 3");
    }
}

package com.bptn.course._17_solid._04_isp;

/*
interface Worker{
	void works();
	void eat();
}*/

interface WorkerRobot{
	void works();
}


class Robot implements WorkerRobot{

	@Override
	public void works() {
		
	}

	/*
	 * Robot must NOT implement the eat() method
	@Override
	public void eat() {
		
	}*/
	
}


public class InterfaceSegregation {

	public static void main(String[] args) {

	}

}

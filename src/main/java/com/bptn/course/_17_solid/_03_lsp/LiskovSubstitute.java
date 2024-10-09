package com.bptn.course._17_solid._03_lsp;

class Bird{
	
	
}

class BirdsThatFly extends Bird{
	
	void fly() {
		
	}
}

class BirdsThatDontFly extends Bird{
	

}

class Penguin extends BirdsThatDontFly {
	
}


public class LiskovSubstitute {

	public static void main(String[] args) {

		Penguin pen = new Penguin();
		
		doSomething(pen);
	}
	
	
	static void doSomething(BirdsThatDontFly btdf) {
		System.out.println("doSomething");
	}

}

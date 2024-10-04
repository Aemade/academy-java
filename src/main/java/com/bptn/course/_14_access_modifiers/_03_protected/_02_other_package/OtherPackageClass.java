package com.bptn.course._14_access_modifiers._03_protected._02_other_package;

import com.bptn.course._14_access_modifiers._03_protected._01_same_package.MyClass;

public class OtherPackageClass extends MyClass {

	public static void main(String[] args) {
		
		MyClass obj = new MyClass();
		
//		obj.num = 7;
//		obj.doSomething();
		
		OtherPackageClass obj2 = new OtherPackageClass();
		
		obj2.num = 7;
		obj2.doSomething();
		
		
		

	}

}

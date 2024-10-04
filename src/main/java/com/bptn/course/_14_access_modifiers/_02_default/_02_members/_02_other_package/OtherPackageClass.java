package com.bptn.course._14_access_modifiers._02_default._02_members._02_other_package;

import com.bptn.course._14_access_modifiers._02_default._02_members._01_same_package.MyClass;

public class OtherPackageClass {

	public static void main(String[] args) {
		
		MyClass obj = new MyClass();
		
//		obj.num = 8; // can't access num, since num has a default visibility
//		obj.doSomething(); 
		
//		obj.setNum(8);
//		obj.getNum();

	}
	

}

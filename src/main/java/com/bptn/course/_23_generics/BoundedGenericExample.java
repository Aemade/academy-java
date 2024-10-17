package com.bptn.course._23_generics;

import java.util.ArrayList;
import java.util.List;

class BoundedGenericClass<T extends Number>{   // T is a bounded parameter type which has to be a sub class of Number
	
	T data;

	BoundedGenericClass(T data) {
		this.data = data;
	}

	T getData() {
		return data;
	}

	void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "BoundedGenericClass [data=" + data + "]";
	}	
	
}


public class BoundedGenericExample {

	public static void main(String[] args) {
		
		BoundedGenericClass<Integer> obj1 = new BoundedGenericClass<>(20);
		System.out.println(obj1);
		
//		BoundedGenericClass<String> obj2 = new BoundedGenericClass<>("hello"); // Throws an error because Sting is not a sub-class of a Number.
//		System.out.println(obj2);
		
		BoundedGenericClass<Double> obj3 = new BoundedGenericClass<>(20.5);
		System.out.println(obj3);
		
		
		List<Integer> lst = new ArrayList<>();
		
		

	}

}

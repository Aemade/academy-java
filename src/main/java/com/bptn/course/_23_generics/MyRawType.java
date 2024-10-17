package com.bptn.course._23_generics;

import java.util.ArrayList;
import java.util.List;

class RawType<T>{
	
	T data;

	RawType(T data) {
		this.data = data;
	}

	T getData() {
		return data;
	}

	void setData(T data) {
		this.data = data;
	}
	

	
}


public class MyRawType {

	public static void main(String[] args) {
		
		RawType<Integer> obj1 = new RawType<>(1);
		
		RawType obj2 = new RawType("Hello");
		
		obj1 = obj2;
		
		System.out.println(obj1.getData());
		
		List<Object> list = new ArrayList<>();
		
		list.add(100);
		list.add("Hello");
		
		int sum = 0;
		for (Object obj: list) {
			
			sum += (Integer)obj;
			System.out.println(sum);
		}
		
		System.out.println(sum);
		
		

	}

}

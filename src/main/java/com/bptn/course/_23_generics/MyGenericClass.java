package com.bptn.course._23_generics;

/*
 * Generics enables types to be parameters when defining classes
 *
 * - By Convention when creating a generic Class, the generic type
 *   should be represented by a single upper case letter.
 *   
 *   E - element
 *   K - Key
 *   V - Value
 *   N - Number
 *   T - Type
 *   S, U, V, etc.
 */


class GenericClass<T>{
	
	T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}

class GenericDuoClass<S,U>{
	
	S data1;
	U data2;
	
	GenericDuoClass(S data1, U data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	S getData1() {
		return data1;
	}

	void setData1(S data1) {
		this.data1 = data1;
	}

	U getData2() {
		return data2;
	}

	void setData2(U data2) {
		this.data2 = data2;
	}

	@Override
	public String toString() {
		return "GenericDuoClass [data1=" + data1 + ", data2=" + data2 + "]";
	}
	
	
}


public class MyGenericClass {

	public static void main(String[] args) {
		
		GenericClass<Integer> obj1 = new GenericClass<>();
		GenericClass<String> obj2 = new GenericClass<>();
		GenericClass<Long> obj3 = new GenericClass<>();
		
		
		GenericDuoClass<String, Integer> obj4 = new GenericDuoClass<>("Hello",7);
		System.out.println(obj4);
		
		GenericDuoClass<Long, Integer> obj5 = new GenericDuoClass<>(15L,7);
		System.out.println(obj5);
		

	}

}

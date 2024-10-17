package com.bptn.course._23_generics;


class GenericClass2<T>{
	
	T data;
	

	GenericClass2(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}

class MyGenericUtil {
	
	static <T> boolean compare(GenericClass2<T> obj1, GenericClass2<T> obj2 ) {
		
		T data1 = obj1.getData();
		T data2 = obj2.getData();
		
		return data1.equals(data2);
		
	}
}



public class MyGenericMethodClass {

	public static void main(String[] args) {
		
		GenericClass2<String> obj1 = new GenericClass2<>("apple");
		GenericClass2<String> obj2 = new GenericClass2<>("orange");
		
		System.out.println(MyGenericUtil.compare(obj1, obj2));
		

	}

}

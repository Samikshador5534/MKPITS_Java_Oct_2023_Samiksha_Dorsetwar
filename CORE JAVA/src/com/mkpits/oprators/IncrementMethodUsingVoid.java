package com.mkpits.oprators;

public class IncrementMethodUsingVoid {
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value = 30;
		IncrementMethodUsingVoid obj = new IncrementMethodUsingVoid();
		obj.retnValue(value);
	}
	
	 //  System.out.println(obj.retnValue(obj.value));
	// we cannot print method if the method has void return type and it will shows error

	public void retnValue(int a) {
		
		//++a;
		System.out.println(a++);
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(a++);
	}
}


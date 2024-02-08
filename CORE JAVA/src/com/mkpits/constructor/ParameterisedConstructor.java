package com.mkpits.constructor;

public class ParameterisedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParameterisedConstructor constructor = new ParameterisedConstructor();
		System.out.println(constructor);
		
		ParameterisedConstructor constructor2 = new ParameterisedConstructor(45);
		
		ParameterisedConstructor constructor3 = new ParameterisedConstructor(677, 99);
		
		ParameterisedConstructor constructor4 = new ParameterisedConstructor(6, 67996.7f ,5);
		
		ParameterisedConstructor constructor5 = new ParameterisedConstructor(4954940950l, 03456, 56000, "sam");
		
		ParameterisedConstructor constructor6 = new ParameterisedConstructor(34.5f, 34);
	}

	public ParameterisedConstructor() {
		
	}
	
	public ParameterisedConstructor(int a) {
		System.out.println(a);
	}
	
	public ParameterisedConstructor(int a ,int b) {
		System.out.println(a+ " "+b );
	}
	
	public ParameterisedConstructor(float fees , int rollNo) {
		System.out.println(fees + "  "+ rollNo);
	}
	
	public ParameterisedConstructor(int no ,float value , int code) {
		System.out.println(no + " "+value + " "+code);
	}
	public ParameterisedConstructor(long a ,double b , int salary,String name) {
		System.out.println(a +" "+salary+" "+name+" "+b);
	}
}

package com.mkpits.method;

public class StaticMethod {

	static int a = 30;
	public int b = 40;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 20;              //local variable
		System.out.println(a);
		System.out.println(StaticMethod.a);   //static variable
	   
		StaticMethod s= new StaticMethod();
		System.out.println(s.b);
	}

}

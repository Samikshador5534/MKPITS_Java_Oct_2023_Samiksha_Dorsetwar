package com.mkpits.scopeofvariable;

public class StaticVariable {

	 static int carprice = 3000000;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	System.out.println(StaticVariable.carprice);
	getFirstName(); //direct access
	
	StaticVariable.getCode(); //classname.variablename
	
	StaticVariable variable = new StaticVariable();
	variable.getAdd(); // objectref.variablename
	

}
	public static void getFirstName() {
		String name = "samiksha";
		System.out.println("My First Name is :-"+name);
	}
	
	public static void getCode() {
		int a =45;
		System.out.println(a);
	}
	
	public static void getAdd() {
		int a=2;
		int b=2;
		int c= a+b;
		System.out.println(c);
	}
}
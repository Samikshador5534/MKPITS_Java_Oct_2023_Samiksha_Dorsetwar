package com.mkpits.methodoveriding;

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperClass_Overriding overriding;
		
		overriding=new SuperClass_Overriding();  //assigning the reference of super class type object
		overriding.getData(10, 20);
		overriding.getInput();
		
		overriding = new SubClassOverriding();  //assigning the reference of sub class type object
		overriding.getData(8, 2);
		overriding.getInput();
		
	}

}

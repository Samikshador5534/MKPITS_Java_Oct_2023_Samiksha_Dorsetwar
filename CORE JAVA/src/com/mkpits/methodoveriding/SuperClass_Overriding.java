package com.mkpits.methodoveriding;

public class SuperClass_Overriding {

	
	// If subclass (child class) has the same method as declared in the parent class
	// it is known as method overriding in Java
	
	//The method must have the same name as in the parent class
	//The method must have the same parameter as in the parent class
	
	
	int a , b ;
	
	public void getData(int a , int b) 
	{
		this.a = a;
		this .b = b;
	}
	
	public void getInput ()
	{
		int opt = a + b;
		System.out.println(" \n the value of a is :-"+a + " \n the value of b is :-"+b + " \n the output of a + b is :-"+opt);
	}
}

package com.mkpits.abstraction;

public class Abstraction_Example_Calling {

	public static void main(String[] args) 
	{
		Abstraction_Example  AE = new CircleAbstract("pink", 2.3);
		
		Abstraction_Example AE1 = new RectangleAbstraction("black", 2, 4);
		
		 System.out.println(AE.toString()); 
		 
		 System.out.println(AE1.toString()); 
	}

}

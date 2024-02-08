package com.mkpits.typecasting;

public class ObjectToPrimitiveCasting {

	public static void main(String[] args) {
		
  //It uses the Float.parseFloat method to convert the string value  to a floating-point number. 
  //The parseFloat method is a part of the Float class in Java and is used to convert a string to a float.
  //The converted float value is then assigned to the variable p
  //java provide a pre definied classes it is also called a wrapper classes		
		
		String price = "4569494";
		float p = Float.parseFloat(price);
		System.out.println(p);
		
		
  //The Integer.toString(a) method is used for this conversion.
  //The toString method is a static method of the Integer class in Java, and 
//it converts the integer value to its string representation.
		
		 int a = 45;
		    String s = Integer.toString(a);
		    System .out.println(s);
		    
		    
		 String input1 = "45";
		 String input2 = "45";
		 
	}
	
	
	    
}

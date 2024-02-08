package com.mkpits.typecasting;

public class PrimitiveToObjectCasting {

	public static void main(String[] args) {
		
		
		
	//Integer m = new Integer(pincode);
	//This line creates a new instance of the Integer class using the new keyword
	// The Integer class is a wrapper class in Java that wraps an int value into an object.
	//The pincode value is used as an argument to the constructor of the Integer class to create an Integer object
		
		int pincode = 56478;
		Integer m = new Integer(pincode);
		System.out.println(m);

		char name = 'd';
		Character output = new Character(name);
		System.out.println(name);
		
		boolean b = false;
		Boolean op = new Boolean(b);
		System.out.println(op);
		
		
		float f = 789.45f;
		Float ans = new Float(f);
		System.out.println(ans);
		
		
		double d = 456789.23;
		Float e = new Float(d);
		System.out.println(e);
		
		short a = 45;
		
	    Short s =  new Short(a);
	    System .out.println(s);

	    long l = 67899543l;
	    Long v = new Long(a);
	    System.out.println(v);
	    
	    int as = 34;
	    short n = (short)as;
	    System.out.println(n);
	}

}

package com.mkpits.typecasting;

public class PrimitiveExplicitCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//we cannot assign a value a int type variable to short type and  byte type variable 
		// so that we must have to use explicit casting 
		 // it is also called as narrowing conversion
		
	    int pincode = 68;
		byte output = (byte)pincode;
		System.out.println(output);
		
		byte no=56;
		int yes = (int)no;
		System.out.println(yes);
		
		
		
		long mobileNo = 45854984893l;
		long ans = (long)mobileNo;
		System.out.println(ans);
		
		
		short a =20 , b = 20;
		short c = (short)(a+b);
		System.out.println(c);
		
		int p = 902;
		char ch = (char)p;
		System.out.println(ch);
	
		String   s = "f" ;
		String  m = (String)(s);
		System.out.println(s);
		
		
		short ui = 124;
		char v = (char)ui;
		System.out.println(v);
		
		
		
		
				}

}

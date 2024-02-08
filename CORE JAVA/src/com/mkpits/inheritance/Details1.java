package com.mkpits.inheritance;

public class Details1 extends ChildDetails {

 int Pincode;
 
 protected int getPincode(int Pincode)
	{
		this.Pincode = Pincode;
		System.out.println("pincode no is :-"+Pincode);
		return Pincode;
	}
	 
}

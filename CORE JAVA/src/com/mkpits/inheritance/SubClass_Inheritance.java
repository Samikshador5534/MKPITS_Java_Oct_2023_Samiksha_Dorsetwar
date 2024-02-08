package com.mkpits.inheritance;



public class SubClass_Inheritance extends Super_Single_Inheritance {

	String gender;
	long mobile;
	int pincode;
	
	public void getGender(String gender) 
	{
	
		this.gender = gender;
	}
	
	public void getMobile (long mobile)
	{
	
		this.mobile=mobile;
		
	}
	
	public void getPincode(int pincode)
	{
		this.pincode=pincode;
	}
	public void getDetails() 
	{
		System.out.println("First name is :-"+fName);
		System.out.println("last name is :-"+lName);
		System.out.println("email is :-"+email);
		System.out.println("Gender is :-"+gender);
		System.out.println("Mobile no is :-"+mobile);
		System.out.println("pincode no is :-"+pincode);
		
		
	}
	
}

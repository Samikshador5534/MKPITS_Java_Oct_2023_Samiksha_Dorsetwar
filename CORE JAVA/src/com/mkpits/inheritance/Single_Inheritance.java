package com.mkpits.inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Single_Inheritance {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
           
		SubClass_Inheritance inheritance = new SubClass_Inheritance();
		
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	 

		 
		 System.out.println("enter a first name");
		 String fName =reader.readLine();
		 inheritance.getFirstName(fName);
		 
		 System.out.println("enter a last name");
		 String lName =reader.readLine();
		 inheritance.getLastName(lName);
		 
		 
		 System.out.println("enter a email");
		 String email =reader.readLine();
		 inheritance.getEmail(email);
		 
		 System.out.println("enter a gender");
		 String gender =reader.readLine();
		 inheritance.getGender(gender);
		 
		 System.out.println("enter a mobile no");
		 inheritance.mobile = Long.parseLong(reader.readLine());
		 
		 System.out.println("enter a pincode is ");
		 int pincode = Integer.parseInt(reader.readLine());
		 inheritance.getPincode(pincode);
		
		 
		 inheritance.getDetails();
		 
		 
	}

	
}


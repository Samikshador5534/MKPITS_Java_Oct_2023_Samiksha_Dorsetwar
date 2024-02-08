package com.mkpits.user_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RegistrationForm {
	
	String firstName,lastName,email , passWd;
	char gender;
	int age;
	long mobileNo;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		RegistrationForm form = new RegistrationForm();
		form.registration();
		
		
		System.out.println("Enter a First Name is :-"+form.firstName );
		System.out.println("Enter a long Name is :-"+form.lastName );
		System.out.println("Enter a email is :-"+form.email );
		System.out.println("Enter a gender is :-"+form.gender );
		System.out.println("Enter a age is :-"+form.age );
		System.out.println("Enter a mobileNo is :-"+form.mobileNo );
		System.out.println("Enter a password  is :-"+form.passWd );
		
	}

	public void registration() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a First Name");
		this.firstName = reader.readLine();
		
		System.out.println("Enter a last Name");
		this.lastName = reader.readLine();
		
		System.out.println("Enter a email");
		this.email = reader.readLine();
		
		System.out.println("Enter a gender");
		this.gender =(char) reader.read(); // char has to type cast first then objectname.readline
     	reader.readLine();
		
		System.out.println("Enter a age");
		this.age = Integer.parseInt(reader.readLine());
		
		System.out.println("Enter a mobile no");
		this.mobileNo = Long.parseLong(reader.readLine());
		
		System.out.println("Enter a password");
		this.passWd = reader.readLine();
	}
}

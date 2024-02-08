package com.mkpits.user_input;

import java.io.IOException;

public class RegistrationCalling {

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

}

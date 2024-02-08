package com.mkpits.method;

public class DeclareMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DeclareMethod.getFirstName();
		//DeclareMethod.getLastName();
		//DeclareMethod.getEmail();
		//DeclareMethod.getMobile();
		//DeclareMethod.getGender();
		//DeclareMethod.getPassword();
		
		//If method is defined using static keyword then it is called static method
		
		DeclareMethod getAllData = new DeclareMethod();
		 getAllData.getFirstName();
		 getAllData.getLastName();
		 getAllData.getEmail();
		 getAllData.getMobile();
		 getAllData.getGender();
		 getAllData.getPassword();
		
	}
	
	

	public static void getFirstName() {
		String name = "samiksha";
		System.out.println("My First Name is :-"+name);
	}
	
	public static void getLastName() {
		String lastname = "Dorsetwar";
		System.out.println("My Last Name is :-"+lastname);
	}
	public static void getEmail() {
		String email = "paidlewarsamiksha@gmail.com";
		System.out.println("Email is :-"+email);
	}
	public static void getMobile() {
		long mobileno = 43567678;
		System.out.println("Mobile no is :- "+mobileno);
		
	}
	public static void getGender() {
		String gender = "female";
		System.out.println("Gender is :-"+gender);
	}
	public static void getPassword() {
		int passwd = 4567;
		System.out.println("Password is :-"+passwd);
	}
	
}

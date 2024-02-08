package com.mkpits.method;

public class MethodWithReturnType2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodWithReturnType2 User =new MethodWithReturnType2();
		User.getAllData();
		
	}

	    public void getAllData() {
		System.out.println("The Above List is :- ");
		System.out.println(getFirstName());
		System.out.println(getLastName());
		System.out.println(getEmail());
		System.out.println(getMobile());
		System.out.println(getGender());
		System.out.println(getPassword());
		
	}
	public static String getFirstName() { 
		String name = "samiksha";
		return name;
	}
	
	public static String getLastName() {
		String lastname = "Dorsetwar";
		return lastname;
	}
	public static String getEmail() {
		String email = "paidlewarsamiksha@gmail.com";
		return email;
	}
	public  static long getMobile() {
		long mobileno = 43567678;
		return mobileno;
		
	}
	public static String getGender() {
		String gender = "female";
		return gender;
	}
	public  static int getPassword() {
		int passwd = 4567;
		return passwd;
	}
	
}

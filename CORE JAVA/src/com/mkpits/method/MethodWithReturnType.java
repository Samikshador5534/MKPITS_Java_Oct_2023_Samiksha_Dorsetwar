package com.mkpits.method;

public class MethodWithReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodWithReturnType User = new MethodWithReturnType();
		System.out.println(User.getFirstName());
		System.out.println(User.getLastName());
		System.out.println(User.getEmail());
		System.out.println(User.getMobile());
		System.out.println(User.getGender());
		System.out.println(User.getPassword());
	
	}

	public  String getFirstName() {
		String name = "samiksha";
		return name;
	}
	
	public String getLastName() {
		String lastname = "Dorsetwar";
		return lastname;
	}
	public String getEmail() {
		String email = "paidlewarsamiksha@gmail.com";
		return email;
	}
	public long getMobile() {
		long mobileno = 43567678;
		return mobileno;
		
	}
	public String getGender() {
		String gender = "female";
		return gender;
	}
	public int getPassword() {
		int passwd = 4567;
		return passwd;
	}
	
	
}

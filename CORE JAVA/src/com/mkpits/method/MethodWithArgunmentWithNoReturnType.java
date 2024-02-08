package com.mkpits.method;

public class MethodWithArgunmentWithNoReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName= "samiksha";
		String lastName = "Dorsetwar";
		String email = "paidlewarsamiksha@gmail.com";
		String passWd = "sami@123";
		String gender = "female";
		long mobileNo = 347346765763l;
		
		
		MethodWithArgunmentWithNoReturnType user = new MethodWithArgunmentWithNoReturnType();
		user.getfirstName(firstName);
		user.getlastName (lastName);
		user.getemail(email);
		user.getpassWd(passWd);
		user.getgender(gender);
		user.getmobileNo(mobileNo);
		
	}

	public void getmobileNo(long mobileNo) {
		// TODO Auto-generated method stub
		System.out.println(mobileNo);
	}

	public void getgender(String gender) {
		// TODO Auto-generated method stub
		System.out.println(gender);
	}

	public void getpassWd(String passWd) {
		// TODO Auto-generated method stub
		System.out.println(passWd);
	}

	public void getemail(String email) {
		// TODO Auto-generated method stub
		System.out.println(email);
	}

	public void getlastName(String lastName) {
		// TODO Auto-generated method stub
		System.out.println(lastName);
	}

	public void getfirstName(String firstName) {
		// TODO Auto-generated method stub
		
		System.out.println(firstName);
	}

	
}

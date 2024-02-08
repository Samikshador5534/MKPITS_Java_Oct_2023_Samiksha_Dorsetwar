package com.mkpits.methodoverloading;

public class ThisDemoMethod {

	
	String employeeName;
	int customerId;
	long mobileNo;
	char gender;
	
	public static void main(String[] args) {
		ThisDemoMethod method= new ThisDemoMethod("SAMIKSHA", 5, 5656777757l, 'f');
		System.out.println("employee name is :-"+method.employeeName);
		System.out.println("customer id is :-"+method.customerId);
		System.out.println("mobile no is :-"+method.mobileNo);
		System.out.println("gender is :-"+method.gender);
	}
	
	
	
	
	public ThisDemoMethod (String  employeeName , int customerId ,long mobileNo,char gender) {
	    this.employeeName=employeeName;
		this.customerId=customerId;
		this.mobileNo=mobileNo;
		this.gender=gender;

	}


	public String getEmployeeName()
	{
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public long getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}

}

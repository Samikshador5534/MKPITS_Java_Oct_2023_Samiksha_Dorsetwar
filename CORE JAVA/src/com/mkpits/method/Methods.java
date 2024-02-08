package com.mkpits.method;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int code = 4567;
		
		getPincode();
		Methods.getCity();
		Methods MD = new Methods();
		MD.getGender();
		MD.getColour();
		MD.getCode(code);
		System.out.println("Time is :- " +MD.getTime());
		
		String uValue = MD.getDetails(1,10000);
		System.out.println(uValue);
		
	}

//static method using direct access
	
	public static void getPincode() {
	int pincode = 3449439;
	System.out.println(pincode);
	}
	
//static method using classname.methodname
	
	public static void getCity() {
	String city = "Nagpur";
	System.out.println("city is :-"+city);
		
	}
	
//static method using objectref.methodname by using instances
	
	public  static void getGender() {
		char gender = 'f';
		System.out.println("gender is :-"+gender);
	}
	
//Non static method by using instances and objectref
	
	public  void getColour() {
		String colour = "pink";
		System.out.println("colour is :- "+colour);
	}
	
//static method with argunment and no return type
	
	public   static void getCode(int code) {
		System.out.println("code is :- "+code);
	}
	
//static method using return type
	
	public static  String getTime() {
		String time = "12pm";
		return time;
	}
//static method with return type and argunment
	
	private String getDetails(int id, double salary) {  // parameter
		// TODO Auto-generated method stub
		double incentive = salary + (salary*0.1);
		String details = "Id is :-"+id +"  salary with incentive is :-"+incentive;
		return details;
	}
		
	}
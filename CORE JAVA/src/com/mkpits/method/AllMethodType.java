package com.mkpits.method;

public class AllMethodType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		long mobileNo = 347346765763l;
		
		AllMethodType user = new AllMethodType();
		
		//classname.variablename
        //direct access
		
		user.getFirstName();
		
		////method with argunment with no return type
		
		user.getmobileNo(mobileNo);
		
		//method with return type
		
		System.out.println(user.getLastName());
		
		
		//method with return type and argunment
		String uValue = user.getDetails(1,10000);
		System.out.println(uValue);
	}
	
	
 //  classname.variablename
//    direct access
	
	
	public static void getFirstName() {
		String name = "samiksha";
		System.out.println("My First Name is :-"+name);
	}
	
	//method with argunment with no return type
	
	
	public void getmobileNo(long mobileNo) {
		// TODO Auto-generated method stub
		System.out.println(mobileNo);
	}
	
	// method with return type
	
	public  String getLastName() {
		String name = "paidlewar";
		return name;
	}
	
	//method with return type and argunment
	
	
	public String getDetails(int id, double salary) {  // parameter
		// TODO Auto-generated method stub
		double incentive = salary + (salary*0.1);
		String details = "Id is :-"+id +"  salary with incentive is :-"+incentive;
		return details;
	}

}

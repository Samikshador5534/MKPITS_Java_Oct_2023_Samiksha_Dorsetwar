package com.mkpits.method;

public class MethodWithReturnTypeAndArgunment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//method with return type and argunment
		
		

		MethodWithReturnTypeAndArgunment user = new MethodWithReturnTypeAndArgunment();
		String uValue = user.getDetails(1,10000);
		System.out.println(uValue);
		String vValue = user.getDetails(2, 11000);     //Argunment
		System.out.println(vValue);
		String xValue = user.getDetails(3, 12000);
		System.out.println(xValue);
		String zValue = user.getDetails(4, 13000.50);
		System.out.println(zValue);
	}

	private String getDetails(int id, double salary) {  // parameter
		// TODO Auto-generated method stub
		double incentive = salary + (salary*0.1);
		String details = "Id is :-"+id +"  salary with incentive is :-"+incentive;
		return details;
	}

}

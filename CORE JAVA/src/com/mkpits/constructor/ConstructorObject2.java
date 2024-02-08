package com.mkpits.constructor;

public class ConstructorObject2 {

	String city = "sssa";
	long mobileNo = 373478783l;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorObject2 object = new ConstructorObject2();
		object.getMultiplication(12, 2);
		
		ConstructorObject2 object2 = new ConstructorObject2("samiksha",47858696853l);
		object2.getMultiplication(4, 4);
		
		ConstructorObject2 object3 = new ConstructorObject2(object2);
		object3.getMultiplication(2, 2);
		
	}
		

	public void getMultiplication( int a , int b)
	{
		int c = a * b;
		System.out.println("ouput is :-"+c);
	
    }
	
	public ConstructorObject2() {
		String city = "nagpur";
		long mobileNo = 49585555696896l;
		System.out.println("constructor with argunment");
		System.out.println("city is :-"+city + "  "+ "mobile no is :- "+mobileNo);
		
	}

	
	public ConstructorObject2( String i ,long j ) {
		city = i;
		mobileNo = j;
		System.out.println("parametrized with argunment");
		System.out.println("city is :-"+city + "  "+ "mobile no is :- "+mobileNo);
	}
	
	public ConstructorObject2(ConstructorObject2 p) {
		System.out.println("constructor with object");
		city = p.city;
		mobileNo = p.mobileNo;
		//object3.getMultiplication(2,3);
	}
}
    
	
		

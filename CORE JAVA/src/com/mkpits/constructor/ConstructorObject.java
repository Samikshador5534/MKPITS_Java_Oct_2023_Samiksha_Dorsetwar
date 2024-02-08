package com.mkpits.constructor;

public class ConstructorObject {
  
	
	int pincode ,salary;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorObject object = new ConstructorObject();
		
		ConstructorObject object2 = new ConstructorObject(33444,66600);
		
		ConstructorObject object3 = new ConstructorObject(object);
		object.getDetails();
		object2.getDetails();
		object3.getDetails();
	}

	public void getDetails() {
		
		System.out.println("pincode: "+pincode+", salary: "+salary );
	}
	public ConstructorObject() {
		 pincode = 441001;
		 salary = 45000;
		System.out.println("constructor with no argunment");
	}
	
	public ConstructorObject(int i ,int j) {
		pincode= i;
		salary = j;
		System.out.println("parametirized constructor with argunment");
	
}
	public ConstructorObject(ConstructorObject p) {
		System.out.println("constructor with object");
		 pincode=p.pincode;
		 
		 salary = p.salary;
	}
}
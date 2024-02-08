package com.mkpits.methodoverloading;

public class ThisDemo {
	
	String fname= "samiksha";
	int code = 48748;                 //global variable
	long mobileNo;
	int id,passWd;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String fname= "sam";
		ThisDemo demo = new ThisDemo();
		demo.fName();
		demo.code();
		demo.mobileNo(45747375753l);
		demo.getData(23,678);
		System.out.println("                       ");
		
		
		
		System.out.println("this is the calling method of ThisDemoMethod class using getter n setter ");
		ThisDemoMethod  method =new ThisDemoMethod("aatish", 2, 34637647365l, 'f');
		System.out.println(method.getEmployeeName());
		System.out.println(method.customerId);
		System.out.println(method.mobileNo);
		
		
		method.setEmployeeName("samiksha");
		System.out.println(method.getEmployeeName());
		
	}

	private void getData(int i, int j) {
		// TODO Auto-generated method stub
		this.id = i;
		this.passWd = j;
		System.out.println("id is :-"+id);
		System.out.println("password is :-"+passWd);
		
	}

	private long mobileNo(long i) {
		// TODO Auto-generated method stub
		this.mobileNo = i;
		System.out.println("mobile no is :-"+mobileNo);
		return mobileNo;
	}

	private int code() {
		this.code = code;
		System.out.println("code is :-"+code);
		return code;
		
	}

	private String fName() {
		this.fname = fname;
		System.out.println("first name is :-" +fname);
		return fname;
		
	}
	

}

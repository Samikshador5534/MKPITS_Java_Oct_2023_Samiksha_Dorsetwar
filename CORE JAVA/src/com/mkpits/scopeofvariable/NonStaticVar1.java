package com.mkpits.scopeofvariable;

public class NonStaticVar1 {

	public int pincode = 441002;
	public char name = 's';
	public float salary = 23000f;
	public long number = 457463663l;
	public short code = 4576;
	public boolean isActive = true;
	public byte no = 45;
	public double no2 = 234.567;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonStaticVar1 var = new NonStaticVar1();
		System.out.println("pincode is :-"+var.pincode);
		System.out.println("city name is :-"+var.name);
		System.out.println("salary is :-"+var.salary);
		System.out.println("the mobile number is :-"+var.number);
		System.out.println("city code is :-"+var.code);
		System.out.println(var.isActive);
		System.out.println("byte no is :-"+var.no);
		System.out.println("the roll no is :-"+var.no2);
		var.getFirstName();
	}

	public void getFirstName() {
		String name = "samiksha";
		System.out.println("My First Name is :-"+name);
	}
}

package com.mkpits.scopeofvariable;

public class NonStaticVariable {

	public int pincode;
	public char name;
	public float salary;
	public long number;
	public short code;
	public boolean isActive;
	public byte no;
	public double no2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonStaticVariable var = new NonStaticVariable();
		System.out.println("pincode is :-"+var.pincode);
		System.out.println("city name is :-"+var.name);
		System.out.println("salary is :-"+var.salary);
		System.out.println("the mobile number is :-"+var.number);
		System.out.println("city code is :-"+var.code);
		System.out.println(var.isActive);
		System.out.println("byte no is :-"+var.no);
		System.out.println("the roll no is :-"+var.no2);
	}

}
package com.mkpits.oprators;

public class All_Arithematic_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		All_Arithematic_Operator operator = new All_Arithematic_Operator();
		operator.addition_Of_Two_No();
		operator.substraction_Of_Two_No();
		operator.multiplication_Of_Two_No();
		operator.division_Of_Two_No();
		operator.modulas_Of_Two_No();
	}

	public void addition_Of_Two_No() {
	     int num1 = 25;
	     int num2 = 25;
	     int Total = num1+num2;
	     System.out.println("Addition of two no is :-"+Total);
	}
	
	public void substraction_Of_Two_No() {
		float num1 = 35.50f;
		float num2 = 25.50f;
		float Total_value = num1-num2;
		System.out.println("substraction of two no is :-" +Total_value);
		
	}

	public void multiplication_Of_Two_No() {
		int num1 = 30;
		float num2 = 20;
		float Total_value = num1*num2;
		System.out.println("multiplication of two no is :-" +Total_value);
		
	}
	
	public void division_Of_Two_No() {
		int num1 = 60;
		float num2 = 20;
		float Total_value = num1/num2;
		System.out.println("multiplication of two no is :-" +Total_value);
		
	}
	
	public void modulas_Of_Two_No() {
		int num1 = 100;
		float num2 = 50;
		float Total_value = num1%num2;
		System.out.println("modulus  of two no is :-" +Total_value);
		
	}
	
	
}

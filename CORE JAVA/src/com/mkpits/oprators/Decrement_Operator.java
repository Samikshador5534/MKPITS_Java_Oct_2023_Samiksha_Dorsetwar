package com.mkpits.oprators;

public class Decrement_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Decrement_Operator opr = new Decrement_Operator();
		opr.decrement();
		
	}

	private void decrement() {


		int value = 50;
		
		System.out.println(--value);  //p -49   memory - 49
		System.out.println(--value);  //p - 48  memery - 48
		System.out.println(value--);  //p - 48  memory - 47
		System.out.println(value--);  //p - 47  memory - 46
		System.out.println(--value);  //p - 45  memory - 45
		System.out.println(--value);  //p - 44  memory - 44
		
		
	}

}

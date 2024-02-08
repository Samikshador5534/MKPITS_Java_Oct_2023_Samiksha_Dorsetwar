package com.mkpits.oprators;

public class Increment_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Increment_Operator opr = new Increment_Operator();
		opr.increment();
	}

	private void increment() {
		int value = 50;
		int b = 40;
		
		
		System.out.println(++value);  //p - 51  memory - 51
		System.out.println(++value);  //p - 52  memery - 52
		System.out.println(value++);  //p - 52  memory - 53
		System.out.println(value++);  //p - 53  memory - 54
		System.out.println(++value);  //p - 55  memory - 55
		System.out.println(++value);  //p - 56  memory - 56
		
		
		System.out.println(++b);  //p - 41  memory - 41
		System.out.println(++b);  //p - 42  memery - 42
		System.out.println(b++);  //p - 42  memory - 43
		System.out.println(b++);  //p - 43  memory - 44
		System.out.println(++b);  //p - 45  memory - 45
		System.out.println(++b);  //p - 46  memory - 46
		
	}

}

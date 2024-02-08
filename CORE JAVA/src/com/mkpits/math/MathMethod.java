package com.mkpits.math;

public class MathMethod {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathMethod method = new MathMethod();
	
		method.getMathDemo();
	}
	
	public void getMathDemo() {
		
		double no = 34;
		long a = 3456796554534l;
		System.out.println("The Absolute Of Double is :- " +Math.abs(no));
		
		System.out.println("The Absolute Of Double is :- " +Math.abs(200+300));
		
		
		System.out.println("The Absolute Of Double is :- " +Math.abs(0.000));
		
		System.out.println("The Absolute Of Double is :- " +Math.absExact( 256));
		
		System.out.println("The Absolute Of Double is :- " +Math.absExact( 25656+2));
		
		System.out.println("The Absolute Of Double is :- " +Math.absExact( a));
		
		System.out.println("The Absolute Of Double is :- " +Math.addExact(20, 30));
		
		System.out.println("The Absolute Of Double is :- " +Math.asin(-0.0));
		
		System.out.println("The Absolute Of Double is :- " +Math.cbrt(27.00000));
	
		System.out.println("The Absolute Of Double is :- " +Math.ceil(a));
		
		System.out.println("The Absolute Of Double is :- " +Math.decrementExact(20));
		
		System.out.println("The Absolute Of Double is :- " +Math.incrementExact(20));
		
		System.out.println("The Absolute Of Double is :- " +Math.exp(0.0));
		
		System.out.println("The Absolute Of Double is :- " +Math.log10(0.022));
		
		
		
		
		
		
		
	}
}
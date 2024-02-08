package com.mkpits.collections;

public class RecursionJava {

	public static void main(String[] args) {

		RecursionJava recursion = new RecursionJava();
		recursion.callMethod();
	}

	private void callMethod() {
		
		int counter = 0;
		while (counter < 5 ) {
			System.out.println("Recursion call");
			callMethod();
			counter--;
		}
		
	}

	
}

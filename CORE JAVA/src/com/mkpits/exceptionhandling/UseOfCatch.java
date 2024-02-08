package com.mkpits.exceptionhandling;

public class UseOfCatch {

	public static void main(String[] args) {

		try {
			int x = 10, y = 0;
			System.out.println(x / y);
		} catch (Exception e) {
			System.out.println("Network Error");
		}

		try {
			System.out.println("Hello");
		} finally {
			System.out.println("Hi");
		}
		
		}

	}



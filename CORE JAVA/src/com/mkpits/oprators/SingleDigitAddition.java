package com.mkpits.oprators;


import java.util.Scanner;

	public class SingleDigitAddition {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input two numbers
	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();

	        // Perform addition
	        int sum = num1 + num2;

	        // Ensure the output is a single-digit number
	        int singleDigitResult = sum % 9;

	        // Output the result
	        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + singleDigitResult);
	    }
	}



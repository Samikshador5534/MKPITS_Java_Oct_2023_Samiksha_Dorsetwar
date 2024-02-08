package com.mkpits.exceptionhandling;

public class LessBalanceException extends Exception{

	int amount;
	
	public LessBalanceException() {
		System.out.println("default constructor called");
	}
	
	public LessBalanceException(int amount) {
		this.amount = amount;
	}
	
	public String toString() {
		return "You Dont Have a Sufficient Balance Your Balance is" + amount;
	}
}
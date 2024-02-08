package com.mkpits.boundedgeneric;

public class PrintSumBounded <T extends Number >{

	
	public void print(T[] arr) {
		 
		double sum =0;
		for (T t : arr) {
			sum = sum + t.doubleValue();  //this method is of class member so can use it
		}
		
		System.out.println("sum : "+sum);
	}
}

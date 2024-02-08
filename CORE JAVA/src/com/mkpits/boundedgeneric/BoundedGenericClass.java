package com.mkpits.boundedgeneric;

public class BoundedGenericClass {

	public static void main(String[] args) {


	//	String[] stringArr = {"sam","ram","jam","man"};
	//    PrintSumBounded<String> printString = new  PrintSumBounded<String>();
	//	printString.print(stringArr);
		
		Integer[] intArr = {1,2,3,4,5};
		PrintSumBounded<Integer> printInt = new PrintSumBounded<Integer>();
		printInt.print(intArr);
		
		Double[] doubleArr = {23.4,34.5,12.2,78.6,56.7};
		PrintSumBounded<Double> printDouble = new PrintSumBounded<Double>();
		printDouble.print(doubleArr);
		
	}

}

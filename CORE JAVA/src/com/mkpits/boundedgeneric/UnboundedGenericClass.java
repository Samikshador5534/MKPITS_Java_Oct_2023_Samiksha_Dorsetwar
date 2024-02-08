package com.mkpits.boundedgeneric;

public class UnboundedGenericClass {

	public static void main(String[] args) {

		Integer[] intArr = {1,2,3,4,5};
		PrintDataGeneric<Integer> printInt = new PrintDataGeneric<Integer>();
		printInt.print(intArr);

		String[] stringArr = {"sam","ram","jam","man"};
		PrintDataGeneric<String> printString = new PrintDataGeneric<String>();
		printString.print(stringArr);
		
		Double[] doubleArr = {23.4,34.5,12.2,78.6,56.7};
		PrintDataGeneric<Double> printDouble = new PrintDataGeneric<Double>();
		printDouble.print(doubleArr);
		
		Long [] longArr = {12345678l,2345678l};
		PrintDataGeneric<Long> printLong = new PrintDataGeneric<Long>();
		printLong.print(longArr);
		
	}
	

}

package com.mkpits.collections;


public class PrintBothData {

	public static void main(String[] args) {

	   

		Integer[] intArr = { 1, 2, 3, 4, 5, 6 };
		PrintIntegerArray1 array1 = new PrintIntegerArray1();
		array1.print(intArr);
		
		String[] strArr = {"samiksha","raj","vaibhav","aatish"};
		PrintStringArray2 array2 = new PrintStringArray2();
		array2.print(strArr);

	}

}

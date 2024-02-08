package com.mkpits.collections;

public class PrintArray4<T> {


		public void print(T[] test) {
			for (T value : test) {
				System.out.println(value);
			}
		}

		public static void main(String[] args) {
			Integer[] intArr = { 1, 2, 3, 4, 5, 6 };
			String[] strArr = {"samiksha","raj","vaibhav","aatish","vinay"};
			
			PrintArray4<Integer> array4 = new PrintArray4<Integer>();
			array4.print(intArr);
			
			PrintArray4<String> array5 = new PrintArray4<String>();
			array5.print(strArr);
	}

}

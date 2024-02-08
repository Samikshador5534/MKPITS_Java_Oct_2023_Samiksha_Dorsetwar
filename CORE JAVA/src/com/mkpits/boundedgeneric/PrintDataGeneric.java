package com.mkpits.boundedgeneric;

public class PrintDataGeneric <T> {

	public void print(T [] arr) {
		
	
	for (T val : arr) {
		System.out.println(val);
	}
}
}
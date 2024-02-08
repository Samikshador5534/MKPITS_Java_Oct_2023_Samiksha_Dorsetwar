package com.mkpits.collectionvacation;

import java.util.ArrayList;

public class ArraylistAddMethod {

	public static void main(String[] args) {


		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("ram");
		al1.add("sham");
		al1.add("ramam");
		al1.add("aman");
		al1.add("rigvit");
		
		al1.forEach(System.out::println);
		
		System.out.println("---------------------------------------------");
		
		al1.add("samiksha");
		al1.add("aatish");
		
		al1.forEach(System.out::println);
		

	}

}

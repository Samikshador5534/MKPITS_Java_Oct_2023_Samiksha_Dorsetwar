package com.mkpits.collectionvacation;

import java.util.ArrayList;

public class ArraylistRetainAllMethod {

	public static void main(String[] args) {


		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("ram");
		al1.add("sham");
		al1.add("ramam");
		al1.add("aman");
		al1.add("rigvit");
		
		al1.forEach(System.out::println);
		
		System.out.println("---------------------------------------------");

		 ArrayList<String> al2 =new ArrayList<String>();  
		 
		  al2.add("Mango");  
		  al2.add("aman");  
		  al2.add("Banana");  	
		  
		  al2.forEach(System.out::println);
		  
		  System.out.println("---------------------------------------------");

		  al1.retainAll(al2);
		  System.out.println(al1);
		  

	}

}

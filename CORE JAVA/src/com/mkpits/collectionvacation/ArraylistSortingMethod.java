package com.mkpits.collectionvacation;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistSortingMethod {

	public static void main(String[] args) {

		 ArrayList<String> al=new ArrayList<String>();  
		 
		  al.add("Mango");  
		  al.add("Apple");  
		  al.add("Banana");  
		  al.add("Grapes");  
		  
		  al.forEach(System.out::println);
			
			System.out.println("---------------------------------------------");
			
			Collections.sort(al);
			
			 al.forEach(System.out::println);
			

	}

}

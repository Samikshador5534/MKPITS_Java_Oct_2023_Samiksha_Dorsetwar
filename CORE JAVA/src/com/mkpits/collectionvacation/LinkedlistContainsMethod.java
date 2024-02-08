package com.mkpits.collectionvacation;

import java.util.LinkedList;

public class LinkedlistContainsMethod {

	public static void main(String[] args) {

		 LinkedList<String> list = new LinkedList<String>();
		 
	        list.add("good");
	        list.add("for");
	        list.add("hello");
	        list.add("10");
	        list.add("20");
	        
	        System.out.println("The initial list is :" + list); 
	        
	        // Check if the list contains "Hello"
	        System.out.println("\nDoes the List contains 'Hello': "
	                                        + list.contains("Hello"));
	   
	        // Check if the list contains "20"
	        System.out.println("Does the List contains '20': "
	                                           + list.contains("20"));
	         

	}

}

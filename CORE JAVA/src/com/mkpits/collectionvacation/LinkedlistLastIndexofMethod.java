package com.mkpits.collectionvacation;

import java.util.LinkedList;

public class LinkedlistLastIndexofMethod {

	public static void main(String[] args) {


		 LinkedList<String> list = new LinkedList<String>();
		 
	        list.add("good");
	        list.add("for");
	        list.add("hello");
	        list.add("10");
	        list.add("20");
	        
	        System.out.println("The initial list is :" + list); 
	        
	        System.out.println( "Last occurrence of Geeks is at index: " + list.lastIndexOf("for")); 
	        
	            System.out.println( "Last occurrence of 10 is at index: "+ list.lastIndexOf("10")); 
	        

	}

}

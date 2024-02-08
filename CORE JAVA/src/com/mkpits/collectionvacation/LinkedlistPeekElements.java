package com.mkpits.collectionvacation;

import java.util.LinkedList;

public class LinkedlistPeekElements {

	public static void main(String[] args) {

		 LinkedList<String> list = new LinkedList<String>();
		 
	        list.add("good");
	        list.add("for");
	        list.add("hello");
	        list.add("10");
	        list.add("20");
	        
	        System.out.println("The initial list is :" + list); 
	        
	        // peek at the head of the list 
	     
	        System.out.println("Head of the list : " + list.peek()); 

	}

}

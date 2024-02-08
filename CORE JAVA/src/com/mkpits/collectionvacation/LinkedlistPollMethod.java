package com.mkpits.collectionvacation;

import java.util.LinkedList;

public class LinkedlistPollMethod {

	public static void main(String[] args) {

		 LinkedList<String> list = new LinkedList<String>();
		 
	        list.add("good");
	        list.add("for");
	        list.add("hello");
	        list.add("10");
	        list.add("20");
	        
	        System.out.println("The initial list is :" + list); 
	        
	        System.out.println("Head element of the list is : " + list.poll());
	        
	        System.out.println("Linked List after removal using poll() : " + list); 

	}

}

package com.mkpits.collectionvacation;

import java.util.LinkedList;

public class LinkedlistGetFirstMethod {

	public static void main(String[] args) {

		 LinkedList<String> list = new LinkedList<String>();
		 
	        list.add("good");
	        list.add("for");
	        list.add("hello");
	        list.add("10");
	        list.add("20");
	 
	        // Displaying the list(all elements inside object)
	        System.out.println("LinkedList:" + list);
	 
	        // using getFirst() method
	        System.out.println("The first element is: "
	                           + list.getFirst());

	}

}

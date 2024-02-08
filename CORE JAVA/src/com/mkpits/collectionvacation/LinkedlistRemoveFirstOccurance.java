package com.mkpits.collectionvacation;

import java.util.LinkedList;

public class LinkedlistRemoveFirstOccurance {

	public static void main(String[] args) {

		  LinkedList<String> list = new LinkedList<String>();
		  
		  
		    list.addLast("Goat");
	        list.addLast("4");
	        list.addLast("Great");
	        list.addLast("7");
	 
	        // printing the list
	        System.out.println("The initial Linked list is : " + list);

	        System.out.println(list.removeFirstOccurrence("Goat"));
	        
	        System.out.println(list);

	}

}

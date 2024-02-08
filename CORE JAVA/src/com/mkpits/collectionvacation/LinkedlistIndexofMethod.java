package com.mkpits.collectionvacation;

import java.util.LinkedList;

public class LinkedlistIndexofMethod {

	public static void main(String[] args) {

		LinkedList list = new LinkedList(); 
		
		    list.add("good"); 
	        list.add(4); 
	        list.add("good"); 
	        list.add(8); 
	  
	        // printing the initial list 
	        System.out.println("The initial Linked List is : " + list); 
	  
	       
	        // Prints 0 
	        System.out.println("Index of 1st occurrence of Geeks : "
	             + list.indexOf("good")); 
	  
	       
	        // Prints -1 
	        // element not present 
	        System.out.println("Index of 1st occurrence of Astha : "
	             + list.indexOf("Astha")); 
	}

}

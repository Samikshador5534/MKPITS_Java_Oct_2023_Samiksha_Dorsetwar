package com.mkpits.linkedlist;

import java.util.LinkedList;

public class ContainsLinkedListMethod {

	public static void main(String[] args) {

		 LinkedList<String> list = new LinkedList<String>(); 
		  
		 // Use add() method to add elements in the list 
	      list.add("A"); 
	      list.add("for"); 
	      list.add("Apple"); 
	      list.add("10"); 
	      list.add("20"); 
	  
	      // Displaying the list 
	      System.out.println("LinkedList:" + list); 
	      
	      LinkedList<String> list1 = new LinkedList<String>(); 
		  
			 // Use add() method to add elements in the list 
		      list1.add("Aa"); 
		      list1.add("for"); 
	      
	      //contains() method is used to check whether an element is present in a LinkedList or not
	      //LinkedList.contains(Object element)
	     System.out.println("\nDoes the List contains '10': " +list.contains("10"));

	    System.out.println("\nDoes the List contains : "+ list.containsAll(list1));
	}

}

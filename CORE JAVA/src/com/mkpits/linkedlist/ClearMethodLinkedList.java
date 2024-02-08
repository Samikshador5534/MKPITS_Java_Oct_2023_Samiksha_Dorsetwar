package com.mkpits.linkedlist;

import java.util.LinkedList;

public class ClearMethodLinkedList {

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
	      
	      //clear(); method
	      list.clear();
	      System.out.println("LinkedList:" + list); 
	      
	      list.add("how"); 
	      list.add("are"); 
	      list.add("you"); 
	      System.out.println(" Updated LinkedList:" + list); 

	}

}

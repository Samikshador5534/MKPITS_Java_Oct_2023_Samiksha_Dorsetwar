package com.mkpits.linkedlist;

import java.util.LinkedList;

public class CloneLinkedListMethod {

	public static void main(String[] args) {

		 LinkedList<String> list = new LinkedList<String>(); 
		  
		 // Use add() method to add elements in the list 
	      list.add("A"); 
	      list.add("for"); 
	      list.add("Apple"); 
	      list.add("10"); 
	      list.add("20"); 
	      
	      System.out.println("First LinkedList:" + list); 
	      
	      // Creating another linked list and copying 
	      LinkedList secondList = new LinkedList(); 
	      secondList = (LinkedList) list.clone();
	      
	      // Displaying the other linked list 
	      System.out.println("Second LinkedList is:" + secondList);

	}

}

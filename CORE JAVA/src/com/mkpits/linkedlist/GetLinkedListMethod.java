package com.mkpits.linkedlist;

import java.util.LinkedList;

public class GetLinkedListMethod {

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
	        
	      //get(int index)
	      // Fetching the specific element from the list 
	      System.out.println("The element is: " + list.get(2)); 
	      
	      // getFirst()
	      System.out.println("The element is: " + list.getFirst()); 
	      
	      // getLast()
	      System.out.println("The element is: " + list.getLast()); 
	  
	      

	}

}

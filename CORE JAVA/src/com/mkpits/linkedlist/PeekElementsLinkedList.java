package com.mkpits.linkedlist;

import java.util.LinkedList;

public class PeekElementsLinkedList {

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
	      
	      // peek at the head of the list 
	      // Prints 1st element 
	      System.out.println("Head of the list : " + list.peek()); 
	      
	      System.out.println("Head of the list : " + list.peekFirst()); 
	      
	      System.out.println("Head of the list : " + list.peekLast());
	      

	      
	}

}

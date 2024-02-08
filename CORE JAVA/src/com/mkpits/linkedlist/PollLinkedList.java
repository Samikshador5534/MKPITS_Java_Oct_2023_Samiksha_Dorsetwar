package com.mkpits.linkedlist;

import java.util.LinkedList;

public class PollLinkedList {

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
	      
	      System.out.println("Head of the list : " + list.poll()); 

	      System.out.println("Head of the list : " + list.pollFirst()); 
	      
	      System.out.println("Head of the list : " + list.pollLast()); 
	      
	      System.out.println("Head of the list : " + list.pop()); 
	}

}

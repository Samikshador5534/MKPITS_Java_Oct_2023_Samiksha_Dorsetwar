package com.mkpits.stack;

import java.util.Stack;

public class StackCapacityMethod {

	public static void main(String[] args) {


		//The capacity() method of Stack Class is used to get the capacity of this Stack. 
		//That is the number of elements present in this stack container.
		
		//Syntax:

         //public int capacity()
		
		 Stack<String> capacity1 = new Stack<String>(); 
		  
	        // Use add() method to add elements in the Stack 
	        capacity1.add("S"); 
	        capacity1.add("for"); 
	        capacity1.add("Samiksha"); 
	        capacity1.add("30"); 
	        capacity1.add("20"); 
	  
	        // Displaying the Stack 
	        System.out.println("The Stack is: " +capacity1); 
	  
	        // checking capacity 
	        System.out.println("Capacity: "
	                           +capacity1.capacity()); 

	}

}

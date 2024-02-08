package com.mkpits.stack;

import java.util.Stack;

public class StackSearchMethod {

	public static void main(String[] args) {


	//The java.util.Stack.search(Object element) method in Java is used to search for an element in the stack and get its distance from the top
	
	//This method starts the count of the position from 1 and not from 0
	//The element that is on the top of the stack is considered to be at position 1.
	//If more than one element is present, the index of the element closest to the top is returned
	//The method returns its position if the element is successfully found and returns -1 if the element is absent.
		
		 Stack<String> Search = new Stack<String>(); 
		  
	        // Stacking strings 
	        Search.push("A"); 
	        Search.push("4"); 
	        Search.push("Apple"); 
	        Search.push("Welcomes"); 
	        Search.push("You"); 
	  
	        // Displaying the Stack 
	        System.out.println("The stack is: " + Search); 
	  
	        // Checking for the element "4" 
	        System.out.println("Does the stack contains '4'? "
	                                     + Search.search("4")); 
	        // Checking for the element "Hello" 
	        System.out.println("Does the stack contains 'Hello'? "
	                                     + Search.search("Hello")); 
	  
	        // Checking for the element "you" 
	        System.out.println("Does the stack contains 'Geeks'? "
	                                     + Search.search("You")); 

	}

}

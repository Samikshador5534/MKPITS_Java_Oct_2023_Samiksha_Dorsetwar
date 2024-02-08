package com.mkpits.stack;

import java.util.Stack;

public class PeekElementsInStack {

	
	//Accessing the Element: To retrieve or fetch the first element of the Stack or 
	//the element present at the top of the Stack, we can use peek() method
	public static void main(String[] args) {

		//// Use push() to add elements into the Stack
		Stack<String> color = new Stack<String>();
		color.push("RED");
		color.push("BLUE");
		color.push("WHITE");
		color.push("YELLOW");
		
		// // Displaying the Stack
		System.out.println("Initial color : "+color);
		
		
		// // Fetching the element at the head of the Stack
		System.out.println(" The elements is top of the stack is : "+color.peek());
		
		
		// // Displaying the Stack after the Operation
        System.out.println("Final color: " + color);
		
		

	}

}

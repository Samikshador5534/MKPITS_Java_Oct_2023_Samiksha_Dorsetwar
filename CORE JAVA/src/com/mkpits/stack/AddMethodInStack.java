package com.mkpits.stack;

import java.util.Stack;

public class AddMethodInStack {

	public static void main(String[] args) {

	// Adding Elements: In order to add an element to the stack, we can use the push() method. 
	//This push() operation place the element at the top of the stack

				// Default initialization of Stack
				Stack<String> stack1 = new Stack<String>();

				// Initialization of Stack
				// using Generic
				Stack<String> stack2 = new Stack<String>();

				// pushing the elements
				stack1.push("How");
				stack1.push("Are");
				stack1.push("You");

				stack2.push("Good");
				stack2.push("Morning");
				stack2.push("Everyone");

				// Printing the Stack Elements
				System.out.println(stack1);
				System.out.println(stack2);
			}
		


	}



package com.mkpits.stack;

import java.util.Stack;

public class PopMethodInStack {

	public static void main(String[] args) {

		//Removing Elements: To pop an element from the stack, we can use the pop() method. 
		//The element is popped from the top of the stack and is removed from the same.
		
		   // Creating an empty Stack
        Stack<Integer> value = new Stack<Integer>();
 
        // Use add() method to add elements
        value.push(10);
        value.push(20);
        value.push(30);
        value.push(40);
        value.push(50);
 
        // Displaying the Stack
        System.out.println("Initial Stack: " + value);
 
        // Removing elements using pop() method
        System.out.println("Popped element: "
                           + value.pop());
        System.out.println("Popped element: "
                           + value.pop());
 
        // Displaying the Stack after pop operation
        System.out.println("Stack after pop operation "
                           + value);
    }


	}



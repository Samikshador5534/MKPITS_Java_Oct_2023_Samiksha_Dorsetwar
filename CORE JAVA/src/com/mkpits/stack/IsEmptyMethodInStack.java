package com.mkpits.stack;

import java.util.Stack;

public class IsEmptyMethodInStack {

	public static void main(String[] args) {

		 Stack<Integer> stack = new Stack<>();
		 
	        // Push elements onto the stack
	        stack.push(11);
	        stack.push(2);
	        stack.push(3);
	        stack.push(44);
	 
	        // Pop elements from the stack
	        while(!stack.isEmpty()) {
	            System.out.println(stack.pop());
	        }

	}

}

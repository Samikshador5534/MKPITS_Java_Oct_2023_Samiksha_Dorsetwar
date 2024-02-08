package com.mkpits.collectionvacation;

import java.util.Stack;

public class StackEmptyMethod {

	public static void main(String[] args) {

		 Stack<String> animals= new Stack<>();

	        // Add elements to Stack
	        animals.push("Dog");
	        animals.push("Horse");
	        animals.push("Cat");
	        System.out.println("Stack: " + animals);
	        
	        System.out.println(animals.empty());

	}

}

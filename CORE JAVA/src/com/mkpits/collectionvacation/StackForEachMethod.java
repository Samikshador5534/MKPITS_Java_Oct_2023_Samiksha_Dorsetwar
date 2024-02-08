package com.mkpits.collectionvacation;

import java.util.Stack;

public class StackForEachMethod {

	public static void main(String[] args) {
		
		Stack<Integer> stk= new Stack<>();
		stk.push(119);  
		stk.push(203);  
		stk.push(988);  
		System.out.println("Iteration over the stack using forEach() Method:");  
		//invoking forEach() method for iteration over the stack  
		stk.forEach(n ->  {  System.out.println(n);  });  
	}

}

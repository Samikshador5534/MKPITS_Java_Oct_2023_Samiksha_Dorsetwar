package com.mkpits.collectionvacation;

import java.util.Stack;

public class StackSizeMethod {

	public static void main(String[] args) {
	
		Stack<Integer> stk= new Stack<>();
		
		stk.push(22);  
		stk.push(33);  
		stk.push(44);  
		stk.push(55);  
		stk.push(66);  
		
		for (Integer integer : stk) {
			System.out.println(integer);
		}
		
		System.out.println(stk.size());
		

	}

}

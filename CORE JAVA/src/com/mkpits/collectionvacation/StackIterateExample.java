package com.mkpits.collectionvacation;

import java.util.Iterator;
import java.util.Stack;

public class StackIterateExample {

	public static void main(String[] args) {

		Stack<String> stk = new Stack<String>();
		stk.push("BMW");  
		stk.push("Audi");  
		stk.push("Ferrari");  
		stk.push("Bugatti");  
		stk.push("Jaguar");  
		//iteration over the stack  
		Iterator iterator = stk.iterator();  
		while(iterator.hasNext())  
		{  
		Object values = iterator.next();  
		System.out.println(values);   

	}

	}
	}

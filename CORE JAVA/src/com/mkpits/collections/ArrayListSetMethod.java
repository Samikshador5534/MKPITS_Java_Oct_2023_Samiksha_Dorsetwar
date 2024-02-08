package com.mkpits.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSetMethod {

	public static void main(String[] args) {

		// Creating an object of List interface,
	   // implemented by ArrayList class
		
		List<String> name = new ArrayList<String>();
		
		// Adding elements to object of List interface
		// Custom elements
		
		name.add("Mkpits");
		name.add("Services");
		name.add(1, "@");
		
		// Display the initial elements in List
		System.out.println("Initial ArrayList " +name);
		
		// Setting (updating) element at 1st index
		// using set() method
		
		name.set(1, "&");
		System.out.println("Updated ArrayList " +name);
	

	}

}

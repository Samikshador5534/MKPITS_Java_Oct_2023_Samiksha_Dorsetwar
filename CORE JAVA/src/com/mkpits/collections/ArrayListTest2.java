package com.mkpits.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {

	public static void main(String[] args) {

		// Creating an object of List interface
		// implemented by the ArrayList class
		   List<Integer> al1 = new ArrayList<Integer>();

		// Adding elements to object of List interface
	    // Custom inputs

			al1.add(0, 1);// index 0 value is 1
			al1.add(1, 2);// index 1 value 2
			al1.add(2, 3);
			al1.add(3, 4);

		// Print the elements inside the object
			System.out.println(al1);
	
	    // Now creating another object of the List
        // interface implemented ArrayList class
        // Declaring object of integer type	

		   List<Integer> al2 = new ArrayList<Integer>();
		
		 // Again adding elements to object of List interface
         // Custom inputs
		
		  al2.add(1);// index 0
		  al2.add(2);// index 1
		  al2.add(3);// index 2
// 
//        // Will add list l2 from 1 index
		  al1.addAll(1, al2);
		  System.out.println(al1);
	
	
	    //remove elements from index1
	      al1.remove(2);
	 
	        // Printing the updated List 1
			System.out.println(al1);
	 
	        // Prints element at index 3 in list 1
	        // using get() method
			System.out.println(al1.get(3));
	 
        // Replace 0th element with 5
	        // in List 1
			al1.set(3, 5);
	 
	        // Again printing the updated List 1
			System.out.println(al1);

//			Operation 1: Adding elements to List class using add() method
//			Operation 2: Updating elements in List class using set() method
//			Operation 3: Searching for elements using indexOf(), lastIndexOf methods
//			Operation 4: Removing elements using remove() method
//			Operation 5: Accessing Elements in List class using get() method
//			Operation 6: Checking if an element is present in the List class using contains() method
		
	}

}


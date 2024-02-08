package com.mkpits.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSets {

	public static void main(String[] args) {


		/*HashSet class which is implemented in the collection -
		- framework is an inherent implementation of the hash table data structure
		The objects that we insert into the HashSet do not guarantee to be inserted in the same order
		The objects are inserted based on their hashcode
		This class also allows the insertion of NULL elements  */
		
		 Set<String> h = new HashSet<String>(); 
		  
	        // Adding elements into the HashSet 
	        // using add() method 
	  
	        // Custom input elements 
	        h.add("India"); 
	        h.add("Australia"); 
	        h.add("South Africa"); 
	  
	        // Adding the duplicate element 
	        h.add("India"); 
	  
	        // Displaying the HashSet 
	        System.out.println(h); 
	  
	        // Removing items from HashSet 
	        // using remove() method 
	        h.remove("Australia"); 
	        System.out.println("Set after removing "
	                           + "Australia:" + h); 
	  
	        // Iterating over hash set items 
	        System.out.println("Iterating over set:"); 
	  
	        // Iterating through iterators 
	        Iterator<String> i = h.iterator(); 
	  
	        // It holds true till there is a single element 
	        // remaining in the object 
	        while (i.hasNext()) 
	  
	            System.out.println(i.next()); 
	    } 

	}



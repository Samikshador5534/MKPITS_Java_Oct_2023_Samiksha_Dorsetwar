package com.mkpits.sets;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSets {

	/* LinkedHashSet class which is implemented in the collections framework is an ordered version 
	 * of HashSet that maintains a doubly-linked List across all elements
	 * When the iteration order is needed to be maintained this class is used.
	 *  When iterating through a HashSet the order is unpredictable, 
	 *  while a LinkedHashSet lets us iterate through the elements in the order in which they were inserted.
	 *   Set<String> lh = new LinkedHashSet<String>(); //declaration
	 */
	public static void main(String[] args) {

		 Set<String> lh = new LinkedHashSet<String>();
	
		 lh.add("india");
		 lh.add("australia");
		 lh.add("south africa");
	
		 
		// Adding the duplicate 
	        // element 
	        lh.add("india"); 
	  
	        // Displaying the LinkedHashSet 
	        System.out.println(lh); 
	  
	        // Removing items from LinkedHashSet 
	        // using remove() 
	        lh.remove("australia"); 
	        System.out.println("Set after removing "
	                           + "Australia:" + lh); 
	  
	        // Iterating over linked hash set items 
	        System.out.println("Iterating over set:"); 
	        Iterator<String> i = lh.iterator(); 
	        while (i.hasNext()) 
	            System.out.println(i.next()); 
		 

	}

}

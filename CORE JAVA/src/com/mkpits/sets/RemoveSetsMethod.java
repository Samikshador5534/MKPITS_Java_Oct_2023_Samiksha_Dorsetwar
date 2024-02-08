package com.mkpits.sets;

import java.util.HashSet;
import java.util.Set;

public class RemoveSetsMethod {

	public static void main(String[] args) {

		 // Creating an empty Set 
        Set<String> set = new HashSet<String>(); 
  
        // Use add() method to add elements into the Set 
        set.add("Welcome"); 
        set.add("To"); 
        set.add("The"); 
        set.add("4"); 
        set.add("Taj"); 
  
        // Displaying the Set 
        System.out.println("Set: " + set); 
  
        // Removing elements using remove() method 
        set.remove("The"); 
        set.remove("4"); 
        set.remove("Welcome"); 
  
        // Displaying the Set after removal 
        System.out.println("Set after removing elements: "
                           + set); 
    

	}

}

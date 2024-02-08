package com.mkpits.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorSetExample {

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
        
        set.isEmpty();
        
        Iterator<String> value = set.iterator();
        for (Iterator ans = set.iterator(); ans.hasNext();) {
			String output = (String) ans.next();
			System.out.println(output);
		}
	}

}

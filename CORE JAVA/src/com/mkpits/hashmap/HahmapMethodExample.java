package com.mkpits.hashmap;

import java.util.HashMap;

public class HahmapMethodExample {

	public static void main(String[] args) {

		// Create a HashMap
	      HashMap<String, Integer> hashMap = new HashMap<>();
	       
	      // Add elements to the HashMap
	      hashMap.put("Reena", 25);
	      hashMap.put("Meena", 30);
	      hashMap.put("Jeeva", 35);
	       
	      // Access elements in the HashMap
	      System.out.println(hashMap.get("Reena")); 
	      // Output: 25
	       
	      // Remove an element from the HashMap
	      hashMap.remove("Jeeva");
	       
	      // Check if an element is present in the HashMap
	      System.out.println(hashMap.containsKey("Jeeva")); 
	      // Output: false
	       
	      // Get the size of the HashMap
	      System.out.println(hashMap.size()); 
	      // Output: 2
	      
	      // // Check if an element is present in the HashMap
	      System.out.println(hashMap.containsKey("Meena"));
          //output : true
	      
	      
	      //check wheather the hashmap list is empty or not
	    System.out.println(hashMap.isEmpty());
	    //output : false
	    
	    
	    System.out.println(hashMap.entrySet());
	    
	    System.out.println(hashMap.toString()); //print the haspmap elements
	    
	    System.out.println(hashMap.keySet());
	    
	    
	      
	      
	}

}

package com.mkpits.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashmapEquallyExample {

	public static void main(String[] args) {

		Map<Integer, String> hash1 = new HashMap<Integer, String>(); 

      Map<Integer, String> hash2 = new HashMap<Integer, String>(); 

     // Mapping string values to int keys 
      hash1.put(10, "Hello"); 
      hash1.put(15, "4"); 
      hash1.put(20, "Everyone"); 
      hash1.put(25, "Welcomes"); 
      hash1.put(30, "You"); 

     // Mapping string values to int keys 
      hash2.put(10, "Hello"); 
      hash2.put(15, "4"); 
      hash2.put(20, "Everyone"); 
      hash2.put(25, "Welcomes"); 
      hash2.put(30, "You"); 

     // Displaying the AsbstractMap 
     System.out.println("First Map: "
                        + hash1); 

     // Displaying the final AbstractMap 
     System.out.println("Second Map: "
                        + hash2); 

     // Displaying the equality 
     System.out.println("Equality: "
                        + hash1.equals(hash2));

	}

}

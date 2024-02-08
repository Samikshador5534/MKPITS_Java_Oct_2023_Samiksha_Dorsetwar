package com.mkpits.sets;

import java.util.HashSet;
import java.util.Set;

public class AddMethodInSets {

	public static void main(String[] args) {

		 // Declaring object of type String  
        Set<String> hash_Set = new HashSet<String>(); 
  
        // Adding elements to the Set 
        // using add() method 
        hash_Set.add("you"); 
        hash_Set.add("are"); 
        hash_Set.add("a"); 
        hash_Set.add("very"); 
        hash_Set.add("beautiful"); 
  
        // Printing elements of HashSet object 
        System.out.println(hash_Set); 

        Set<String> hash_Set1 = new HashSet<String>(); 
        hash_Set1.add("she");
        hash_Set1.add("is");
        hash_Set1.add("damn");
        hash_Set1.add("good");
        hash_Set1.add("looking");
        
        hash_Set1.forEach(System.out::println);  ///lambda expression function
        
        System.out.println("_____________________________________");
        hash_Set.addAll(hash_Set1);
        hash_Set.forEach(System.out::println);
        
        Set<Integer> value = new HashSet<Integer>(); 
        value.add(10);
        value.add(50);
        value.add(30);
        value.add(20);
        value.forEach(System.out::println);
        
        
	}

}

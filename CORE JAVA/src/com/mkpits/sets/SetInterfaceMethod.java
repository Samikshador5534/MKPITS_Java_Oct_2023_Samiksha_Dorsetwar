package com.mkpits.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetInterfaceMethod {

	public static void main(String[] args) {

		Set<Integer> value1 = new HashSet<Integer>();


		 // Adding all elements to List  
        value1.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 })); //directly printing in aaray form
        
        Set<Integer> value2 = new HashSet<Integer>();
        value2.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5}));
        
     // To find union 
        Set<Integer> union = new HashSet<Integer>(value1); 
        union.addAll(value2); 
        System.out.print("Union of the two Set"); 
        System.out.println(union); 
        
        //To Find Intersection
        Set<Integer> intersectionSet = new HashSet<Integer>(value1); 
        intersectionSet.retainAll(value2);
        System.out.print("Intersection of the two Set"); 
        System.out.println(intersectionSet); 
        
        
        // To find the symmetric difference 
        Set<Integer> difference = new HashSet<Integer>(value1); 
        difference.removeAll(value2); 
        System.out.print("Difference of the two Set"); 
        System.out.println(difference); 
        


	

	}
}
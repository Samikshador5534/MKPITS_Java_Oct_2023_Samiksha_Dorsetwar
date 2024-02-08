package com.mkpits.sets;

import java.util.EnumSet;
import java.util.Set;

         /*EnumSet class which is implemented in the collections framework
          * one of the specialized implementations of the Set interface for use with the enumeration type
          * It is a high-performance set implementation, much faster than HashSet
          * 
          */

public class EnumSetsInSet {

	enum value {CODE, LEARN, CONTRIBUTE, QUIZ, MCQ ,KOP}
	
	public static void main(String[] args) {
		
		 // Creating a set 
        Set<value> set1; 
  
        // Adding the elements 
        set1 = EnumSet.of(value.QUIZ, value.CONTRIBUTE, 
                          value.LEARN, value.CODE , value.MCQ , value.KOP); 
  
        System.out.println("Set 1: " + set1); 

		

	}

}

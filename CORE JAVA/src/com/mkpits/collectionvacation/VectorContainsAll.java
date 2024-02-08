package com.mkpits.collectionvacation;

import java.util.Vector;

public class VectorContainsAll {

	public static void main(String[] args) {
		
		  Vector<Integer>  vec = new Vector<Integer>(4);           
	       vec.add(11);  
	       vec.add(22);  
	       vec.add(33);  
	       vec.add(44);  
	       vec.add(55);  
	       
	      Vector<Integer>  vector2 = new Vector<Integer>(4);  
	      vector2.add(22);  
	      vector2.add(33);  
	      
	      System.out.println(vec.containsAll(vector2));
	      
	}

}

package com.mkpits.collectionvacation;

import java.util.Vector;

public class VectorContainExample {

	public static void main(String[] args) {
		
		  Vector<Integer>  vec = new Vector<Integer>(4);           
	       vec.add(11);  
	       vec.add(22);  
	       vec.add(33);  
	       vec.add(44);  
	       vec.add(55);  
	       
	       System.out.println("Existence: "+vec.contains(33));   
	}

}

package com.mkpits.collectionvacation;

import java.util.Vector;

public class VectorAddElements {

	public static void main(String[] args) {
		
		Vector<String> vec = new Vector<String>();
		
        
        vec.add("Tiger");  
        vec.add("Lion");  
        vec.add("Dog");  
        vec.add("Elephant"); 
        
        
        //Adding elements using addElement() method of Vector  
        vec.addElement("Rat");  
        vec.addElement("Cat");  
        vec.addElement("Deer");  
          
        System.out.println("Elements are: "+vec);

	}

}

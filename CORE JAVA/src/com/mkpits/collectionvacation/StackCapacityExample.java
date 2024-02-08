package com.mkpits.collectionvacation;

import java.util.Vector;

public class StackCapacityExample {

	public static void main(String[] args) {
		
		 Vector<Integer> vecObject = new Vector<Integer>(5);  
		 
	        //Add values in the vector  
	        vecObject.add(3);  
	        vecObject.add(5);  
	        vecObject.add(2);  
	        vecObject.add(4);  
	        vecObject.add(1);  
	          System.out.println("Current capacity of Vector is: "+vecObject.capacity());
	}

}

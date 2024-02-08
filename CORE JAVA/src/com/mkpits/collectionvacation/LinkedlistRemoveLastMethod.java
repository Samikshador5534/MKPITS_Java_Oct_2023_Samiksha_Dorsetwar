package com.mkpits.collectionvacation;

import java.util.LinkedList;

public class LinkedlistRemoveLastMethod {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>(); 
		
        list.add(10); 
        list.add(20); 
        list.add(30); 
        
        System.out.println("LinkedList:" + list);
        
        // Remove the last using removeLast() 
        System.out.println("The last element is removed: " + list.removeLast()); 
        
        // Displaying the final list 
        System.out.println("Final LinkedList:" + list);

	}

}

package com.mkpits.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class SetLinkedListMethod {

	public static void main(String[] args) {

		//The Java.util.LinkedList.set() method is used to replace any particular element in the linked list
		//created using the LinkedList class with another element.
		//LinkedList.set(int index, Object element)
		
		List<Integer> list = new ArrayList<Integer>();
		
		 // Add elements
		 list.add(32);
		 list.add(67);
		 list.add(100);
		 list.add(1);
		 list.add(78);
		 
		 System.out.println(list);

		 ////LinkedList.set(int index, Object element)
		 
		  list.set(1, 2);
		  System.out.println("The Object that is replaced with 67 to 2: "+list);
		  
		  list.set(4, 400000);
		  System.out.println("The Object that is replaced with 78 to 400000: "+list);
		 
		  System.out.println("updated linklist is :"+list);
		

	}

}

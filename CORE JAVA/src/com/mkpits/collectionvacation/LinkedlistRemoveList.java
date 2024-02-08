package com.mkpits.collectionvacation;

import java.util.ArrayList;

public class LinkedlistRemoveList {

	public static void main(String[] args) {


		 ArrayList<String> al=new ArrayList<String>();  
		 
		  al.add("Mango");  
		  al.add("Apple");  
		  al.add("Banana");  
		  al.add("Grapes");  
		  
		  al.forEach(System.out::println); // lambda function
		  
		  System.out.println("remove element :" +al.remove(1));
		  
		  System.out.println("Updated LinkedList: " + al);

	}

}

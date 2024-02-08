package com.mkpits.collectionvacation;

import java.util.LinkedList;

public class LinkedlistOfferLast {

	public static void main(String[] args) {

		 LinkedList list = new LinkedList();
		 
	        // adding elements
	        list.add("Goat");
	        list.add(4);
	        list.add("Great");
	        list.add(8);
	 
	        // printing the list
	        System.out.println("The initial Linked list is : " + list);
	 
	        // offering a new element
	        // adds element at end.
	        list.offerLast("samiksha");
	 
	        // printing the new list
	        System.out.println("LinkedList after insertion using offerLast() : " + list);

	}

}

package com.mkpits.collectionvacation;

import java.util.LinkedList;

public class LinkedlistSetMethod {

	public static void main(String[] args) {


		 LinkedList<String> animals = new LinkedList<>();

		    // Add elements to LinkedList
		    animals.add("Dog");
		    animals.add("Cat");
		    animals.add("Cow");
		    animals.add("goat");
		    System.out.println("LinkedList: " + animals);
		    
		    animals.set(3, "Tiger");
		    System.out.println("Updated LinkedList: " + animals);

	}

}

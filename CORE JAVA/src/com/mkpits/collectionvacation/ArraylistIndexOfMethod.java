package com.mkpits.collectionvacation;

import java.util.ArrayList;

public class ArraylistIndexOfMethod {

	public static void main(String[] args) {


		 ArrayList<Integer> numbers = new ArrayList<>();

	       
	        numbers.add(22);
	        numbers.add(13);
	        numbers.add(35);
	        System.out.println("Number ArrayList: " + numbers);

	   
	        int position1 = numbers.indexOf(13);
	        System.out.println("Index of 13: " + position1);

	 
	        int position2 = numbers.indexOf(50);
	        System.out.println("Index of 50: " + position2);

	}

}

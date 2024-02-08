package com.mkpits.collectionvacation;

import java.util.ArrayList;

public class ArraylistForEachMethod {

	public static void main(String[] args) {


		 ArrayList<Integer> numbers = new ArrayList<>();
		    numbers.add(1);
		    numbers.add(2);
		    numbers.add(3);
		    numbers.add(4);
		   System.out.println("ArrayList: " + numbers);
		    
		  for (Integer integer : numbers) {
			System.out.println(integer);
		}
	}

}

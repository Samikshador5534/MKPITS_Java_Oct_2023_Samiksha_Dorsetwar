package com.mkpits.collections;

import java.util.ArrayList;

public class GetNSetArrayList {

	public static void main(String[] args) {


		ArrayList<String> fruitList = new ArrayList<String>();
		
		fruitList.add("Mango");
		fruitList.add("Banana");
		fruitList.add("grapes");
		fruitList.add("orange");
		fruitList.add("dates");
		
		
		///it will return the 2nd element, because index starts from 0
		System.out.println("Returning element from list :-" +fruitList.get(3));
		
		
		//set the element
		fruitList.set(1, "Gauva");
		
		
		//using for each loop
		for (String Fruit : fruitList) {
			System.out.println(Fruit);
		}

	}

}

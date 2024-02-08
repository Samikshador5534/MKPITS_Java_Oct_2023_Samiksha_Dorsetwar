package com.mkpits.collectionvacation;

import java.util.ArrayList;

public class ArraylistRemoveMethod {

	public static void main(String[] args) {

		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(12);
		al1.add(20);
		al1.add(34);
		al1.add(50);
		al1.add(56);
		
		al1.forEach(System.out::println);
		
		System.out.println("---------------------------------------------");
		
		al1.remove(2);
		System.out.println(al1);
		
	//	al1.forEach(System.out::println);
		

	}

}

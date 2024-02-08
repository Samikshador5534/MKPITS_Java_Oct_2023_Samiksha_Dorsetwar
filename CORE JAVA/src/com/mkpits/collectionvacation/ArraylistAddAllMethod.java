package com.mkpits.collectionvacation;

import java.util.ArrayList;

public class ArraylistAddAllMethod {

	public static void main(String[] args) {


		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(12);
		al1.add(20);
		al1.add(34);
		al1.add(50);
		al1.add(56);
		
		al1.forEach(System.out::println);
		
		System.out.println("---------------------------------------------");
		
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(8);
		al2.add(4);
		al2.add(2);
		al2.add(0);
		al2.add(1);
		
		al2.forEach(System.out::println);
		
		System.out.println("---------------------------------------------");
		
		al1.addAll(al2);
		System.out.println(al1);

	}

}

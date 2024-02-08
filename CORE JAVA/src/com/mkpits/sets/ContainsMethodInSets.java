package com.mkpits.sets;

import java.util.HashSet;
import java.util.Set;

public class ContainsMethodInSets {

	public static void main(String[] args) {

		Set<String> color = new HashSet<String>();
		color.add("red");
		color.add("pink");
		color.add("red");
		color.add("black");
		color.add("40");
		color.add("55");
		
		color.forEach(System.out::println);
		
		System.out.println("________________________________________");
		for (String string : color) {
			System.out.println(string);
		}
		
		
		System.out.println("________________________________________");
		System.out.println("Does the Set contains 'red'? "+color.contains("red"));
		
		
		System.out.println("________________________________________");
		System.out.println("Does the Set contains '00'?" + color.contains("00"));
		
		Set<String> color1 = new HashSet<String>();
		color1.add("black");
		color1.add("pink");
		color1.add("red");
		color1.add("80");
		
		
		System.out.println("________________________________________");
		System.out.println(color.addAll(color1));
		color.forEach(System.out::println);
		
		System.out.println("________________________________________");
		System.out.println(color.containsAll(color1));
		

	}

}

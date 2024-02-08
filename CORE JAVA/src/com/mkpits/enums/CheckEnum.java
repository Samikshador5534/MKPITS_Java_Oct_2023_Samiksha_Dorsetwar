package com.mkpits.enums;

public class CheckEnum {

	enum Days {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SAMIKSHA
	}
	
	 public static void main(String[] args) {

		for (Days d : Days.values()) {
			System.out.println(d);
		}

		System.out.println("The Value is " + Days.valueOf("MONDAY"));
		System.out.println("The Value is " + Days.valueOf("TUESDAY").ordinal());
	}
}
package com.mkpits.collections;

import java.util.ArrayList;

public class TypeSafety {

	public static void main(String[] args) {

		Integer[] arr = new Integer[10];
		arr[0]= 5;
		arr[1] = 3;
	//	arr[2] = "camal";   ///compile time error

		Integer i = 200;
		
		//instance of
		System.out.println(i instanceof Integer);
		
		//Non generic version
		
		ArrayList List = new ArrayList();
		List.add(2);
		List.add(456.7);
		List.add(true);
		List.add("samiksha");
		
		for (Object valuet : List) {
			System.out.println(valuet);
		}
		
		ArrayList<String> strArr = new ArrayList<String>();
		strArr.add("Ahmedabad");
		strArr.add("Nagpur");
		strArr.add("Mumbai");
		strArr.add("Wardha");
		strArr.add("Amravati");
		strArr.add("Gondia");
//		strArr.add(1); compile time error

		for (String value : strArr) {
			System.out.println(value);
		}
	}

}

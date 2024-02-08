package com.mkpits.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLong {

	public static void main(String[] args) {

		List<Long> longList = new ArrayList<Long>();
		longList.add(1234567876543l);
		longList.add(98765432765l);
		longList.add(6545872346l);
		longList.add(000000000l);
		longList.add(98765432123456789l);
		longList.add(345l);
		
		//using foreach loop array
		
		System.out.println("......using foreach loop......");

		for (Long long1 : longList) {
			System.out.println( long1);
		}
	}

}

package com.mkpits.collections;

import java.util.ArrayList;
import java.util.List;

public class ShortArrayList {

	public static void main(String[] args) {

		List<Short> shortList = new ArrayList<Short>();
		shortList.add((short) 10);
		shortList.add((short) 20);
		shortList.add((short) 30);
		shortList.add((short) 40);
		shortList.add((short) 50);
		shortList.add((short) 60);
		
		for (Short short1 : shortList) {
			System.out.println(short1);
		}
		
		

	}

}

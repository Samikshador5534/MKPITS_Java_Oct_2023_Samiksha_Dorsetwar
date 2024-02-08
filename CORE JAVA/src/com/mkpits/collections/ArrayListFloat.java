package com.mkpits.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFloat {

	public static void main(String[] args) {

		List<Float> floatList = new ArrayList<Float>();
		floatList.add(212.34F);
		floatList.add(313.2f);
		floatList.add(414.345f);
		floatList.add(515.40f);
		floatList.add(9090.00f);
		floatList.add(9876543.76f);
		
	    //using for loop
		System.out.println("....using for loop....");
		for (int i = 0; i < floatList.size(); i++) {
			System.out.println(floatList.get(i));
		}
		
		
		//using for each loop
		System.out.println(".....using for each .....");
		for (Float float1 : floatList) {
			System.out.println(float1);
		}
		
		
		

	}

}

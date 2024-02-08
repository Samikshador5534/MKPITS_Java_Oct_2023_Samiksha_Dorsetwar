package com.mkpits.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDouble {

	public static void main(String[] args) {

		List<Double> pincodeList = new ArrayList<Double>();
		pincodeList.add(11.1);
		pincodeList.add(23.4);
		pincodeList.add(67.9);
		pincodeList.add(90.0);
		pincodeList.add(11.1);
		pincodeList.add(80.00);
		
		//using for loop
		for (int i = 0; i < pincodeList.size(); i++) {
			System.out.println(pincodeList.get(i));
		}
		
		//using for each loop array we have to find pincode list array
		
		System.out.println(".....using for each loop.......");
		for (Double double1 : pincodeList) {
			System.out.println(double1);
		}
		
		//using iterator
		
		System.out.println("........using iterator.....");
		Iterator<Double> doubleList = pincodeList.iterator();
		while (doubleList.hasNext()) {
			Double double1 = (Double) doubleList.next();
			System.out.println(double1);
			
		}

	}

}

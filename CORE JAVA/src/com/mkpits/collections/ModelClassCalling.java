package com.mkpits.collections;

import java.util.ArrayList;

public class ModelClassCalling {

	public static void main(String[] args) {

		ArrayList<ModelClassArrayList> list = new ArrayList<ModelClassArrayList>();
		list.add(new ModelClassArrayList(101, "samiksha"));
		list.add(new ModelClassArrayList(102, "vaibhav"));
		list.add(new ModelClassArrayList(103, "vinay"));
		list.add(new ModelClassArrayList(101, "ashik"));

		
		for (ModelClassArrayList modelClass : list) {
			System.out.println(modelClass);
		}
		
		ArrayList<ModelClassArrayList> list1 = new ArrayList<ModelClassArrayList>();
		list1.add(new ModelClassArrayList(105, "harsh"));
		list1.add(new ModelClassArrayList(106, "raj"));
		list1.add(new ModelClassArrayList(101, "samiksha"));
		
		for (ModelClassArrayList modelClass1 : list1) {
			System.out.println(modelClass1);
		}
		System.out.println("--------------------------------------");
		
		list.addAll(list1);
		System.out.println(list+"\n");
		for (int i = 0; i < list.size(); i++) {

               System.out.println(list.get(i));
			
		}
		System.out.println("--------------------------------------");
		
		list.remove(0);
		System.out.println(list);
		
		System.out.println("--------------------------------------");
		
		System.out.println(list.removeAll(list1));
		
		System.out.println("--------------------------------------");
		System.out.println(list1.removeAll(list));
		
	}
	

}

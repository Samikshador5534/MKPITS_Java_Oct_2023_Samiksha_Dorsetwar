package com.mkpits.nestedclass;

import com.mkpits.nestedclass.Outerclass.innerclass;

public class Nested_Calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outerclass outerclass= new Outerclass();  //outer class object
		
		Outerclass.innerclass myinnerclass = outerclass.new innerclass();  //inner class object
		
		System.out.println(outerclass.x);
		
		System.out.println(myinnerclass.z);
		
		System.out.println(myinnerclass.y);
		
	}

}

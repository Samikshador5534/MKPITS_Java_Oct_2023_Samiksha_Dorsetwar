package com.mkpits.oprators;

public class ReturnTypeIncrement {

	
	int value = 35;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReturnTypeIncrement rti = new ReturnTypeIncrement();
		System.out.println(rti.rtrnValue(rti.value));  // same value will be printed
		System.out.println(rti.rtrnValue(rti.value));  // no increment will take place once value is printed 
		System.out.println(rti.rtrnValue(rti.value));  //even if we have to print in multiple times
		System.out.println(rti.rtrnValue(rti.value));
		System.out.println(rti.rtrnValue(rti.value));
	}

	public int rtrnValue (int a) {
		++a;
		
		
		// when we have return type method the value will increment once and it will allocates in the memory
		//even if we print the value in multiple times the output will shows as the what is saved in main memory
		//it does not increment every times we print
		
		
		return a;
	}
}

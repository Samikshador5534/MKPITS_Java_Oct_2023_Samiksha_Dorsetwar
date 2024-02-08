package com.mkpits.oprators;

public class ReturnTypeIncrementMethod {


	    int value = 30;
	    
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			ReturnTypeIncrement rti = new ReturnTypeIncrement();
			rti.value =rti.rtrnValue(rti.value);
			System.out.println(rti.value);  // increment value will be printed
			rti.value =rti.rtrnValue(rti.value);
			System.out.println(rti.value);  //  increment will take place once value is printed 
			rti.value =rti.rtrnValue(rti.value);
			System.out.println(rti.value);  //even if we have to print in multiple times
			rti.value =rti.rtrnValue(rti.value);
			System.out.println(rti.value); 
			rti.value =rti.rtrnValue(rti.value);
			System.out.println(rti.value); 
		}
		
		public int rtrnValue (int a) {
			++a;
	
			return a;
		}

}

package com.mkpits.localdateclass;

import java.time.LocalDate;

public class LocalDateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Java does not have a built-in Date class
		//we can import the java.time package to work with the date and time API
		//LocalDate	Represents a date (year, month, day (yyyy-MM-dd))
		
		LocalDate myDate = LocalDate.now();
		System.out.println(myDate);
		
	}

}

package com.mkpits.localdateclass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeFormatterClass {
	
	//DateTimeFormatter	Formatter for displaying and parsing date-time objects
	//The "T" in the example above is used to separate the date from the time
	//You can use the DateTimeFormatter class with the ofPattern() method in the same package to format or parse date-time objects.
    //The following example will remove both the "T" and nanoseconds from the date-time
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Before formatting: "+ dateTime);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String myFormatDate = dateTime.format(formatter);
		System.out.println("After formatting: "+ myFormatDate);
	}

}

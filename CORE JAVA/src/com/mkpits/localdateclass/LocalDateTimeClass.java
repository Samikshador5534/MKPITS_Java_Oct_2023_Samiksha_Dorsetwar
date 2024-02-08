package com.mkpits.localdateclass;

import java.time.LocalDateTime;

public class LocalDateTimeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//LocalDateTime	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
		//To display the current date and time, import the java.time.LocalDateTime class, and use its now() method
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
	}

}

package com.mkpits.localdateclass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeFormatterClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Before formatting: "+ dateTime);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
		
		String myFormatDate = dateTime.format(formatter);
		System.out.println("After formatting: "+ myFormatDate);
	}
}

package com.mkpits.localdateclass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeFormatterClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Before formatting: "+ dateTime);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
		
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		
		String myFormatDate = dateTime.format(formatter);
		System.out.println("After formatting: "+ myFormatDate);
		
		String myFormatDate1 = dateTime.format(formatter1);
		System.out.println("After formatting: "+ myFormatDate1);
		
		
	}
	

}

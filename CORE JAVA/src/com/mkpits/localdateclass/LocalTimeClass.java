package com.mkpits.localdateclass;

import java.time.LocalTime;

public class LocalTimeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//LocalTime	Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
		//import the java.time.LocalTime class, and use its now() method
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
	}

}

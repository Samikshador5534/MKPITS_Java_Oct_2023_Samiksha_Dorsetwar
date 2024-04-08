package com.mkpits.model;

public class Student {

	private String firstName;
	private String lastName;
	private boolean isActive;
	
	private String getFirstName() {
		return firstName;
	}

	private String getLastName() {
		return lastName;
	}

	private boolean isActive() {
		return isActive;
	}

	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	private void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Student(String firstName, String lastName, boolean isActive) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.isActive = isActive;
	}
	
}

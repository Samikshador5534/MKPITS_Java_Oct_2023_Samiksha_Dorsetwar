package com.mkpits.abstraction;

public abstract class Abstraction_Example {

	String color;
	
	public abstract double area();
	
	public abstract String toString();
	
	public Abstraction_Example(String color) 
	
	{
		System.out.println("Abstraction example called");
		this.color = color;
	}
	
	public String getColor()
	{
		return color;
	}
	
}

package com.mkpits.abstraction;

public class RectangleAbstraction extends Abstraction_Example {

	double length ,width;
	
	public RectangleAbstraction (String color , double length,double width) 
	{
		super(color);
		System.out.println("Rectangle constructor is called");
		this.length = length;
		this.width = width;
		
	}

	@Override
	public double area() 
	{
		
		return length * width;
	}

	@Override
	public String toString() 
	{
		
		return ("Rectangle color is :- " + super.getColor() 
        + "\n area is : " + area());
	}
}

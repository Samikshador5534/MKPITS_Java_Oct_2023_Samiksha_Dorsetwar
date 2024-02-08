package com.mkpits.abstraction;

public class CircleAbstract extends Abstraction_Example {

	double radius;
	
	public CircleAbstract (String color , double radius) 
	{
		 super(color); 
		 System.out.println("circle constructor called");
		 this.radius=radius;
		
	}

	@Override
	public double area() 
	{
		 return Math.PI * Math.pow(radius, 2); 
		 
	}

	@Override
	public String toString() 
	{
		
		return "Circle color is :-" + super.getColor() 
        + "\n area is : " + area(); 
	}

}

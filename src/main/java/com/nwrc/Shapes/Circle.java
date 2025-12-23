package com.nwrc.Shapes;

public class Circle implements Shape {

    // Declare the radius variable for this class
	private double radius;
	
	// create constructor to include this radius	
	public Circle(double radius) {
		this.radius = radius;
	}
	

	// implement the override methods from parent class
	@Override
	public double getArea() {
		
		return Math.PI * (radius * radius);
	}

	@Override
	public double getPerimeter() {
		
		return (2 * (Math.PI * radius) );
	}

}

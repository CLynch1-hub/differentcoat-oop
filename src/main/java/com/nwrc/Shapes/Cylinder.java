package com.nwrc.Shapes;

public class Cylinder extends Circle  {

    // declare variable to this class
	private double height;
	// create constructor to include this height variable and the 
	// radius variable from the parent Circle class
	public Cylinder(double radius, double height)
	{
		super(radius); 
		this.height = height; 	
	}
	// call getters and setters for height
	public double getHeight() 
	{
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	// call override methods from parent
	public double getVolume()
	{
		return super.getArea() * getHeight();
	}
}

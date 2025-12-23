package com.nwrc.Shapes;
public class Rectangle implements Shape{
    private double height; // use height instead of length
    private double width;
    // create a constructor
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    // implement override methods
    @Override
    public double getArea() {
        return height * width; // the area calculation
    }
    @Override
    public double getPerimeter() {
        return 2 * (height + width);  // perimeter calculation
    }

    @Override
    public String toString() {
        return "Rectangle[height=" + height + ", width=" + width + "]";
    }
}

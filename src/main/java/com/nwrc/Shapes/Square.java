package com.nwrc.Shapes;

public class Square implements Shape {

    // declare a side variables for this class
    private double side;
    
    // Call the constructor
    public Square(double side) {
        this.side = side;
    }

    // implement override methods
    @Override
    public double getArea() {
        return (side * side);
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

}

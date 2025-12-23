package com.nwrc.Customers;

import com.nwrc.DataAccess.Constants;
import com.nwrc.Shapes.Circle;
import com.nwrc.Shapes.Rectangle;
import com.nwrc.Shapes.Square;

public class GeneralCustomer extends Customer {
	private String customerName;
    // create constructor to include base variables and customerName
    public GeneralCustomer(String customerType, String Address,
                           String telephone, String roomShape, double height, double width, String customerName) {
        super(customerType, Address, telephone, roomShape, height, width);  // base variables from customer
        this.customerName = customerName;
    }

    // create a method override for calculateCoverage from Parent for General customers
    @Override
    public double calculateCoverage() {
        double perimeter;
        String roomshape = super.getRoomShape().trim(); // define roomshape variable from the base customer
        Circle circle = new Circle(super.getWidth() / 2);
        Rectangle rectangle = new Rectangle(super.getWidth(), super.getHeight());
        Square square = new Square(super.getWidth());

        // Calculate perimeter for general customer by accessing roomshape variable
        //  use circle.getPerimeter in calculating cylinder room
        if(roomshape.equalsIgnoreCase("cylinder")) {
            perimeter = circle.getPerimeter();
        } else if (roomshape.equalsIgnoreCase("rectangle")) {
            perimeter = rectangle.getPerimeter();
        } else if (roomshape.equalsIgnoreCase("square")) {
            perimeter = square.getPerimeter();
        } else {
            System.out.println("Invalid shape entered");
            return 0.0; // to handle invalid entry
        }

        // Calculate surface area and final paint coverage
        double surfaceArea = (perimeter * super.getHeight()) - (Constants.DOOR + Constants.WINDOW);
        double gallonsRequired = (surfaceArea / Constants.COVERAGE);
        return gallonsRequired * Constants.LITRES; // Return litres required = gallons * 4.54
    }

    // Add the required Getters and Setters
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    // toString method
    @Override
    public String toString() {
        return "GeneralCustomer {" +
                "Customer Name: '" + customerName + '\'' +
                ", Type: '" + getCustomerType() + '\'' +
                ", Address: '" + getAddress() + '\'' +
                ", Telephone: '" + getTelephone() + '\'' +
                ", Room Shape: '" + getRoomShape() + '\'' +
                ", Height: " + getHeight() +
                ", Width: " + getWidth() +
                '}';
    }
}
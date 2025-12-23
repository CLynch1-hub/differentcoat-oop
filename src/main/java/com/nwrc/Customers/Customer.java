package com.nwrc.Customers;

import com.nwrc.DataAccess.Constants;


public class Customer {
    private String customerType;
    private String address;
    private String telephone;
    private double surfaceArea;
    private String roomShape;
    private double height;
    private double width;



     // Constructor 1 as defined for Trade Customer
     public Customer(String customerType, String address, String telephone, double surfaceArea) {
            this.customerType = customerType;
            this.address = address;
            this.telephone = telephone;
            this.surfaceArea = surfaceArea;
     }

      // Constructor 2 as defined for General Customer
     public Customer(String customerType, String address,
                        String telephone, String roomShape, double height, double width) {
            this.customerType = customerType;
            this.address = address;
            this.telephone = telephone;
            this.roomShape = roomShape;
            this.height = height;
            this.width = width;
    }

    // create a no argument constructor for testing
    public Customer() {
        // Initialize default values for fields
        this.customerType = "";
        this.address = "";
        this.telephone = "";
        this.surfaceArea = 0.0;
        this.roomShape = "";
        this.height = 0.0;
        this.width = 0.0;
    }


    // create method to calculate coverage (to be overridden in subclasses)
      public double calculateCoverage() {
    	  return (surfaceArea / Constants.COVERAGE) * Constants.LITRES;
    }

    // add getters and setters
    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public double getHeight() {
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
    

	public String getRoomShape() {
	    return roomShape;
	}
	
	public void setRoomShape(String roomShape) {
	    this.roomShape = roomShape;
	}


    @Override
    public String toString() {
        return "Customer {" +
                "Type: '" + customerType + '\'' +
                ", Address: '" + address + '\'' +
                ", Telephone: '" + telephone + '\'' +
                ", Surface Area: " + surfaceArea +
                ", Height: " + height +
                ", Width: " + width +
                '}';
    }

}

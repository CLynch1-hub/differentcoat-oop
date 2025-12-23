package com.nwrc.Customers;

import com.nwrc.DataAccess.Constants;


public class TradeCustomer extends Customer  {
private String tradeName;
    
    // create constructor to include base variables and tradeName
    public TradeCustomer(String customerType, String address,
                         String telephone, double surfaceArea, String tradeName) {
            super(customerType, address, telephone, surfaceArea); // base variables from customer
            this.tradeName = tradeName;
        }
    
    // create a method override for calculateCoverage from Parent to calculate Trade customer Surface area
   @Override
    public double calculateCoverage() {
        return (super.getSurfaceArea() / Constants.COVERAGE) * Constants.LITRES;
    }
    
   // Add the required Getters and Setters
    public String getTradeName() {
        return tradeName;
    }
    
    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }
    
    // ToString Method
    @Override
    public String toString() {
        return "TradeCustomer {" +
                "Trade Name: '" + tradeName + '\'' +
                ", Type: '" + getCustomerType() + '\'' +
                ", Address: '" + getAddress() + '\'' +
                ", Telephone: '" + getTelephone() + '\'' +
                ", Surface Area: " + getSurfaceArea() +
                '}';
    }
    
 
}



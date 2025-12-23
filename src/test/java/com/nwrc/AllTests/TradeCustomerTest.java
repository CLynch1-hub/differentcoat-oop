package com.nwrc.AllTests;

import com.nwrc.Customers.TradeCustomer;
import com.nwrc.DataAccess.Constants;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TradeCustomerTest {
    TradeCustomer customerData1 = null;

    @BeforeClass
    public void setup() {

        customerData1 =
                new TradeCustomer("T", "123 Main Street Buncrana", "3538754613", 351.0, "Buncrana Paint Supplies");
    }

   //  methods for validating Trade customers, to be called in the test
    public void validateTradeCustomer(TradeCustomer customer, String type,
                                      String address, String telephone, double surfaceArea, String tradeName) {
        Assert.assertEquals(customer.getCustomerType(), type);
        Assert.assertEquals(customer.getAddress(), address);
        Assert.assertEquals(customer.getTelephone(), telephone);
        Assert.assertEquals(customer.getSurfaceArea(), surfaceArea);
        Assert.assertEquals(customer.getTradeName(), tradeName);
    }

    @Test // check a trade customer based on constructor 1 - Test 3.1
    public void checkTradeCustomerData() {
        validateTradeCustomer(customerData1, "T", "123 Main Street Buncrana",
                "3538754613", 351.0, "Buncrana Paint Supplies");
    }

    //Test a sample Trade Customer on accuracy of Litres required - Test 3.2
    @Test
    public void testTradeCustomerLitresRequired() {

        // Retrieve surface area
        double surfaceArea = customerData1.getSurfaceArea();
        // Calculate liters required based on Constants.COVERAGE
        double gallonsRequired = surfaceArea / Constants.COVERAGE;
        double litersRequired = gallonsRequired * Constants.LITRES;
        // Assert the calculated liters
        Assert.assertEquals(Math.ceil(litersRequired), 5.0,
                "Expected liters of paint for TradeCustomer is rounded up to 5.0");
        System.out.println("Litres required for TradeCustomer: " + customerData1.getTradeName() +
                " - " + Math.ceil(litersRequired) + " litres");
    }

}

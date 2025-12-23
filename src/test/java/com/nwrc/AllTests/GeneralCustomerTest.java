package com.nwrc.AllTests;

import com.nwrc.Customers.Customer;
import com.nwrc.Customers.GeneralCustomer;
import com.nwrc.DataAccess.Constants;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GeneralCustomerTest {

    // set the Customer objects to null
    Customer customer = null;

    GeneralCustomer customerData2 = null;
    GeneralCustomer customerData3 = null;
    GeneralCustomer customerData4 = null;

    @BeforeClass
    public void setup() {
        // create a General customer for Constructor 2 Rectangle room
        customerData2 =
                new GeneralCustomer("G", "124 Main Street Letterkenny", "894546255", "rectangle", 12.0, 15.0, "C Lynch");
        // create a General customer for Constructor 2 square room
        customerData3 =
                new GeneralCustomer("G", "121 Hollymount Derry", "87565465", "square", 18.0, 18.0, "S OConnor");
        // create a General customer for Constructor 2 Cylinder room
        customerData4 =
                new GeneralCustomer("G", "125 Main Street Coleraine", "83456785", "cylinder", 14.0, 8.0, "A Todd");
    }

    // create a method to validate general customer, to be called in the following tests
    private void validateGeneralCustomer(GeneralCustomer customer, String type,
                                         String address, String telephone,
                                         String roomShape, double height, double width, String customerName) {
        Assert.assertEquals(customer.getCustomerType(), type);
        Assert.assertEquals(customer.getAddress(), address);
        Assert.assertEquals(customer.getTelephone(), telephone);
        Assert.assertEquals(customer.getRoomShape(), roomShape);
        Assert.assertEquals(customer.getHeight(), height);
        Assert.assertEquals(customer.getWidth(), width);
        Assert.assertEquals(customer.getCustomerName(), customerName);
    }


    @Test // check a general customer based on constructor 2 rectangle room - Test 4.1
    public void checkGeneralCustomerData2() {
        validateGeneralCustomer(customerData2, "G", "124 Main Street Letterkenny",
                "894546255", "rectangle", 12.0, 15.0, "C Lynch");
    }

    @Test // check a general customer based on constructor 2 square room - Test 4.2
    public void checkGeneralCustomerData3() {
        validateGeneralCustomer(customerData3, "G", "121 Hollymount Derry",
                "87565465", "square", 18.0, 18.0, "S OConnor");
    }
    @Test // check a general customer based on constructor 2 cylinder room - Test 4.3
    public void checkGeneralCustomerData4() {
        validateGeneralCustomer(customerData4, "G", "125 Main Street Coleraine",
                "83456785", "cylinder", 14.0, 8.0, "A Todd");
    }

    // test paint required for customerData2 rectangle room - Test 4.4
    @Test
    public void testGeneralCustomerLitresRequired() {

        GeneralCustomer generalCustomer =
                new GeneralCustomer("G", "124 Main Street Letterkenny", "894546254", "rectangle", 12.0, 15.0, "C Lynch");
        // Calculate wall area using room shape dimensions
        double perimeter = 2 * (customerData2.getHeight() + customerData2.getWidth()); // Perimeter for rectangle
        double height = customerData2.getHeight();
        double wallArea = perimeter * height;
        // Subtract windows and doors
        double windowArea = 2 * Constants.WINDOW;
        double doorArea = Constants.DOOR;
        double paintArea = wallArea - (windowArea + doorArea);

        // Calculate liters required
        double gallonsRequired = paintArea / Constants.COVERAGE;
        double litersRequired = gallonsRequired * Constants.LITRES;

        Assert.assertEquals(Math.ceil(litersRequired), 8.0,
                "Expected litres of paint for GeneralCustomer is 8.0");
        System.out.println("litres required for GeneralCustomer: " + customerData2.getCustomerName()
                + " = " + Math.ceil(litersRequired) + " litres");
    }

}

package com.nwrc.AllTests;

import com.nwrc.Customers.Customer;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckTest {

    // set the Customer objects to null
    Customer customer = null;

    @BeforeClass
    public void setup() {
        customer = new Customer();
    }

    @Test // parent test on customer type - Test 1.1
    public void checkCustTypeInit() {
        Assert.assertEquals(customer.getCustomerType(), "");
    }

    @Test // parent test on address - Test 1.2
    public void checkCustAddressInit() {
        Assert.assertEquals(customer.getAddress(), "");
    }

    @Test // parent test on phone - Test 1.3
    public void checkCustPhoneInit() {
        Assert.assertEquals(customer.getTelephone(), "");
    }

    @Test // parent test on Area - Test 1.4
    public void checkAreaInit() {
        Assert.assertEquals(customer.getSurfaceArea(), 0.0);
    }

    @Test // parent test on Height - Test 1.5
    public void checkHeightInit() {
        Assert.assertEquals(customer.getHeight(), 0.0);
    }

    @Test // parent test on Room Shape - Test 1.6
    public void checkRoomShapeInit() {
        Assert.assertEquals(customer.getRoomShape(), "");
    }

    @Test // parent test on Surface Width - Test 1.7
    public void checkWidthInit() {
        Assert.assertEquals(customer.getWidth(), 0.0);
    }

    @Test(dependsOnMethods = "checkCustTypeInit") // child test on customer type - Test 2.1
    public void checkCustType() {
        customer.setCustomerType("T");
        Assert.assertEquals(customer.getCustomerType(), "T");
    }

    @Test(dependsOnMethods = "checkCustAddressInit") // child test on address - Test 2.2
    public void checkCustAddress() {
        customer.setAddress("123 main st");
        Assert.assertEquals(customer.getAddress(), "123 main st");
    }

    @Test(dependsOnMethods = "checkCustPhoneInit") // child test on phone - Test 2.3
    public void checkCustPhone() {
        customer.setTelephone("89123");
        Assert.assertEquals(customer.getTelephone(), "89123");
    }

    @Test(dependsOnMethods = "checkAreaInit") // child test on Area - Test 2.4
    public void checkArea() {
        customer.setSurfaceArea(160.0);
        Assert.assertEquals(customer.getSurfaceArea(), 160.0);
    }

    @Test(dependsOnMethods = "checkHeightInit") // child test on Height - Test 2.5
    public void checkHeight() {
        customer.setHeight(8.0);
        Assert.assertEquals(customer.getHeight(), 8.0);
    }

    @Test(dependsOnMethods = "checkRoomShapeInit") // child test on Room Shape - Test 2.6
    public void checkRoomShape() {
        customer.setRoomShape("square");
        Assert.assertEquals(customer.getRoomShape(), "square");
    }

    @Test(dependsOnMethods = "checkWidthInit") // child test on Width - Test 2.7
    public void checkWidth() {
        customer.setWidth(15.0);
        Assert.assertEquals(customer.getWidth(), 15.0);
    }

}

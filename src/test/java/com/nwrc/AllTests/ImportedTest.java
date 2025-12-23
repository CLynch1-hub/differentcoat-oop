package com.nwrc.AllTests;

import com.nwrc.Customers.Customer;
import com.nwrc.Customers.GeneralCustomer;
import com.nwrc.Customers.TradeCustomer;
import com.nwrc.Utilities.Helper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ImportedTest {

    // Variables for imported data
    ArrayList<Customer> importedCustomers;

    @BeforeClass
    public void setup() {
        Helper helper = new Helper();

        // Specify the file path for the test CSV file
        String filePath = "C:\\Users\\Ciaran Lynch\\Desktop\\DataFile.csv";

        // Read data from CSV file
        List<String> customerRecords = helper.readFileIntoList(filePath);

        // Initialize the customer list
        importedCustomers = new ArrayList<>();

        // Process each CSV record and create Customer objects
        for (String record : customerRecords) {
            String[] fields = record.split(";");
            String customerType = fields[0].trim();

            if ("T".equalsIgnoreCase(customerType)) { // Trade Customer
                String address = fields[1].trim();
                String telephone = fields[2].trim();
                double surfaceArea = Double.parseDouble(fields[3].trim());
                String tradeName = fields[4].trim();
                importedCustomers.add(new TradeCustomer(customerType, address, telephone, surfaceArea, tradeName));
            } else if ("G".equalsIgnoreCase(customerType)) { // General Customer
                String address = fields[1].trim();
                String telephone = fields[2].trim();
                String roomShape = fields[3].trim().toLowerCase();
                double height = Double.parseDouble(fields[4].trim());
                double width = Double.parseDouble(fields[5].trim());
                String customerName = fields[6].trim();
                importedCustomers.add(new GeneralCustomer(customerType, address, telephone, roomShape, height, width, customerName));
            }
        }

        // Verify data was imported correctly
        Assert.assertNotNull(importedCustomers, "Customer list should not be null.");
        Assert.assertFalse(importedCustomers.isEmpty(), "Customer list should not be empty.");
    }


    @Test // Test GeneralCustomer Data - Test 6.1
    public void testGeneralCustomerData() {
        for (Customer customer : importedCustomers) {
            if ("G".equalsIgnoreCase(customer.getCustomerType())) {

                Assert.assertTrue(customer.getHeight() > 0, "GeneralCustomer height should be greater than 0.");
                Assert.assertTrue(customer.getWidth() > 0, "GeneralCustomer width should be greater than 0.");
                System.out.println("Validated GeneralCustomer address is : " + customer.getAddress());
            }
        }
    }

    @Test // Test TradeCustomer Data - Test 6.2
    public void testTradeCustomerData() {
        for (Customer customer : importedCustomers) {
            if ("T".equalsIgnoreCase(customer.getCustomerType())) {
                // Validate TradeCustomer fields
                Assert.assertNotNull(customer.getAddress(), "TradeCustomer address should not be null.");
                Assert.assertTrue(customer.getSurfaceArea() > 0, "TradeCustomer surface area should be greater than 0.");
                System.out.println("Validated TradeCustomer address is : " + customer.getAddress());
            }
        }
    }

}

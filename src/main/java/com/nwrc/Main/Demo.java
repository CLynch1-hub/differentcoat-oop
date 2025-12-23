package com.nwrc.Main;


import com.nwrc.Customers.GeneralCustomer;
import com.nwrc.Customers.TradeCustomer;
import com.nwrc.Utilities.Helper;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
    	// print online Help
    	OnlineHelp(); // Print out an online help from the method below
    	 	
    	
    	// define location of File and its directory
    	
    	String directory = "C:/Users/Ciaran Lynch/Desktop/";
        String fileName = "DataFile.csv";
        String fileComplete = directory + fileName;
        System.out.println("Directory is " + directory);
       
        // instantiate the Helper object
    	Helper helperObj = new Helper();
        // Import customers into helper object
        // List<String>  myCustomerRecords = null;
        List<String> myCustomerRecords = helperObj.readFileIntoList(fileComplete);
        
        //validate the records are initialised
        System.out.println("Number of records in list is " + myCustomerRecords.size() );
        System.out.println("First record in list is " + myCustomerRecords.get(0) );
        System.out.println("==============================================");
        System.out.println("Customer Data:");
    	
        
        // create a for loop to run through the datafile and show records deliminiated by ; and show customer type
        for (int index = 0; index < myCustomerRecords.size(); index++ ) 
        {
        	
        	System.out.println("==============================");
        	
        	System.out.println("Record " + myCustomerRecords.get(index) );
        	String[] individualFields = myCustomerRecords.get(index).split(";");
        	System.out.println("Customer type is " + individualFields[0].trim());
        	String CustomerType = individualFields[0].trim();
        	// System.out.println("Customer type assigned " + CustomerType);
        	
        	
        	if(CustomerType.equals("T")) 
        	{
        		   
        			String address = individualFields[1].trim();
        			String telephone = individualFields[2].trim();
        			double surfaceArea = Double.parseDouble(individualFields[3].trim());
        			String tradeName = individualFields[4].trim();
        			TradeCustomer trade = 
        					new TradeCustomer(CustomerType, address, telephone, surfaceArea, tradeName);
        			System.out.println("Paint Required is " + Math.ceil(trade.calculateCoverage()));
        			
        		
        	} 
        	else if (CustomerType.equals("G"))
        	{
        		String Address = individualFields[1].trim();
    			String telephone = individualFields[2].trim();
    			String roomShape = individualFields[3].trim().toLowerCase();
    			double height = Double.parseDouble(individualFields[4].trim());
    			double width = Double.parseDouble(individualFields[5].trim());
    			String customerName = individualFields[6].trim();
    			GeneralCustomer general = 
    					new GeneralCustomer(CustomerType, Address, telephone, roomShape, height, width, customerName);
    			System.out.println("Paint Required is " + Math.ceil(general.calculateCoverage()));
    			// System.out.println("Paint Required is " + general.calculateCoverage());
        		
        	}
        }
		
    }
   
    // Create a method to provide online help
	 public static void OnlineHelp() {
		 	System.out.println("Welcome to Different Coat Paint Calculations");
		 	System.out.println("==============================================");
		 	System.out.println("Please ensure that the Datafile is saved to the correct location " +
		 			"and all customers have been added");
		 	System.out.println("Please note the following information......");
		 	System.out.println("1.  Our system will review & provide the list of customers from the saved data file"); 
		 	System.out.println("2.  We will also process the total amount of Paint Required, based on Paint Area "
		 			+ "& provide a calculation for each customer"); 
		 	System.out.println("3.  The customer Type - T, will refer to our Trade customer & customer type - G,"
		 			+ " will refer to our General customer"); 
		 	System.out.println("4.  The Paint Area is the Perimeter of the room "
					+ "Multiplied by the Height of the room, less 1 Door and 2 Windows "
		 			+ "and is given in Sq Feet"); 
		 	System.out.println("5.  We will provide you with the total Litres required, "
		 			+ "based on 1 coat of paint");
		 	System.out.println("Thank you for your assistance");
		 	System.out.println("==============================================");
	 } 
}

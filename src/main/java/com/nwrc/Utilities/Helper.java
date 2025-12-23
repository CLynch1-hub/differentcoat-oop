package com.nwrc.Utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Helper {

	// Method to read and read in data from the CSV file
		private List<String> myListOfRecords = null;
		
		public List<String> readFileIntoList(String file) {
	       

	        try {
	        	myListOfRecords = Files.readAllLines(Paths.get(file));
	            
	        } catch (IOException e) {
	        	e.printStackTrace();
	            System.out.println("Check directory or file name: ");
	        }
	        return myListOfRecords;
	    }
}

# DifferentCoat — Java OOP Paint Coverage System
A fully object oriented Java application designed to calculate paint requirements for different room shapes, supporting both general public and trade customers. This project demonstrates strong OOP design, UML driven development, file handling, inheritance, polymorphism, testing, and documentation — built using IntelliJ IDEA.

Project Overview
DifferentCoat staff needed a system to help customers calculate how much paint is required to paint a room — avoiding over buying or under buying. This Java OOP solution:
•	Reads customer records from a CSV file
•	Determines room shape and dimensions
•	Calculates surface area
•	Applies paint coverage rules
•	Outputs a formatted breakdown for each customer
•	Supports both General and Trade customers
•	Uses inheritance, polymorphism, abstraction, and encapsulation

Object Oriented Design
Base Class — Customer
Stores shared attributes:
•	Customer type
•	Address
•	Telephone
•	Surface area
•	Room shape
•	Height
•	Width
Includes:
•	Two constructors (surface area based & dimension based)
•	calculateCoverage() base method
•	Getters/setters
•	Overridable toString()
Derived Classes
GeneralCustomer
•	Adds: customerName
•	Overrides: calculateCoverage()
•	Overrides: toString()
•	Calculates area from height × width × shape
TradeCustomer
•	Adds: tradeName
•	Overrides: calculateCoverage()
•	Overrides: toString()
•	Uses pre provided surface area
Shapes Package
Implements polymorphic area calculations:
•	Shape (interface)
•	Square
•	Rectangle
•	Circle
•	Cylinder (extends Circle)
Each class implements:
•	getArea()
•	getPerimeter()

Constants Class
Stores reusable values:
•	Paint coverage per gallon
•	Litres conversion
•	Window/door area deductions
•	Shape identifiers
Helper Class
•	Reads DataFile.csv
•	Parses each record
•	Returns an ArrayList of customer objects

Demo Class
Runs the full system:
1.	Explains how the system works
2.	Loads customer data
3.	Instantiates correct customer types
4.	Outputs formatted paint calculations

Testing
TestNg tests included:
•	Customer object creation
•	Coverage calculations
•	Constants validation
•	File import tests
•	Shape area calculations
Test plan and logs are stored in:  report/DifferentCoat Test Plan.xlsm

Documentation
All coursework documentation is included in the docs/ folder:
•	Design specification
•	Implementation write up
•	Portfolio submission
•	User documentation
•	Assignment briefs
This provides full traceability from design → implementation → testing.

How to Run the Program
1.	Open the project in IntelliJ IDEA
2.	Ensure the folder structure matches src/main/java/com/nwrc/...
3.	Place DataFile.csv in the data/ folder
4.	Run: com.nwrc.Main.Demo
5.	View the console output for:
Customer details
Room shape
Calculated paint required
Coverage breakdown

Key Features
•	Full OOP architecture
•	Inheritance & polymorphism
•	File handling
•	Shape based area calculations
•	Customer type specific logic
•	Unit testing
•	Professional documentation
•	Real world problem modelling







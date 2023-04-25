package com.infy;

public class Customer { // Instance Variables
	public String customerId; // Attributes = State of a real life entity
	public String customerName; // Each real life entity has its own values
	public long contactNumber; // Instance variable has data type associated such as String and long
	public String address;
	
	// A Method that represents behavior of displaying details of the customer
	public void displayCustomerDetails() { //Instance Method
		System.out.println("Displaying customer details \n***********");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Address : " + address);
		System.out.println();
	}
}

// To execute and invoke the Method above using Tester
class Tester {
	public static void main(String[] args) {

		// Object creation
		Customer customer = new Customer(); // customer = reference variable

		// Assigning values to the instance variables
		customer.customerId = "C101";
		customer.customerName = "Stephen Abram";
		customer.contactNumber = 7856341287L;
		customer.address = "D089, St. Louis Street, Springfield, 62729";

		// Displaying the customer details
		customer.displayCustomerDetails();
		// Move the above statement immediately after the object creation
		// statement and observe the output

	}
}
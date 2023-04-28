package assignment1;

import java.util.Scanner;

public class SelectionControl5 {
	public static void main(String[] args) {
		// Implement your code here 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Account Number: ");
		int accountnumber = scanner.nextInt();
		System.out.print("Enter Salary: ");
		int salary = scanner.nextInt();
		System.out.print("Enter Account Balance: ");
		int accountbalance = scanner.nextInt();
		System.out.print("Enter Loan Type: ");
		String loantype = scanner.next();
		System.out.print("Enter Loan Amount: ");
		int loanamount = scanner.nextInt();
		System.out.print("EMIs Expected: ");
		int emi = scanner.nextInt();
		
		if (accountnumber < 1000 || accountnumber > 1999) {
			System.out.println("You are ineligible for loan");
		} else if (accountbalance < 1000) {
			System.out.println("You are ineligible for loan");
		} else {
			if (loantype == "Car"){
				if (salary > 25000) {
					System.out.println("Eligible Loan Amount = 500000");
					System.out.println("Eligible EMIs = 36");
				} else {
					System.out.println("You are ineligible for loan");
				}
			}
		}
	}
}

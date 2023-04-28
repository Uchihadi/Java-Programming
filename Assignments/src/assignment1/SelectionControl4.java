package assignment1;

import java.util.Scanner;

public class SelectionControl4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter foodtype: ");
		String foodtype = scanner.next();
		System.out.print("Enter Quantity: ");
		int quantity = scanner.nextInt();
		System.out.print("Enter Distance: ");
		int distance = scanner.nextInt();
		
		int price, billAmt, deliverycharge;
		
		switch (foodtype) {
			case "V" :
				price = 12;
				if (quantity < 1 || distance <= 0) {
					billAmt = -1;
					System.out.println(billAmt);
				} else {
					if (distance > 3 && distance <= 6) {
						deliverycharge = distance * 1;
						System.out.println(price*quantity + deliverycharge);
					} else if (distance > 6) {
						deliverycharge = 3 + (distance - 6)*2;
						System.out.println(price*quantity + deliverycharge);
					} else {
						System.out.println(price*quantity);
					}
				}
				break;
				
			case "N":
				price = 15;
				if (quantity < 1 || distance <= 0) {
					billAmt = -1;
					System.out.println(billAmt);
				} else {
					if (distance > 3 && distance <= 6) {
						deliverycharge = distance * 1;
						System.out.println(price*quantity + deliverycharge);
					} else if (distance > 6) {
						deliverycharge = 3 + (distance - 6)*2;
						System.out.println(price*quantity + deliverycharge);
					} else {
						System.out.println(price*quantity);
					}
				}
				break;
		}
	}
}

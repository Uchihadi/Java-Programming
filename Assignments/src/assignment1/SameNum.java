package assignment1;

import java.util.Scanner;

public class SameNum {
	public static void main(String[] args) {
		// Implement your code here
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter num1:");		
		int num1 = scanner.nextInt();
		
		System.out.print("Enter num2:");
		int num2 = scanner.nextInt();
		
		if (num1 == num2){
			System.out.println(num1 + num2);
		} else {
			System.out.println((num1 + num2) *2);
		}
	}
}

package assignment1;

import java.util.Scanner;

public class IterationControl1 {
	public static void main(String[] args) {
		// Implement your code here
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Input: ");
		
		int num = scanner.nextInt();
		int i, factorial = 1;
		
		for (i = 1; i <= num; i++) {
			factorial *= i;
		}
		
		System.out.println(factorial);
	}
}

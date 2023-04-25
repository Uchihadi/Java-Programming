package assignment1;

import java.util.Scanner;

public class CelsiustoFahrenheit {
	public static void main(String[] args) {
		// Implement your code here
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Fahrenheit:");
		
		int fahrenheit = scanner.nextInt();
		float celsius = ((fahrenheit - 32)/9)*5;
		System.out.println(celsius);
	}
	
}

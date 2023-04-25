package assignment1;

import java.util.Scanner;

//Selection Control Structure 2
public class QuadraticEquation {
	public static void main(String[] args) {
		// Implement your code here 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a:");		
		int a = scanner.nextInt();
		
		System.out.print("Enter b:");		
		int b = scanner.nextInt();
		
		System.out.print("Enter c:");		
		int c = scanner.nextInt();
		
		double discriminant = b*b - 4*a*c;
		
		if (discriminant == 0) {
			double x = (-b + discriminant) / 2*a;
			System.out.println("The root is " + x);
		}else if (discriminant > 0) {
			double x = (-b + discriminant) / 2*a;
			double y = (-b - discriminant) / 2*a;
			System.out.println("The root is " + x + " & " + y);
		}else {
			System.out.println("The equation has no real roots");
		}
	}
}

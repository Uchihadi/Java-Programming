package assignment1;

import java.util.Scanner;

public class IterationControl2 {
	public static void main(String[] args) {
		// Implement your code here 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Input: ");
		
		int num = scanner.nextInt();
		int i, startnum = 1;
		
		for (i = 1; i < num; i++) {
			startnum*=2;
			if (i != (num -1)) {
				System.out.print(startnum + ", ");
			}else {
				System.out.print(startnum);
			}
		}
	}
}

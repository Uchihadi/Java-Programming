package assignment1;

public class SelectionControl3 {
	public static void main(String[] args) {
		// Implement your code here 
		int num1 = 3, num2 = 7, num3 = 8;
		
		if (num1 == 7) {
			System.out.println(num2 * num3);
		} else if (num2 == 7) {
			System.out.println(num3);
		} else if (num3 == 7) {
			System.out.println("-1");
		} else {
			System.out.println(num1*num2*num3);
		}
	}
}

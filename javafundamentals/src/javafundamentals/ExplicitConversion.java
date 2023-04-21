package javafundamentals;

public class ExplicitConversion {
	public static void main(String[] args) {
		
		int discountPercentage = 10;
		// Implicit Conversion
		// double newDiscountPercentage = discountPercentage; 

		double totalPrice = 200;
		double priceAfterDiscount = totalPrice * (1 - ((double)discountPercentage / 100)); 

		System.out.println("Customer has paid a bill of amount: "+ priceAfterDiscount);
	}

}

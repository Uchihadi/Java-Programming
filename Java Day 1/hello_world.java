public static void main(String[] args) {
	int discount = 10; // discount is a variable
	double totalPrice = 200; // totalPrice is a variable
	double priceAfterDiscount = totalPrice * (1 - ((double) discount / 100)); // priceAfterDiscount is a variable
	System.out.println("Customer has paid a bill of amount: "+ priceAfterDiscount);
}

class Demo {
	public static void main(String[] args) {
		int quantity;
		float totalCost = 10 * quantity; // error on this line
		System.out.println(totalCost);
	}
}

public static void main(String args[]) {
	int discountPercentage = 10;
	double totalPrice = 800;
	double priceAfterDiscount = totalPrice * (1 - ((double) discountPercentage / 100));
	if (totalPrice > 500) {
		priceAfterDiscount = priceAfterDiscount * (1 - ((double) 5 / 100));
	}
	System.out.println("Customer has paid a bill of amount: "+ priceAfterDiscount);
}


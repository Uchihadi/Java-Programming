package arrays;

public class Tester {
	public static void main(String[] args) {
		long[] restaurantContacts = { 9992346725L, 9992346726L, 9992346727L };
		Restaurant restaurant1 = new Restaurant("SwiftFood",
				restaurantContacts, "Carolina Street, Springfield, 62702", 4.1f);
		restaurant1.displayRestaurantDetails();
	}
}

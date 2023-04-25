package arrays;

public class ForEachLoop {
	public static void main(String[] args) {
		long[] restaurantContacts = { 9992346725L, 9992346726L, 9992346727L };
		// It displays the array elements one by one. 
		// Holds the array element in a variable then executes body of the loop
		for (long contactNumber : restaurantContacts) {
			System.out.println(contactNumber);
		}
	}
}


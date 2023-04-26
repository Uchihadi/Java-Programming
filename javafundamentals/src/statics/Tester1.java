package statics;

public class Tester1 {
	public static void main(String[] args) {
		StaticMethod customer1 = new StaticMethod("Sam", 9945000009L, "Carolina Street, Springfield, 62702");
		StaticMethod customer2 = new StaticMethod("John", 9645000009L, "Carolina Street, Springfield, 62708");
		StaticMethod customer3 = new StaticMethod("Alex", 9745000009L, "Carolina Street, Springfield, 62768");
		System.out.println("Customer Id for the first customer is: " + customer1.getCustomerId());
		System.out.println("Customer Id for the second customer is: " + customer2.getCustomerId());
		System.out.println("Customer Id for the third customer is: " + customer3.getCustomerId());
	}
}

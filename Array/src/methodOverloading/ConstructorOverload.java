package methodOverloading;

class ConstructorOverload {
	private String customerId;
	private String customerName;
	private long contactNumber;
	private Address address;
	// Parameterless constructor
	public ConstructorOverload() {
		System.out.println("Inside parameterless constructor");
	}
	// Parameterized constructor
	public ConstructorOverload(String customerId, String customerName, long contactNumber,
			Address address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	// Parameterized constructor
	public ConstructorOverload(String customerName, long contactNumber, Address address) {
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	// Methods including getter and setter and other methods
}

public class Tester1 {
	public static void main(String[] args) throws Exception {
		/*
		 Parameterless constructor will be invoked, instance variables should
		 be initialized using setter methods
		 */
		ConstructorOverload customerOne = new ConstructorOverload();
		/*
		 Parameterized constructor with four parameters instance variables are
		 initialized in the constructor
		 */
		ConstructorOverload customerTwo = new ConstructorOverload("C1016", "Stephen Abram",
				7856341287L, new Address("D089", "St. Louis Street",
						"Springfield", 62729));
		/*
		 Parameterized constructor with three parameters instance variables
		 are initialized in the constructor
		 */
		ConstructorOverload customerThree = new ConstructorOverload("James Jonathan", 7828171287L,
				new Address("D159", "St. Louis Street", "Springfield", 62729));
	}
}

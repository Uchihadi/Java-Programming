package methods;

public class ParameterisedConstructor { 
	public String customerId; 
	public String customerName; 
	public long contactNumber; 
	public String address; 
			
	/*public Customer() { 
		System.out.println("Parameterless constructor called"); 
	}*/
		   
	public ParameterisedConstructor (String cId, String cName, String add, long contact) { 
		System.out.println("Parameterized constructor called"); 
		customerId = cId; 
		customerName = cName; 
		contactNumber = contact; 
		address = add; 
	} 
} 

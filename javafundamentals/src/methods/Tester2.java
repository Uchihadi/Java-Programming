package methods;

public class Tester2 {
	public static void main(String args[]) { 
	    //the below line will lead to an error as there is no default constructor
		//ParameterisedConstructor customer2 = new ParameterisedConstructor(); 	
        //if a parameterized constructor is created in a class, java doesn't create a default constructor
        //uncomment the parameterless constructor and then execute the code
        
        //the below code leads to an error as the parameters accepted by the constructor does not match the parameters passed
		ParameterisedConstructor customer1 = new ParameterisedConstructor("C103", "Jacob", "13th Street New York", 5648394590L); 
		//the order and type of the parameters passed for a parameterized constructor should match the definition properly
		System.out.println(customer1);
    } 
}

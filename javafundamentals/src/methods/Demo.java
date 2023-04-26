package methods;

public class Demo {
	public int var1; // Instance variable of the class

	public void printValue() {
		int var2 = 20; // Local variable of the method
		System.out.println(var1);
		System.out.println(var2); // Local variable is accessible only inside
									// the method
	}
}

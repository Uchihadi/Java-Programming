package methods;

public class Tester {

	public static void main(String args[]) {
		Demo demo = new Demo();
		demo.var1 = 10; // Instance variable can be accessed from outside the
						// class with the help of object
		demo.printValue();

		// Local variables cannot be accessed outside a method
		// Below lines will lead to a compilation error saying that var2 is not
		// a field or variable
		// System.out.println(demo.var2);
		// System.out.println(var2);
	}

}

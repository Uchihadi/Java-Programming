package methodOverloading;

public class Polymorphism {

	// Method to find the area of circle
	public float calculateArea(float radius) {
		return 3.14f * radius * radius;
	}

	// Method to find the area of rectangle
	public float calculateArea(float length, float breadth) {
		return length * breadth;
	}

	// Code another overloaded method to find the area of triangle
}

class Tester {
	public static void main(String[] args) {

		Polymorphism shape = new Polymorphism();
		
		// Invoke the method to find the area of triangle
		float circleArea = shape.calculateArea(1.7f);
		float rectangleArea = shape.calculateArea(2.5f, 3.4f);
		
		// Display the area of triangle
		System.out.println("Area of circle: " + circleArea);
		System.out.println("Area of rectangle: " + rectangleArea);
		
	}
}

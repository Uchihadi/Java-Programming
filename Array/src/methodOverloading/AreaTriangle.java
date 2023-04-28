package methodOverloading;

class AreaTriangle {

	// Method to find the area of circle
	public float calculateArea(float radius) {
		return 3.14f * radius * radius;
	}

	// Method to find the area of rectangle
	public float calculateArea(float length, float breadth) {
		return length * breadth;
	}

	// Code another overloaded method to find the area of triangle
	// Method to find the area of triangle
	public float calculateArea(int height, float breadth) {
		return height * breadth / 2;
	}
}

class TesterAreaTriangle {

	public static void main(String[] args) {

		AreaTriangle shape = new AreaTriangle();

		float circleArea = shape.calculateArea(1.7f);
		float rectangleArea = shape.calculateArea(2.5f, 3.4f);
		float triangleArea = shape.calculateArea(2.5f, 3.4f);

		System.out.println("Area of circle: " + circleArea);
		System.out.println("Area of rectangle: " + rectangleArea);
		System.out.println("Area of triangle: " + triangleArea);
	}
}

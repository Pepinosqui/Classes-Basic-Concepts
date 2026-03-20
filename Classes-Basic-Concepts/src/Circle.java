public class Circle extends GeometricObject {
	// Class parameters
	private static final double PI = 3.141592;
	
	private double radius;
	public static int nCircles;
	
	
	// Constructors
	
	public Circle() {
		radius = 1.0;
		++nCircles;
	}
	
	public Circle(double radius) {
		this.radius = radius;
		++nCircles;
	}
	
	
	// Getters
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return PI * radius * radius;
	}
	
	
	// Setters
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	
	// Other methods
	
	public static void printNCircles() {
		System.out.println(nCircles);
	}
}

import java.util.Date;

public class PrincipalClass {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// Creates and instantiates the first pair of objects,
		//  using the default constructor
		Rectangle rect1 = new Rectangle();
		Circle circ1 = new Circle();
		
		// Obtains the Date object of either one geometric objects
		Date firstDate = rect1.getDateCreated();
		
		// Prints all data from each object
		System.out.print("Rectangle 1 has an area of " + rect1.getArea()
				+ " with a width of " + rect1.getWidth()
				+ " and a height of " + rect1.getHeight() + "\n");
		System.out.print("Its color is " + rect1.getColor() + " and it's" +
				(rect1.isFilled() ? " " : " not ") + "filled\n\n");
		System.out.print("Circle 1 has an area of " + circ1.getArea()
				+ " with a radius of " + circ1.getRadius() + "\n");
		System.out.print("Its color is " + circ1.getColor() + " and it's" +
				(circ1.isFilled() ? " " : " not ") + "filled\n\n");
		System.out.print("Both were created in " + firstDate.toString()
				+ "\n\n\n");
		
		// Sleeps the program for three seconds
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			System.out.println("NEIN");
		}
		
		// Creates and instantiates the second pair of objects,
		//  using the constructor that initializes the parameters
		Rectangle rect2 = new Rectangle(2.7182, 1.6180);
		Circle circ2 = new Circle(3.14159);
		
		// Obtains the Date object of either one geometric objects
		Date secondDate = circ2.getDateCreated();
		
		// Prints all data from the second pair of objects
		System.out.print("Rectangle 2 has an area of " + rect2.getArea()
				+ " with a width of " + rect2.getWidth()
				+ " and a height of " + rect2.getHeight() + "\n");
		System.out.print("Its color is " + rect2.getColor() + " and it's" +
				(rect2.isFilled() ? " " : " not ") + "filled\n\n");
		System.out.print("Circle 2 has an area of " + circ2.getArea()
				+ " with a radius of " + circ2.getRadius() + "\n");
		System.out.print("Its color is " + circ2.getColor() + " and it's" +
				(circ2.isFilled() ? " " : " not ") + "filled\n\n");
		System.out.print("Both were created in " + secondDate.toString());
	}
}

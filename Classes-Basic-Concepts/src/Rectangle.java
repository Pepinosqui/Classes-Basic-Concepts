
public abstract class Rectangle extends GeometricObject {
	private double height;
	private double width;
	
	public Rectangle(double height, double width, String color, boolean filled) {
		super(color,filled); // o super.setColor(color)
		this.height = height;
		this.width = width;
	}
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	public Rectangle() {
		height = 1;
		width = 1;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getArea() {
		return (height * width);
	}
	
	public abstract double getArea();
		
}

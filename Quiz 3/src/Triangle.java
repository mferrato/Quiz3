public class Triangle extends GeometricObject {

	// Variables

	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	// Constructors

	public Triangle() {
		// No arg constructor, creates a default instance of a triangle
	}

	public Triangle(double side1, double side2, double side3) {
		// Creates a new instance of a triangle with the specified sides
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

	}

	// Getters and Setters

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	@Override
	public String toString() {
		// Makes a description of a triangle and its sides
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3="
				+ side3 + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double getArea() {
		// Calculating area using Heron's formula
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}

	@Override
	public double getPerimeter() {
		// Calculating perimeter using a+b+c=x
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}

}

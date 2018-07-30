public class Rectangle extends Shape{
	//instance variables
	private double sideA;
	private double sideB;
	
	//constructors
	public Rectangle(double sideA, double sideB) {
		this.sideA = sideA;
		this.sideB = sideB;
	}//end of default constructor
	
	//setters
	public void setSides(double sideA, double sideB) {
		this.sideA = sideA;
		this.sideB = sideB;
	}//end of setSides()
	
	//getters
	public double getSideA() {
		return sideA;
	}//end of getSideA()
	
	public double getSideB() {
		return sideB;
	}//end of getSideB()
	
	//implement abstract methods
	public double area() {
		return sideA * sideB;
	}//end of area()
	
}//end of Rectangle
public class Triangle extends Shape{
	//instance variables
	private double height;
	private double base;
	
	//constructors
	public Triangle(double height, double base) {
		this.height = height;
		this.base = base;
	}//end of default constructor 
	
	//setters
	public void setHeight(double height) {
		this.height = height;
	}//end of setHeight
	
	public void setBase(double base) {
		this.base = base;
	}//end of setBase
	
	//getters
	public double getHeight() {
		return this.height;
	}//end of getHeight()
	
	public double getBase() {
		return this.base;
	}//end of getBase()
	
	//implement abstract methods
	public double area() {
		return 0.5 * base * height;
	}//end of area()
	
}//end of Triangle
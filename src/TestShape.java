public class TestShape {

	public static void main(String[] args) {
		Shape[] myShapes = new Shape[2];
		myShapes[0] = new Triangle(4.0, 10.0);
		myShapes[1] = new Rectangle(2.0, 3.0);
		for(int i = 0; i < myShapes.length; i++) {
			System.out.println("The area is: " + myShapes[i].area());
		}//end of for loop
	}//end of main method
}//end of TestShape
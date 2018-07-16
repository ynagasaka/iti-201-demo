public class JavaLecture1 {
	public static void main(String[] args) {
		// this is a comment
		/* This
		 * is
		 * a
		 * multi line comment
		 * <- these stars are not necessary
		 * */
		
		//Java Naming Convention
		//Class names should begin with a capital letter
		//Constants, should be all capital --> PI
		//methods, packages, variables, and almost anything else in Java
		//should be in lower class
		//When you are stringing words together to name something
		//such as the file name for this class, use CamelCase
		//example variable--> firstName
		//example class --> MyFirstClass
		//example constant --> SALESTAX
		
		/* 8 Primitive Types 
		 * 4 integer types are: byte, short, int, long
		 */
		byte myByte = 127; //this variable is initialized
		short myShort = 32000;
		int myInt = 1000;
		long myLong = 1000000;
		byte myByte2; //this is declared, but not initialized
		myByte2 = myByte; //it was not initialized
		myByte2 = 120; //it is now reassigned
		
		/* 2 decimal types of primitives: float and double */
		float myFloat = 1.0f; 
		double myDouble = 2.3; //more accurate, precise
		
		/* non-numerical primitives */
		// boolean takes one of two values, either true or false
		boolean myBoolean = true;
		boolean myBoolean2 = false;
		
		//char is EXACTLY one character
		char myChar = 'a';
		char myChar2 = "a";
		
	}//end of the method
}//end of the JavaLecture1 class
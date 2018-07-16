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
		
		//print what we have
		System.out.println("This prints on one line then goes to the next");
		//System.out.print("This prints on one line then stays there");
		//System.out.print("...See what I mean?");
		System.out.println("My character is: " + myChar);
		System.out.println("My int is: " + myInt);
		
		// Strings --> sequence of characters (or they can also be a single character)
		String myString = "Yuta";
		//				   0123
		System.out.println("My String is: " + myString);
		
		String myString2 = "Another String";
		// 					0123456789....
		System.out.println(myString + myString2);
		System.out.println("My String is: " + myString);
		System.out.println("This was my first string: myString" + " and this was my second: " + myString2);
		
		int x = 10;
		int y = 11;
		System.out.println("The sum of x and y is: " + (x + y));
		System.out.println(myString.charAt(2)); //call the charAt method on the String myString
		System.out.println(myString.substring(1));//call the substring method on myString --> get the second character on...
		System.out.println("My String is: " + myString);
		
	}//end of the method
}//end of the JavaLecture1 class
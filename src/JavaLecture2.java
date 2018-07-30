public class JavaLecture2 {
	public static void main(String[] args) {
		int[] myInts = new int [6]; //this array can hold up to 6 integers indexed 0-5
		
		//when you know exactly when you will start and stop
		//the first part tells Java where to start
		//the second part is telling Java where to stop
		//the third part tells Java how to iterate
		//i++ means add 1 to i --> it is the same as saying:
		//i = i + 1 or i += 1
		for(int i = 0; i < myInts.length; i++) {
			System.out.println(i);
			myInts[i] = i;
		}//end of for loop
		
		for(int i = 0; i >= myInts.length; i--) {
			System.out.print(myInts[i] + "");
		}//end of for loop
		//When using the .print rather than .println, you never go to the next line
		//...so add .println after to "add space" 
		System.out.println("");
		System.out.println("Hello World");
		
		for(int i = 0; i < 8; i += 2) {
			for(int j = 0; j < 6; j += 2) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}//end of the nested loop
		}//end of for loop
		
		int counter = 0;
		int result = 0;
		while(counter <= 10) {//as long as this condition is true, the loop continues
			//"while the condition continues to be true, keep doing these steps
			result += counter; 
			System.out.println("Our result is: " + result + " and our count is: " + counter);
			counter++;
		}//end of the while loop
		
		result = 0;
		//this loop essentially does the same thing
		for(int i=0; i <= 5; i++) {
			result += i;
			System.out.println("Our result is: " + result + " and our count is: " + i);
		}//end of for loop
		int x,y,z; //can declare the same type on the same line using commas
		x = 100;
		y = 11;
		z = 100;
		//these operators are intuitive
		System.out.println("x + y = " + (x+y));
		System.out.println("x - y = " + (x-y));
		System.out.println("x * y = " + (x*y));
		System.out.println("y / x = " + (y/x));
		//what about remainders
		System.out.println("The remainder of 2/10 = " + (x%y));
		System.out.println("y/x = " + (y/x) + " with a remainder of " + (y%x)); 
		
		//if, else if, else
		/*if(x%2 == 0) {
			System.out.println("x is even!");
		}
		else {
			System.out.println("y is odd!");
		}*/
		String name = "Yuta"; //String name is an object, name is an instance to the String class
		System.out.println(name.toUpperCase()); //non-static method
		System.out.println("x " + evenOrNah(x));
		System.out.println("y " + evenOrNah(y));
		System.out.println("z " + evenOrNah(z));
		System.out.println("100 " + evenOrNah(100));
		
		if(name.equals("Yuta")) {
			System.out.println("same");
		}//end of if
		
		for(int i = 0; i < 10; i++) {
			if(evenOrNah(i).equals("is even!")) {
				System.out.print(i + " ");
			}//end of if
		}//end of for loop
		System.out.println();
		
		if(x == 1) {//checks this first
			System.out.println("x is 1");
		}//end of if
		else if(x == 10) {//ONLY reached if the if statement is false
			System.out.println("x is 10");
		}
		else if(x == 100) {//when you find the "true " one you'll stop
			System.out.println("x is 100");
		}
		else {//if you never find a true statement, default to else
			System.out.println("x is not 1, 10, or 100");
		}//end of if 
		
		//int x = 0;
		String someString = "test";
		boolean myBool;
		boolean myOtherBool;
		myBool = (someString.equals("test"));
		myOtherBool = (x == 0);
		if(myBool && myOtherBool) { //&& means AND
									// || means OR
			System.out.println("At least on of my booleans are true");
		}//end of if
		else {
			System.out.println("Both of my booleans are false");
		}//end of else
		/*
		 * x and y are both booleans
		 *  x  &&  y --> result
		 * true   true   true
		 * true   false  false
		 * false  true   false
		 * false  false  false 
		 * 
		 *  x  ||  y --> result
		 * true   true   true
		 * true   false  true
		 * false  true   true
		 * false  false  false 
		 */
	}//end of the main method
	
	private static String evenOrNah(int number) {
			if(number%2 ==0) 
			return "is even!";
			else return "is odd!";
	}//end of the evenOrNah
}//end of JavaLecture2 class
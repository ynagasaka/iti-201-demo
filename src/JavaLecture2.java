public class JavaLecture2 {
	public static void main(String[] args) {
		int[] myInts = new int [6]; //this array can hold up to 6 integers indexed 0-5
		
		//when you know exactly when you will start and stop
		//the first part tells Java where to start
		//the second part is telling Java where to stop
		//the third part tells Java how to iterate
		//i++ means add 1 to i --> it is the same as saying:
		//i = i + 1 or i += 1
		//
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
	}//end of the main method
}//end of JavaLecture2 class
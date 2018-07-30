public class Assignment2 {
	public static void main(String[] args) {
		int[] myInts = new int [10];
		
		for(int i = myInts.length*2-1; i >= 0; i--) {
			if(i%2 != 0) {
				System.out.print(i + " ");
			}//end of if for odd numbers backwards
		}//end of for for odd numbers backwards
			
		System.out.println("\n");
	
		for(int i = 0; i <= myInts.length*2-1; i++) {
			if(i%3 == 0) {
				if (i%2 != 0) { 
					System.out.print(i + " ");
				}//end of nested if for numbers in the array divisible by 3
			}//end of if for numbers in the array divisible by 3
		}//end of for for numbers in the array divisible by 3
		
		System.out.println("\n");
		
		for(int i = 1; i < myInts.length*5+1; i++) { 
			if(i%5 == 0) {
				System.out.print(i + " ");
			}//end of if for even numbers divisible by 5
		}//end of for for even numbers divisible by 5
		
		System.out.println("\n");
		
		String firstName = "Yuta";
		System.out.println(firstName);
		for(int i = firstName.length()-1; i >= 0; i--) { 
			String rev = ""; 
			rev = rev + firstName.charAt(i); 
			System.out.print(rev);
		}//end of for for firstName string backwards
		
		System.out.println("\n");
	
		int myIntsFlipped[] = new int [myInts.length]; //create a new array same size as the old one
		int odds = 1;
		for(int i = 0; i < myInts.length; i++) {
			myInts[i] = odds;
			odds += 2;	
		}//end of for for myIntsFlipped data

		for(int i = 0; i < myInts.length; i++) {
			myIntsFlipped[i] = myInts[myInts.length-(i+1)];
				System.out.print(myIntsFlipped[i] + " ");
		}//end of for for myIntsFlipped print statement 
		
		
		
		
		
		
		/*System.out.println("\n");
		int[] myIntsFlip = new int [10]; 
		int i = myIntsFlip.length*2+1; 
		if(i%2 != 0) { //
			while(i != 0) {
			i--;
				if(i%2 != 0) {
					System.out.print(i + " ");
				}
			}
		}
		Was looking for an alternative to display the numbers flipped/backwards while looking for 
		an answer for bullet 4. Found that it flips/reverses the first 10 odd numbers in the array,
		but was not sure if this was what I was looking for.
		*/
		
	}//end of main method
}//end of Assignment2 
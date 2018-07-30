import java.util.Scanner; //import things that aren't included by default when needed

public class TestStudent {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //creating a new instance of the Scanner class
		Student myStudent = new Student();
		Student me = new Student("Yuta Nagasaka", "123456789", 2019);
		System.out.println("My student's name is " + myStudent.getName() + ", his RUID is " + myStudent.getRuid() + ", and he will be graduating in "+ myStudent.getGraduationYear() + ".");
		System.out.println("My name is " + me.getName() + ", my RUID is " + me.getRuid() + ", and I will be graduating in "+ me.getGraduationYear() + ".");
		System.out.println("");
		
		Student[] myStudents = new Student[5];
		for(int i = 0; i < myStudents.length; i++) {
			System.out.print("Give me a name: "); 
			String name = scan.nextLine(); 
			System.out.print("Give me a RUID: "); 
			String ruid = scan.nextLine();
			System.out.print("Give me a graduation year: ");
			int graduationYear = scan.nextInt();
			scan.nextLine();
			Student tempStudent = new Student(name, ruid, graduationYear);
			myStudents[i] = tempStudent; 
		}//end of for loop to fill array
		
		for(int i = 0; i < myStudents.length; i++) {
			System.out.println("The student's name is " + myStudents[i].getName() + ", his/her RUID is " + myStudents[i].getRuid() + ", and his/her graduation year is " + myStudents[i].getGraduationYear() + ".");
		}//end of for loop to print information for 5 students.
		
		System.out.println("");
		for(int i = 0; i < myStudents.length; i++) {
			System.out.print("Give me a name: ");
			String name = scan.nextLine();
			System.out.print("Give me an RUID: ");
			String ruid = scan.nextLine();
			System.out.print("Give me a graduation year: ");
			int graduationYear = scan.nextInt();
			scan.nextLine();
			myStudents[i].setName(name);
			myStudents[i].setRuid(ruid);
			myStudents[i].setGraduationYear(graduationYear);
		}//end of for loop
		
		for(int i = 0; i < myStudents.length; i++) {
			System.out.println("The student's name is " + myStudents[i].getName() + ", his/her RUID is " + myStudents[i].getRuid() + ", and his/her graduation year is " + myStudents[i].getGraduationYear() + ".");
		}//end of for loop to print the 5 students prompted by the user.
		
		scan.close();
	}//end of main method
}//end of TestStudent
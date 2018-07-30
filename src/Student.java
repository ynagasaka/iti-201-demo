public class Student {
	//instance variables
	private String name;
	private String ruid;
	private int graduationYear;

	
	// constructors
	public Student(){
		name = "Joe Pringles";
		ruid = "987654321";
		graduationYear = 2020;
	}//end of no argument constructor
	
	//default constructor
	public Student(String newName, String newRuid, int newGraduationYear){
		name = newName;
		ruid = newRuid;
		graduationYear = newGraduationYear;
	}//end of public Student() constructor
	
	// setters and getters
	// getters
	public String getName(){
		return name;
	}//end of getName()
	
	public String getRuid(){
		return ruid;
	}//end of getRuid()
	
	public int getGraduationYear(){
		return graduationYear;
	}//end of getGraduationYear()
	
	// setters 
	public void setName(String name){
		this.name = name; 
	}//end of setName()
	
	public void setRuid(String ruid){
		this.ruid = ruid; 
	}//end of setRuid()
	
	public void setGraduationYear(int graduationYear) {
		this.graduationYear = graduationYear;
	}//end of setGraduationYear()
}//end of Student class
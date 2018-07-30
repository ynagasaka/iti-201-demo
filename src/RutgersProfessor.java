public class RutgersProfessor extends RutgersPerson{
	//instance variables
	private String[] classes;
	
	//constructors
	public RutgersProfessor() {
		super.setName("John Does");
		super.setNetId("jd123");
		this.classes = new String[1];
		classes[0] = "OOP";
	}//end of no argument constructor
	
	public RutgersProfessor(String name, String netId, String[] classes) {
		super.setName(name);
		super.setNetId(netId);
		this.classes = classes;
	}//end of RutgersProfessor() constructor
	
	//setters
	public void setClasses(String[] classes) {
		this.classes = classes;
		
	}//end of setClasses()
	
	//getters
	public String[] getClasses() {
		return this.classes;
	}//end of getClasses()
	
	//override methods!
	public String toString() {
		String result = "";
		for(int i = 0; i < this.classes.length; i++) {
			result = result + classes[i] + " "; //iterate these array of classes and build an array
		}//end of for loop
		return "Professor " + this.getName() + "'s courses taught: " + result;
	}//end of toString()
}//end of RutgersProfessor
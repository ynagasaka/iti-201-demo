public class RutgersPerson {
	//instance variables
	private String name;
	private String netId;
	
	//constructors
	public RutgersPerson() {
		this.name = "John Doe";
		this.netId = "jd123";
	}//end of no argument constructor
	
	public RutgersPerson(String name, String netId) {
		this.name = name;
		this.netId = netId;
	}//end of constructor
	
	//setters
	public void setName(String name) {
		this.name = name;
	}//end of setName(String name)
	
	public void setNetId(String netId) {
		this.netId = netId;
	}//end of setNetId
	
	//getters
	public String getName() {
		return this.name;
	}//end of getName()
	
	public String getNetId() {
		return this.netId;
	}//end of getNetId()
}//end of RutgersPerson
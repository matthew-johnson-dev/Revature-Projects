package fixtures;

public abstract class Fixture {

//PROPERTIES
	String name;
	//set and get: name
	public void setName(String name) {this.name = name;}
	public String getName() {return name;}
	
	String shortDescription;
	//set and get: shortDescription
	public void setShortDescription(String shortDescription) {this.shortDescription = shortDescription;}
	public String getShortDescription() {return shortDescription;}
	
	String longDescription;
	//set and get: longDescription
	public void setLongDescription(String longDescription) {this.longDescription = longDescription;}
	public String getLongDescription() {return longDescription;}

//CONSTRUCTORS
	//Parameterized Constructor
	public Fixture (String name, String shortDescription, String longDescription) {
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
	
//METHODS
	//toString method????
}

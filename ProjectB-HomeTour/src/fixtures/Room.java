package fixtures;

public class Room extends Fixture {
	
//PROPERTIES	
//PORTALS
	//establish array of portals used to travel from room to room
	private Room[] portals;
/*?*/	//Setter for portals -- Still having trouble with how "this" keyword works 
	public void setPortals(Room[] portals) {
		this.portals = portals;}				
	//Getter for Portals
	//non-parameterized method with the return type of [] which retrieves the list of portals for our room(s)
	public Room[] getportals() {	
		return this.portals;}

//CONSTRUCTOR(S)
	//constructor of parameterized room object
	public Room (String name, String shortDescription, String longDescription) {
	super(name, shortDescription, longDescription);
	}	

	
	
	
//METHOD(S)
/*?*/ //method which will get the portal for inside of the current room for the specified direction	
		//in my Room.java....
		//THIS IS THE HANGUP, NEED TO ESTABLISH THIS TO RETURN THE NEW ROOM OF "OPTION"..	
	
/*?*/   public Room getPortal(String option) {
			return null;		
		}





/*?*/		// Overloaded setter method. Allows us to set single exit based on index...
/*		public void setPortals(Room portal, int index) {
			this.portals[index] = portal;}
*/
}

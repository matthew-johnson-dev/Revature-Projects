package game;

import fixtures.Room;

public class Player {

	Room currentRoom;
	//set and get: currentRoom
	public void setCurrentRoom (Room currentRoom) {this.currentRoom = currentRoom;}
	public Room getCurrentRoom () {return currentRoom;}
}

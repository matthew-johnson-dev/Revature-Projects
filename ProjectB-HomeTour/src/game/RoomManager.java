package game;

import fixtures.Room;

public class RoomManager {

	Room startingRoom;
	//set and get: startingRoom
	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;}
	public Room getStartingRoom() {
		return startingRoom;}

	//establish array for all rooms
	static Room[] rooms = new Room[5];
	
	public void initialize() {
	
//ROOM(S) CREATION
		Room room0 = new Room(
				"Garage \n",
/*shortdes*/	"A small garage with a few boxes stacked in a corner. \n",
/*longdes*/		"The garage is a tiny space when occupied by a vehicle.\n"
				+ "There are 3 boxes stacked on top of each other in the northwest corner as \n"
				+ "you exit your vehicle. You see an oil stain peeking out from under your \n"
				+ "vehicle as you step out. You see a door across from you in the northeast \n"
				+ "corner of the garage. Peering through the doorway into the next room, \n"
				+ "you can see that it is the kitchen.");
		this.rooms[0] = room0; 		//establishing room location based on index
		startingRoom = room0;		//establishing the Garage as the startingRoom
	
		Room room1 = new Room(
				"Kitchen \n",
/*shortdes*/	"A small open-concept kitchen. \n",
/*longdes*/		"Your'host is hunched over the a pot on the stove-top in the northern section,\n"
				+ "of the room muttering to himself about spices.\n"
				+ "As you look to your right and south, past a small island with an untouched \n"
				+ "fruitbowl and a halfeaten cake on a glass dessert tray, you see the lounge. \n"
				+ "Directly across from you, to the east, is another open doorway with an unkempt \n"
				+ "bed inside. That must be the bedroom.");
		this.rooms[1] = room1;
	
		Room room2 = new Room(
				"Lounge \n",
/*shortdes*/	"A small lounge with little decoration. \n",
/*longdes*/		"The lounge is farily tiny, much like the rest of the home you have seen so far."
				+ "It has a small futon in the northern section between the kitchen island and a \n"
				+ "tv on the south wall. On top of the futon is a dishevled blanket and pillow \n"
				+ "piled in the corner against the western wall. The TV is unplugged and the outlet \n"
				+ "nearby has two pieces of blue tape in the shape of an 'X' covering it. There seems \n"
				+ "to be black scorch marks sporadically petruding from the outlet. There is very \n"
				+ "little decoration to be seen and fewer activites. It's obvious your host is not used \n"
				+ "to being a host. On the south wall, east of the TV you see the main entrance door. \n"
				+ "It has a variety of locks keeping it shut. Adjacent to the front door onthe east \n"
				+ "wall is an open door through which you can see a toilet. Must be the bathroom.");	
		this.rooms[2] = room2;
		
		Room room3 = new Room(
				"Bathroom \n",
/*shortdes*/	"A simple small bathroom. \n",
/*longdes*/		"The bathroom is small. It has a standalone sink with no storage located in the \n"
				+ "northeast corner. Across from the sink on the western wall, is a towel holder. \n"
				+ "South of the towel is a doorway to the lounge. Directly adjacent to the sink, on \n"
				+ "the northern wall, is an open door, through which you can see the same bed that \n "
				+ "you saw from the kitchen. Immediately to the right of the sink, located centrally \n"
				+ "on the eastern wall is a toilet with a stand-alone toiletpaper holder between it \n"
				+ "and the sink. To the south of the toiet is a standard bathtub and shower tray \n"
				+ "combo taking up the length of the southern wall.");
		this.rooms[3] = room3;
		
		Room room4 = new Room( 
				"Bedroom \n",
/*shortdes*/	"A small bedroom. \n",
/*longdes*/		"The bedroom is cramped. The single, twin-sized bed on the eastern wall takes up a \n"
				+ "majority of the space in the room. A clothes basket in the northwestern corner, \n"
				+ "overflowing with clothes, blocks much of the floor space of the rest of the room. \n"
				+ "As you look more closely at the clothes basket you see that half of the clothes \n"
				+ "are folded, with other clothing seemingly thrown on top and about the basket. \n"
				+ "Like the rest of the house, there is no decoration to be seen anywhere. You see \n"
				+ "the door to the kitchen on the western wall and as you look towards the southwest \n"
				+ "portion of the south wall, you see the door to bathroom.");
		this.rooms[4] = room4;
		
//ROOM(S) PORTALS		
/*		Room[] room0Portals = {room1};
		room0.setPortals(room0Portals);
		
		Room[] room1Portals = {room0, room2, room4};
		room1.setPortals(room1Portals);
		
		Room[] room2Portals = {room1, room3};
		room2.setPortals(room2Portals);
		
		Room[] room3Portals = {room2, room4};
		room3.setPortals(room3Portals);
		
		Room[] room4Portals = {room1, room3};
		room4.setPortals(room4Portals);
*/
	}
	
}

package game;

import java.util.Scanner;
import fixtures.Room;
import game.RoomManager;

public class Main {

	//Game-On Switch
	private static boolean gameOn = true;
		
	
	//BUILD ROOMS WITH RoomManager CONSTRUCTOR
	private static RoomManager houseBuild = new RoomManager();
	

//BEGIN MAIN METHOD
	public static void main (String[] args) {
	
	//initialize creation of house
	houseBuild.initialize();
	
	//instantiate Player
	Player player = new Player();
	
	//Establish player location in the startingRoom
	player.setCurrentRoom(houseBuild.getStartingRoom());
	
	//Greet Player
	System.out.println(
			"Welcome to my home. You're fine parked here in the Garage,"
			+ " just try not to leave.\nThe inner door switch is broken."
			+ " I need to open it from the outside manually."
			+ " Its a real pain.\nI'll be in the kitchen cooking,"
			+ " feel free to wander around the house and 'ENTER' any room you like.\n"
			+ "If you get tired of waiting, just say you want to 'LEAVE'.\n"
			+ "No hard feelings, I lose track of time sometimes.\n");

	while (gameOn) {	
	//display player location to console
		System.out.println("Current Location: " + player.getCurrentRoom().getName());
		System.out.println("Short Description: " + player.getCurrentRoom().getShortDescription());
		System.out.println("Long Description: " + player.getCurrentRoom().getLongDescription());		
	
	//utilize scanner object to collect input commands
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
			String[] command = input.split(" ");		
			String action = command[0].toUpperCase().intern();
			String option = null;

			//to resolve command from above input line
			//if 'String[] command' is more than two strings
			//then the 'option' variable is assigned to the second String value at index [1]
			if (command.length > 1) {
				option = command[1].intern();}
			//in regard to action variable established, 'command[0]
			if (action == "ENTER") {
				System.out.println("You try to enter into the " + option + ".");

// To test .equalsIgnoreCase() in if-conditional	***WORKS- WILL REFACTOR IF TIME ALLOWS****			
//				if ( player.currentRoom == RoomManager.rooms[0] & option.equalsIgnoreCase("LOUNGE")) {
//					System.out.println("You're not a genie.");
					
//Long method of Room-Access-Denial when '-- option.toUpperCase() == "ROOM" --' was unaccepted by if-conditional	
				//ROOM-0 - Garage
					if ( player.currentRoom == RoomManager.rooms[0] ) {			
						
						switch (option.toUpperCase()){					
						case "GARAGE":
//							System.out.println("You are already in that room.");
							player.setCurrentRoom(RoomManager.rooms[0]);
							break;
							
						case "KITCHEN":
							System.out.println("Welcome to the kitchen!");
							player.setCurrentRoom(RoomManager.rooms[1]);
							break;
							
						case "LOUNGE":
							System.out.println("Sorry, the lounge isn't connected to this room.");
							player.setCurrentRoom(RoomManager.rooms[0]);
							break;
						
						case "BATHROOM":
							System.out.println("Sorry, the bathroom isn't connected to this room.");								
							player.setCurrentRoom(RoomManager.rooms[0]);		
							break;
							
						case "BEDROOM":
							System.out.println("Sorry, the bedroom isn't connected to this room.");	
							player.setCurrentRoom(RoomManager.rooms[0]);		
							break;				
						}//End Switch
					}//End If -Room -0
					
				//ROOM-1 - Kitchen
					if ( player.currentRoom == RoomManager.rooms[1] ) {			
						
						switch (option.toUpperCase()){					
						case "GARAGE":
							System.out.println("Welcome to the garage!");	
							player.setCurrentRoom(RoomManager.rooms[0]);	
							break;
							
						case "KITCHEN":
//							System.out.println("You are already in that room.");
							player.setCurrentRoom(RoomManager.rooms[1]);
							break;
							
						case "LOUNGE":
							System.out.println("Welcome to the lounge!");
							player.setCurrentRoom(RoomManager.rooms[2]);
							break;
						
						case "BATHROOM":
							System.out.println("Sorry, the bathroom isn't connected to this room.");
							player.setCurrentRoom(RoomManager.rooms[1]);
							break;
							
						case "BEDROOM":
							System.out.println("Welcome to the bedroom!");	
							player.setCurrentRoom(RoomManager.rooms[4]);		
							break;	
						}//End Switch
					}//End If -Room -1
					
				//ROOM-2 - Lounge
					if ( player.currentRoom == RoomManager.rooms[2] ) {			
						
						switch (option.toUpperCase()){					
						case "GARAGE":
							System.out.println("Sorry, the garage isn't connected to this room.");	
							player.setCurrentRoom(RoomManager.rooms[2]);		
							break;
							
						case "KITCHEN":
							System.out.println("Welcome to the kitchen!");
							player.setCurrentRoom(RoomManager.rooms[1]);
							break;
							
						case "LOUNGE":
//							System.out.println("You are already in that room.");
							player.setCurrentRoom(RoomManager.rooms[2]);
							break;
						
						case "BATHROOM":
							System.out.println("Welcome to the bathroom!");		
							player.setCurrentRoom(RoomManager.rooms[3]);	
							break;
							
						case "BEDROOM":
							System.out.println("Sorry, the bedroom isn't connected to this room.");	
							player.setCurrentRoom(RoomManager.rooms[2]);	
							break;	
						}//End Switch
					}//End If -Room -2
					
				//ROOM-3 - Bathroom
					if ( player.currentRoom == RoomManager.rooms[3] ) {			
						
						switch (option.toUpperCase()){					
						case "GARAGE":
							System.out.println("Sorry, the garage isn't connected to this room.");
							player.setCurrentRoom(RoomManager.rooms[3]);			
							break;
							
						case "KITCHEN":
							System.out.println("Sorry, the kitchen isn't connected to this room.");
							player.setCurrentRoom(RoomManager.rooms[3]);
							break;
							
						case "LOUNGE":
							System.out.println("Welcome to the lounge!");
							player.setCurrentRoom(RoomManager.rooms[2]);
							break;
						
						case "BATHROOM":
//							System.out.println("You are already in that room.");
							player.setCurrentRoom(RoomManager.rooms[3]);			
							break;
							
						case "BEDROOM":
							System.out.println("Welcome to the bedroom!");	
							player.setCurrentRoom(RoomManager.rooms[4]);	
							break;	
						}//End Switch
					}//End If -Room -3
					
				//ROOM-4 - Bedroom
					if ( player.currentRoom == RoomManager.rooms[4] ) {			
						
						switch (option.toUpperCase()){					
						case "GARAGE":
							System.out.println("Sorry, the garage isn't connected to this room.");		
							player.setCurrentRoom(RoomManager.rooms[4]);	
							break;
							
						case "KITCHEN":
							System.out.println("Welcome to the kitchen!");
							player.setCurrentRoom(RoomManager.rooms[1]);
							break;
							
						case "LOUNGE":
							System.out.println("Sorry, the lounge isn't connected to this room.");
							player.setCurrentRoom(RoomManager.rooms[4]);
							break;
						
						case "BATHROOM":
							System.out.println("Welcome to the bathroom!");	
							player.setCurrentRoom(RoomManager.rooms[3]);	
							break;
							
						case "BEDROOM":
//							System.out.println("You are already in that room.");
							player.setCurrentRoom(RoomManager.rooms[4]);		
							break;	
						}//End Switch
					}//End If -Room -4
					

			} else if (action == "LEAVE") {
				System.out.println("I'll get the garage door for you. Thanks for stopping by!");
				gameOn = false;
				}//End Else-if	
	}// END WHILE-LOOP	
	}//END MAIN METHOD
}

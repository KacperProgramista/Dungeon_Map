import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Place[] map = new Place[7];
		
		map[0] = new Place("Save Zone");
		map[1] = new Place("South Corridor");
		map[2] = new Place("Middle Corridor");
		map[3] = new Place("North Corridor");
		map[4] = new Place("South Room");
		map[5] = new Place("North Room");
		map[6] = new Place("Entrance");
		
		map[0].addTransition(null, null, map[1], null);
		map[1].addTransition(map[0], map[2], map[4], null);
		map[2].addTransition(null, map[3], null, map[1]);
		map[3].addTransition(null, map[5], map[6], map[2]);
		map[4].addTransition(map[1], null, null, null);
		map[5].addTransition(null, null, null, map[3]);
		map[6].addTransition(map[3], null, null, null);
		
		Place currentPlace = map[0];
		Scanner scam = new Scanner(System.in);
		char choice;
		
		while(!currentPlace.equals(map[6])) {
			System.out.println("You are in " + currentPlace.getName());
			System.out.println("You can go " + currentPlace.getTransitions());
			choice = scam.nextLine().charAt(0);
			Place newPlace = null;
			if (choice == 'L') {
				newPlace = currentPlace.transitions[0];
			}
			else if (choice == 'U') {
				newPlace = currentPlace.transitions[1];	
			}
			else if (choice == 'R') {
				newPlace = currentPlace.transitions[2];	
			}
			else if (choice == 'D') {
				newPlace = currentPlace.transitions[3];	
			}
			if (newPlace != null) currentPlace = newPlace;
		}
		
	}

}

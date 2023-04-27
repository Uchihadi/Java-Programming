package statics;

public class Building { 
	public Room room;
	
	// Object of class Building is created in the main method
	public Building() { // 1. Parameterless Building Constructor invoked
		//2. Hence it will then invoke Room constructor
		this.room = new Room(20); // Room statement printed
	}

	public Building(Room room) {
		System.out.println("Building created");
		this.room = room;
	}

	public static void main(String args[]) {
		Building b = new Building();
	}
}

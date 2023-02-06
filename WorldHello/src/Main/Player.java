package Main;
//package WorldHello;
public class Player {
	String Name;
	int Level;
	
	public Player(String name, int level) {
		Name = name;
		System.out.println("Player name is "+name);
		Level = level;
		System.out.println("Player level is "+level);
	}
}

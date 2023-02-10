package Main;
//package WorldHello;
public class Player {
	String Name;
	String Class;
	int Level;
	int str;
	int dex;
	int con;
	int wpr;
	int imt;
	int hp;
	int mp;
	
	public Player(String name, int level) {
		Name = name;
		System.out.println("Player name is "+name);
		Level = level;
		System.out.println("Player level is "+level);
	}
}

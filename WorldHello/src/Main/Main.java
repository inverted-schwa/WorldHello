package Main;
import java.util.*;

public class Main {
	private static Scanner sc;
	public static int dungeonLevel=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = sc.next();
		System.out.println("Please enter the player level");
		int level = sc.nextInt();
		Player p = new Player(name, level);
		menu(p);
	}
	public static void menu(Player p) {
		sc=new Scanner(System.in);
		System.out.println("1. Go to the village");
		System.out.println("2. Go to the forest");
		System.out.println("3. Go to the castle");
		System.out.println("4. Go to the dungeon");
		System.out.println("5. Quit the game");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			village(p);
			break;
		case 2:
			forest(p);
			break;
		case 3:
			castle(p);
			break;
		case 4:
			dungeon(p);
			break;
		case 5:
			quit(p);
			break;
		}
	}
		public static void village(Player p) {
			sc=new Scanner(System.in);
			System.out.println("-=Welcome to the Village=-");
			System.out.println("1. Go to the tavern");
			System.out.println("2. Go to the blacksmith");
			System.out.println("3. Go to the magic shop");
			System.out.println("4. Go to the town square");
			
		}
		public static void forest(Player p) {
			sc=new Scanner(System.in);
			System.out.println("-=Welcome to the Forest=-");
			System.out.println("1. Go to the magic meadow");
			System.out.println("2. Go to the haunted willow");
			System.out.println("3. Go to the witch's hut");
			System.out.println("4. Go to the elven lands");
		}
		public static void castle(Player p) {
			sc=new Scanner(System.in);
			System.out.println("-=Welcome to the Castle=-");
			System.out.println("1. Go to the king's chamber");
			System.out.println("2. Go to the royal wizard's chamber");
			System.out.println("3. Go to the castle courtyard");
			System.out.println("4. Go to the castle dungeon");
		}
		public static void dungeon(Player p) {
			sc=new Scanner(System.in);
			Dungeon d = new Dungeon(p.Level);
			System.out.println("-=Welcome to the Dungeon Level"+ d.level+"=-");
			System.out.println("1. Fight a "+d.getMonster());
			System.out.println("2. Go to the royal wizard's chamber");
			System.out.println("3. Go to the castle courtyard");
			System.out.println("4. Go to the castle dungeon");
		}
		public static void quit(Player p) {
			System.out.println("Thanks for playing,"+p.Name+"!");
		}
}

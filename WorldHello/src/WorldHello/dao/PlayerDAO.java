package WorldHello.dao;
import WorldHello.pojo.*;
import java.util.*;
public class PlayerDAO {
	public Set<Player> playerList = new HashSet<Player>();
	Player p1 = new Player("Jim","pass123","Cleric","Elf",1,10,12,10,14,14,100,100);
	Player p2 = new Player("Joe","pass123","Warrior","Dwarf",1,16,10,16,10,14,160,60);
	Player p3 = new Player("Jane","pass123","Rogue","Halfling",1,10,16,12,12,12,120,80);

}

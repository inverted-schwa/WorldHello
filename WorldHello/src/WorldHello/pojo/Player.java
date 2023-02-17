package WorldHello.pojo;

public class Player {
	String Name;
	String charClass;
	String charRace;
	String password;
	int Level;
	int str;
	int dex;
	int con;
	int wpr;
	int intel;
	int hp;
	int mp;
	

	public Player(String name, String password, String class1, String race, int level, int str, int dex, int con, int wpr, int intel, int hp, int mp) {
		super();
		this.Name = name;
		this.password = password;
		this.charClass = class1;
		this.charRace = race;
		this.Level = level;
		this.str = str;
		this.dex = dex;
		this.con = con;
		this.wpr = wpr;
		this.intel = intel;
		this.hp = hp;
		this.mp = mp;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public String getCharClass() {
		return charClass;
	}
	public void setCharClass(String class1) {
		charClass = class1;
	}
	public int getLevel() {
		return Level;
	}
	public void setLevel(int level) {
		Level = level;
	}
	public int getStr() {
		return str;
	}
	public void setStr(int str) {
		this.str = str;
	}
	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	public int getCon() {
		return con;
	}
	public void setCon(int con) {
		this.con = con;
	}
	public int getWpr() {
		return wpr;
	}
	public void setWpr(int wpr) {
		this.wpr = wpr;
	}
	public int getintel() {
		return intel;
	}
	public void setintel(int intel) {
		this.intel = intel;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCharRace() {
		return charRace;
	}
	public void setCharRace(String charRace) {
		this.charRace = charRace;
	}	
}

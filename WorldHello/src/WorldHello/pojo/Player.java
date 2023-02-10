package WorldHello.pojo;

public class Player {
	public Player(String name, String class1, int level, int str, int dex, int con, int wpr, int imt, int hp, int mp) {
		super();
		Name = name;
		charClass = class1;
		Level = level;
		this.str = str;
		this.dex = dex;
		this.con = con;
		this.wpr = wpr;
		this.imt = imt;
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
	public int getImt() {
		return imt;
	}
	public void setImt(int imt) {
		this.imt = imt;
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
	String Name;
	String charClass;
	int Level;
	int str;
	int dex;
	int con;
	int wpr;
	int imt;
	int hp;
	int mp;
	
}

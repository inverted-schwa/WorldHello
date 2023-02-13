package WorldHello.pojo;

public class Monster {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBaseHp() {
		return basehp;
	}
	public void setBaseHp(int basehp) {
		this.basehp = basehp;
	}
	public int getBaseMp() {
		return basemp;
	}
	public void setBaseMp(int mp) {
		this.basemp = basemp;
	}
	public double getHpGrowth() {
		return hpgrowth;
	}
	public void setHpGrowth(double hpGrowth) {
		this.hpgrowth = hpGrowth;
	}
	public double getMpGrowth() {
		return mpgrowth;
	}
	public void setMpGrowth(double mpGrowth) {
		this.mpgrowth = mpGrowth;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getMlvl() {
		return mlvl;
	}
	public void setMlvl(int mlvl) {
		this.mlvl = mlvl;
	}
	public Loot[] getLoot() {
		return loot;
	}
	public void setLoot(Loot[] loot) {
		this.loot = loot;
	}
	public String name;
	public int basehp;
	public double hpgrowth;
	public int basemp;
	public double mpgrowth;
	public int atk;
	public int def;
	public int mlvl;
	public Loot[] loot;
	public Monster(String name, int basehp, double hpGrowth, int basemp, double mpGrowth, int atk, int def, int mlvl, Loot[] loot) {
		super();
		this.name = name;
		this.basehp = basehp;
		this.hpgrowth = hpGrowth;
		this.basemp = basemp;
		this.mpgrowth = mpGrowth;
		this.atk = atk;
		this.def = def;
		this.mlvl = mlvl;
		this.loot = loot;
	}
}

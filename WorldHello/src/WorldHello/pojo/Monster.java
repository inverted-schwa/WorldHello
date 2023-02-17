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
	public int getBaseAtk() {
		return baseatk;
	}
	public void setBaseAtk(int baseAtk) {
		this.baseatk = baseAtk;
	}
	public int getBaseDef() {
		return basedef;
	}
	public void setBaseDef(int baseDef) {
		this.basedef = baseDef;
	}
	public double getAtkGrowth() {
		return atkgrowth;
	}
	public void setAtkGrowth(double atkGrowth) {
		this.atkgrowth = atkGrowth;
	}
	public double getDefGrowth() {
		return defgrowth;
	}
	public void setDefGrowth(double defGrowth) {
		this.defgrowth = defGrowth;
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
	public int baseatk;
	public int basedef;
	public double atkgrowth;
	public double defgrowth;
	public int mlvl;
	public Loot[] loot;
	public Monster(String name, int basehp, double hpGrowth, int basemp, double mpGrowth, int baseatk, double atkGrowth, int basedef, double defGrowth, int mlvl, Loot[] loot) {
		super();
		this.name = name;
		this.basehp = basehp;
		this.hpgrowth = hpGrowth;
		this.basemp = basemp;
		this.mpgrowth = mpGrowth;
		this.baseatk = baseatk;
		this.basedef = basedef;
		this.atkgrowth = atkGrowth;
		this.defgrowth = defGrowth;
		this.mlvl = mlvl;
		this.loot = loot;
	}
}

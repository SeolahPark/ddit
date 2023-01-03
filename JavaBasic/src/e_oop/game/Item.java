package e_oop.game;

public class Item {
	String name;
	int maxHp, maxMp, att, def;

	public Item(String name, int maxHp, int maxMp, int att, int def) {
		this.name = name;
		this.maxHp = maxHp;
		this.maxMp = maxMp;
		this.att = att;
		this.def = def;
	}

	public String toString() {
		String info = this.name + " : ";
		if (this.maxHp > 0)
			info += "체력+" + this.maxHp;
		if (this.maxMp > 0)
			info += "마나+" + this.maxMp;
		if (this.att > 0)
			info += "공격력+" + this.att;
		if (this.def > 0)
			info += "방어력" + +this.def;
		return info;
	}

}

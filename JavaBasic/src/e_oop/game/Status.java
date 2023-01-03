package e_oop.game;

public class Status {
	String name; // 이름
	int maxHp, maxMp, hp, mp, att, def, lv, exp, nextExp; // 스탯
	Item[] items;
	
	public void attack(Status m) {
		int damage = this.att - m.def;
		damage = damage <= 0 ? 1 : damage;
		m.hp -= damage;
		m.hp = m.hp < 0 ? 0 : m.hp;
		System.out.printf("%s(이)가 공격으로 %s에게 %s만큼 데미지를 주었습니다.\n", this.name, m.name, damage);
		System.out.printf("%s의 남은 체력은 HP : %d\n", m.name, m.hp);
		System.out.println();
	}
	
}

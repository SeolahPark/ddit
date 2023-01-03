package e_oop.game;

public class Charactor extends Status {


	// 생성자를 만들어 기본생성자가 자동 추가되는걸 막음. 이름은 필수입력을 조건으로 함!
	public Charactor(String name) {
		this.name = name;
		this.maxHp = 100;
		this.hp = this.maxHp;
		this.maxMp = 50;
		this.mp = this.maxMp;
		this.att = 20;
		this.def = 10;
		this.lv = 1;
		this.exp = 0;
		this.nextExp = (this.lv * 100);
		this.items = new Item[0];
	}

	public void showInfo() {
		System.out.println("------ 상태 ------");
		System.out.printf("이  름 : %s\n", this.name);
		System.out.printf("레  벨 : %d\n", this.lv);
		System.out.printf("체  력 : %d / %d\n", this.hp, this.maxHp);
		System.out.printf("마  나 : %d / %d\n", this.mp, this.maxMp);
		System.out.printf("공  격 : %d\n", this.att);
		System.out.printf("방  어 : %d\n", this.def);
		System.out.printf("경험치 : %d / %d\n", this.exp, nextExp);
		System.out.println("------------------");
		System.out.println("------아이템------");
		for (int i = 0; i < this.items.length; i++) {
			System.out.println(this.items[i]);
		}
		System.out.println("------------------");
	}

//	public void attack(Monster m) {
//		int damage = this.att - m.def;
//		damage = damage <= 0 ? 1 : damage;
//		m.hp -= damage;
//		m.hp = m.hp < 0 ? 0 : m.hp;
//		System.out.printf("%s(이)가 공격으로 %s에게 %s만큼 데미지를 주었습니다.\n", this.name, m.name, damage);
//		System.out.printf("%s의 남은 체력은 HP : %d\n", m.name, m.hp);
//		System.out.println();
//	}

	public void getExp(int exp) {
		System.out.println(exp + "의 경험치를 획득하였습니다.\n");
		this.exp += exp;
		while (this.exp >= this.nextExp) {
			this.exp -= this.nextExp;
			levelUP();
		}
	}

	private void levelUP() {
		this.lv++;
		this.maxHp += 10;
		this.hp = this.maxHp;
		this.maxMp += 5;
		this.mp = this.maxMp;
		this.att += 5;
		this.def += 5;
		this.nextExp = (this.lv * 100);
		System.out.println("LEVEL UP !!");
	}

	public void getItem(Item i) {
		System.out.println(i.name + "을(를) 획득하였습니다.\n");
		Item[] tmp = new Item[this.items.length + 1];
		for (int z = 0; z < this.items.length; z++) {
			tmp[z] = this.items[z];
		}
		tmp[tmp.length - 1] = i;
		this.items = tmp;

		this.maxHp += i.maxHp;
		this.maxMp += i.maxMp;
		this.att += i.att;
		this.def += i.def;
	}
}

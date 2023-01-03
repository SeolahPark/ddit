package e_oop;

public class Static {
	//
	// Static이 붙지 않으면 코드로만 존재함.
	// 따라서 사용하려면 변수로 선언하고 객체로 생성해줘야함.
	//
	// Static
	// - static을 붙이면 프로그램 실행시 메모리에 올라가고, 객체를 생성하지 않아도 사용할 수 있다.
	// - static을 붙인 변수는 객체간의 변수 값을 공유한다.
	// - static으로 선언된 변수는 프로그램에서 단 하나다!
	// - static이 붙은 멤버의 명칭 : 클래스 변수, 클래스 메서드
	// - static이 !붙은 멤버의 명칭 : 인스턴스 변수, 인스턴스 메서드
	//

	// 값을 공유하기 위해 static을 붙인다.
	static int var;

	public static void main(String[] args) {
		// 메인메서드만 시작되는 이유 : static -> 메모리에 올라감

		Human cheol = new Human();
		Human young = new Human();

		cheol.saveMoney(50000);
		young.saveMoney(100000);

		Human couple = new Human();
		couple.saveMoney(200000);

		cheol.saveGroupMoney(200000);
		System.out.println("모임통장 : " + young.groupAccount); // 영희나 철수의 것이 아니다. Human.groupAccount
		System.out.println("영희통장 : " + young.account);
		System.out.println("철수통장 : " + cheol.account);

		young.saveGroupMoney(200000);
		System.out.println("모임통장 : " + cheol.groupAccount); // 영희나 철수의 것이 아니다. Human.groupAccount

		System.out.println(Human.groupAccount);
	}

}

class Human {
	int account; // 잔고

	public void saveMoney(int money) {
		this.account += money;
		System.out.println("통장 잔고 : " + this.account);
	}

	static int groupAccount;

	public void saveGroupMoney(int money) {
		groupAccount += money;
//		System.out.println("모임통장 잔고 : " + groupAccount);
	}
}

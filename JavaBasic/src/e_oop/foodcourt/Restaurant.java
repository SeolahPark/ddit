package e_oop.foodcourt;

import java.util.concurrent.TimeUnit;

public class Restaurant {
	// 식당마다 특징이 있을테니 따로 객체로 빼냈다.
	// 메뉴도 메뉴마다 특징(ex.조리시간, 가격, 판매위치 등) 이 있으니 따로 객체로 만들예정.
	String name, type;
	Menu[] menuList = new Menu[0];

	public Restaurant(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String toString() {
//		return new String().format("[%s] %s", this.type, this.name);
//		String 클래스의 format메서드는 static 메서드라 String 객체를 만들지 않아도 된다. 
//		ㄴ == new연산자 & ()를 쓰지 않아도 된다.
		return String.format("[%s] %s", this.type, this.name);
	}

	public void order(Menu m, int orderNumber) {
		System.out.println(m.name + "을(를) 요리합니다...");
		for (int i = 0; i < m.cookingtime; i++) {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + 1);
		}
		System.out.printf("[%3d]번 고객님, 주문하신 %s이(가) 완성되었습니다.\n", orderNumber, m.name);
		System.out.printf("%s에서 받아가세요.", this.name);
		System.out.println();
	}

}

package e_oop.foodcourt;

import e_oop.ScanUtil;

public class Main {
	Kiosk k = new Kiosk();
	int input;
	int orderNumber;

	Main() {
		Restaurant[] restList = new Restaurant[1];
		restList[0] = new Restaurant("버거킹", "햄버거");
		Menu[] menuList = new Menu[1];
		menuList[0] = new Menu("와퍼", 10000);

		restList[0].menuList = menuList;
		k.resList = restList;

	}

	public static void main(String[] args) {
		new Main().start();
		// 메인메서드에서 실행을 안하는 이유는 다른 메서드들도 static이 붙어야해서

	}

	private void start() {
		clearConsole();
		System.out.println("==============FOOD COURT==============");
		main: while (true) {
			System.out.println("-------- 사용자 목록 --------");
			System.out.println("1.일반사용자 2.관리자 0.종료");
			System.out.println("-----------------------------");
			System.out.print("선택 >> ");
			input = ScanUtil.nextInt();
			clearConsole();
			switch (input) {
			case 1:
				userInterface();
				break;

			case 2:
				adminInterface();
				break;

			case 0:
				System.out.println("프로그램을 종료합니다.");
				break main;

			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}

		}
	}

	private void userInterface() {
		System.out.println("======= 식사 주문하기 =======");
		user: while (true) {
			Restaurant r = k.showRestaurantList();
			if (r == null) {
				break user;
			}
			System.out.println("메뉴 선택으로 이동합니다.");
			Menu m = k.showMenuList(r);
			if (m == null) {
				break user;
			}
			orderNumber++; // 주문번호, 메서드가 시작될때마다 초기화되면 안되기때문에 필드로 선언
			r.order(m, orderNumber);
			System.out.println("\n\n");
		}

	}

	private void adminInterface() {
		System.out.println("======== 키오스크 관리 ========");
		admin: while (true) {
			System.out.println("-------- 관리자 메뉴 ---------");
			System.out.println("1.식당관리  2.메뉴추가  0.종료");
			System.out.println("------------------------------");
			System.out.print("선택 >> ");
			input = ScanUtil.nextInt();
			clearConsole();
			switch (input) {
			case 1:
				restaurantManage();
				break;

			case 2:
				k.insertMenu();
				break;

			case 0:
				System.out.println("프로그램을 종료합니다.");
				break admin;

			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}

	private void restaurantManage() {
		manage: while (true) {
			System.out.println("--------- 식당 관리 ----------");
			System.out.println("1.추가  2.삭제  3.변경  0.종료");
			System.out.println("------------------------------");
			System.out.print("선택 >> ");
			input = ScanUtil.nextInt();
			clearConsole();
			switch (input) {
			case 1:
				k.insertRestaurant();
				break;

			case 2:
				k.deleteRestaurant();
				break;

			case 3:

				break;

			case 0:
				System.out.println("프로그램을 종료합니다.");
				break manage;

			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}

	public void clearConsole() {
		for (int i = 0; i < 100; i++)
			System.out.println();

	}

}

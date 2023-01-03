package e_oop.foodcourt;

import e_oop.ScanUtil;
// 이거로 작물심기, 수확하기 

public class Kiosk {
	// 키오스크(기계자체) - 주문의 모든 행위가 일어난다.
	Restaurant[] resList = new Restaurant[0]; // 식당 목록 -> 최초 0길이의 배열
	int input; // 각 메서드에서 선언하기 번거로워 전역변수(필드)로 선언.

	public void insertRestaurant() {
		System.out.println("----- 식당 추가 -----");
		System.out.print("\n식당 종류 >> ");
		String type = ScanUtil.nextLine();
		System.out.print("식당 이름 >> ");
		String name = ScanUtil.nextLine();

		Restaurant[] tmpList = new Restaurant[resList.length + 1];
		for (int i = 0; i < resList.length; i++) {
			tmpList[i] = resList[i];
		}
		tmpList[tmpList.length - 1] = new Restaurant(name, type);
		resList = tmpList;

		System.out.printf("[%s] %s식당이 추가되었습니다.\n", type, name);
		System.out.println();
	}

	public void deleteRestaurant() {
		Restaurant r = showRestaurantList();
		if (r == null) {
			return;
			// 식당이 없다는 문구는 show에서 뿌려졌으니까 메소드만 바로 종료
		}
//		기존 배열이 가지고 있던 길이보다 하나 작은 배열 선언
		Restaurant[] temp = new Restaurant[resList.length - 1];
		int tune = 0;
		for (int i = 0; i < temp.length; i++) {
//			if (this.resList[i] == r) {
//			객체간 비교는 equals로 내용을 비교해야하는데, 여기서는 주소값을 비교해서 같은 배열인지 판단
			if (this.resList[i].equals(r)) {
				tune++;
			}
			temp[i] = this.resList[i + tune];
		}

//		int idx=0;
//		for (int i = 0; i < temp.length; i++) {
//			if (this.resList[i].equals(r)) {
//				i++;
//			}
//			temp[idx] = this.resList[i];
//			idx++;
//		}

		this.resList = temp;
		System.out.println(r.name + "이(가) 삭제되었습니다.");
		// 메서드가 종료되기 전 까지 아직 주소값이 남아있기때문에 메서드가 끝나기 전에는 r.name을 사용할 수 있다
	}

	public Restaurant showRestaurantList() {
		System.out.println("----- 식당 목록 -----");
		if (this.resList == null || this.resList.length == 0) {
			// 레거시 코드 -> 순서를 바꾸면 오류난다. 앞에서 true면 or절은 뒤를 실행하지 않는다.
			System.out.println("등록된 식당이 없습니다.");
			return null; // 리턴을 만나면 메서드가 끝남. while-break관계
		}
		list: while (true) {
			System.out.println("------ 식당 목록 ------");
			for (int i = 0; i < this.resList.length; i++) {
				System.out.printf("%2d. %s", i + 1, this.resList[i]);
				System.out.println();
			}
			System.out.println("-----------------------");
			System.out.print("선택>> ");
			input = ScanUtil.nextInt();
			if (input > this.resList.length || input < 1) {
				System.out.println("잘못 입력하셨습니다.");
			} else {
				System.out.println(this.resList[input - 1] + "을 선택하였습니다.");
				break list;
			}
		}
		return this.resList[input - 1];
		// 메뉴를 추가할 때 해당 메소드를 보여줄건데, 그때 구현 쉽게 하려고
	}

	public void insertMenu() {
		Restaurant r = showRestaurantList();
		if (r == null) {
			return;
			// 식당이 없다는 문구는 show에서 뿌려졌으니까 메소드만 바로 종료
		}
		System.out.println("----- 메뉴 추가 -----");
		System.out.println("메뉴 이름 >> ");
		String name = ScanUtil.nextLine();
		System.out.println("메뉴 가격 >> ");
		int price = ScanUtil.nextInt();

		Menu[] temp = new Menu[r.menuList.length + 1];

		for (int i = 0; i < r.menuList.length; i++) {
			temp[i] = r.menuList[i];
		}
		Menu m = new Menu(name, price);
		temp[temp.length - 1] = m;
		r.menuList = temp;
		System.out.println("{" + m + "} 메뉴가 추가되었습니다.");
	}

	public Menu showMenuList(Restaurant r) {
		if (r.menuList.length == 0) {
			System.out.println(r.name + "에 등록된 메뉴가 없습니다.");
			return null;
		}
		list: while (true) {
			System.out.println("-----" + r.name + " 차림표 -----");
			for (int i = 0; i < r.menuList.length; i++) {
				System.out.println((i + 1) + ". " + r.menuList[i]);
			}
			System.out.println("--------------------------------");
			System.out.print("선택 >> ");
			input = ScanUtil.nextInt();
			if (input > r.menuList.length || input < 1) {
				System.out.println("잘못 입력하였습니다.");
			} else {
				System.out.println(r.menuList[input - 1] + "을(를) 선택하였습니다.");
				System.out.printf("가격은 %d원 입니다.", r.menuList[input - 1].price);
				System.out.println();
				break list;
			}
		}
		return r.menuList[input - 1];
	}

}

package e_oop.game.iLoveCoffe;

import java.util.Random;

import e_oop.ScanUtil;

public class Main {
	Cafe c;
	Shop s;
	Customer customer;
	int input;
	GameInit gi = new GameInit();

	public static void main(String[] args) {
		main:
		while(true) {
			System.out.print("카페를 오픈하시겠습니까? (y/n) >> ");
			String input = ScanUtil.nextLine();
			if(!input.equals("y") && !input.equals("Y") && !input.equals("n") && !input.equals("N")) {
				System.out.println("잘못 누르셨습니다.");
			}else {
				switch(input) {
				case "Y": case "y":
					new Main().cafeOpen();
					break;
				case "N": case "n":
					System.out.println("게임을 종료합니다.");
					break main;
				}
			}
		}

	}

	private void cafeOpen() {
		c = new Cafe();
		s = new Shop();
		
		System.out.print("카페 이름을 입력해주세요 >> ");
		c.name = ScanUtil.nextLine();
		game:
		while(true) {
			if(c.reputation < 0) {
				System.out.println("#### GAME OVER ####");
			}
			System.out.println("======== " + c.name + " 카페 ========");
			System.out.println(" 1.주문받기 2.음료제작 3.레시피확인 ");
			System.out.println(" 4.카페정보 5.상점방문 ");
			System.out.println("=====================================");
			input = ScanUtil.nextInt();
			menu:
			switch(input) {
			case 1:
				customer = new Customer(c.resipeList[new Random().nextInt(c.resipeList.length)]);
				c.visitCustomer(customer);
				break;
			case 2:
				customer = c.showCustomerList();
				if(customer == null) {
					break;
				}
				Recipe r = c.makeCoffe(customer);
				if(r == null) {
					System.out.print("그냥 주시겠습니까? (y/n) >> ");
					String input = ScanUtil.nextLine();
					if(!input.equals("y") && !input.equals("Y") && !input.equals("n") && !input.equals("N")) {
						System.out.println("잘못 누르셨습니다.");
					}else {
						switch(input) {
						case "Y": case "y":
							int reputation = customer.getCoffe(r);
							c.reputation += reputation;
							System.out.println("커피를 주지 않았습니다.");
							System.out.println("평판이 " + reputation + " 됩니다.");
							c.outCustomer(customer);
							break menu;
						case "N": case "n":
							break menu;
						}
					}
				}
				int money = customer.getCoffe(r);
				c.money += money;
				System.out.println("커피를 판매하였습니다.");
				System.out.println("소지금이 +" + money + "원 됩니다.");
				c.outCustomer(customer);
				
				break;
			case 3:
				c.showRecipeList();
				break;
			case 4:
				c.showInfo();
				break;
			case 5:
				s.showInterface(c);
				break;
			}
		}
	}

}








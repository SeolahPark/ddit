package e_oop.game.iLoveCoffe;

import e_oop.ScanUtil;

public class Shop {
	int input;
	public void showInterface(Cafe c) {
		shop:
		while(true) {
			System.out.println("-------- 상점 --------");
			System.out.println("1.재료구매 2.재료판매");
			System.out.println("3.레시피구매 0.나가기");
			System.out.println("----------------------");
			System.out.print("선택 >> ");
			input = ScanUtil.nextInt();
			switch(input) {
			case 1:
				buyInterface(c);
				break;
			case 2:
				sellInterface(c);
				break;
			case 3:
				recipeInterface(c);
				break;
			case 0:
			default:
				break shop;
			}
		}
	}
	
	private void recipeInterface(Cafe c) {
		while(true) {
			Recipe r = showRecipeList();
			if(r == null) {
				return;
			}
			if(c.money < r.amount) {
				System.out.println("소지금이 부족합니다.");
			}else {
				if(c.insertRecipe(r)) {
					c.money -= r.amount;
					System.out.println("구매 성공!");
				}
				return;
			}
		}
	}
	public Recipe showRecipeList() {
		while(true) {
			System.out.println("----- 레시피 목록 -----");
			for(int i = 0; i < GameInit.RECIPES.length; i++) {
				System.out.println((i+1) + " : " + GameInit.RECIPES[i]);
			}
			System.out.println("-----------------------");
			System.out.print("레시피 선택 (0.돌아가기) >> ");
			input = ScanUtil.nextInt();
			if(input > GameInit.RECIPES.length || input < 0 ) {
				System.out.println("잘못 입력하였습니다.");
			}else if(input == 0) {
				return null;
			}else {
				return GameInit.RECIPES[input - 1];
			}
		}
	}
	private void sellInterface(Cafe c) {
		while(true) {
			ItemBox ib = c.showItemList();
			if(ib == null) {
				return;
			}
			System.out.print("몇 개 판매하시겠습니까? >> ");
			int num = ScanUtil.nextInt();
			if(ib.count < num) {
				System.out.println("소지 개수가 부족합니다.");
			}else {
				c.money += ib.item.sellPrice * num;
				ib.count -= num;
				System.out.println((ib.item.sellPrice * num) + "원 판매 성공 !");
				return;
			}
		}
	}
	private void buyInterface(Cafe c) {
		while(true) {
			Item i = showItemList();
			if(i == null) {
				return;
			}
			System.out.print("몇 개 구매하시겠습니까? >> ");
			int num = ScanUtil.nextInt();
			if(c.money < (i.buyPrice * num)) {
				System.out.println("소지금이 부족합니다.");
			}else {
				c.insertItem(i, num);
				System.out.println("구매 성공!");
				return;
			}
		}
	}
	public Item showItemList() {
		while(true) {
			System.out.println("----- 아이템 목록 -----");
			for(int i = 0; i < GameInit.ITEMS.length; i++) {
				System.out.println((i+1) + " : " + GameInit.ITEMS[i].buyItem());
			}
			System.out.println("-----------------------");
			System.out.print("물건 선택 (0.돌아가기) >> ");
			input = ScanUtil.nextInt();
			if(input > GameInit.ITEMS.length || input < 0 ) {
				System.out.println("잘못 입력하였습니다.");
			}else if(input == 0) {
				return null;
			}else {
				return GameInit.ITEMS[input - 1];
			}
		}
	}

}

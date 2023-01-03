package e_oop.game.iLoveCoffe;

import e_oop.ScanUtil;

public class Cafe {
	int input;
	String name;
	int reputation = 100;
	int money = 60000;
	Customer[] waiting = new Customer[0];
	Recipe[] resipeList = new Recipe[1];
	ItemBox[] inventory = new ItemBox[2];
	
	public Cafe() {
		this.inventory[0] = new ItemBox(GameInit.ITEMS[0], 50);
		this.inventory[1] = new ItemBox(GameInit.ITEMS[1], 50);
		this.resipeList[0] = GameInit.RECIPES[0];
	}

	public void showInfo() {
		System.out.println("----- " + this.name + " 카페 정보 -----");
		System.out.println("소지금 : " + this.money + "원");
		System.out.println("--- 레시피 ---");
		for(int i = 0; i < this.resipeList.length; i++) {
			System.out.println(this.resipeList[i]);
		}
		System.out.println("--------------");
		System.out.println("--- 아이템 ---");
		for(int i = 0; i < this.inventory.length; i++) {
			System.out.println(this.inventory[i]);
		}
		System.out.println("--------------");
	}

	public boolean insertRecipe(Recipe r) {
		boolean duple = false;
		for(int i = 0; i < this.resipeList.length; i++) {
			if(this.resipeList[i].equals(r)) {
				duple = true;
			}
		}
		
		if(duple) {
			System.out.println("이미 소유중입니다.");
			return false;
		}
		
		Recipe[] temp = new Recipe[this.resipeList.length + 1];
		for(int i = 0; i < this.resipeList.length; i++) {
			temp[i] = this.resipeList[i];
		}
		temp[temp.length - 1] = r;
		this.resipeList = temp;
		return true;
	}

	public Recipe showRecipeList() {
		System.out.println("---- 레시피 목록 ----");
		for(int i = 0; i < this.resipeList.length; i++) {
			System.out.println((i+1) + " : " + this.resipeList[i]);
		}
		System.out.println("---------------------");
		return null;
	}

	public void insertItem(Item i, int num) {
		int idx = this.inventory.length;
		for(int j = 0; j < this.inventory.length; j++) {
			if(i.equals(this.inventory[j].item)) {
				idx = j;
			}
		}
		if(idx < this.inventory.length) {
			this.inventory[idx].count += num;
		}else {
			ItemBox[] temp = new ItemBox[this.inventory.length + 1];
			for(int j = 0; j < this.inventory.length; j++) {
				temp[j] = this.inventory[j];
			}
			temp[temp.length - 1] = new ItemBox(i, num);
			this.inventory = temp;
		}
	}

	public ItemBox showItemList() {
		while(true) {
			System.out.println("----- 아이템 목록 -----");
			for(int i = 0; i < this.inventory.length; i++) {
				System.out.println((i+1) + " : " + this.inventory[i].item.sellItem(this.inventory[i].count));
			}
			System.out.println("-----------------------");
			System.out.print("물건 선택 (0.돌아가기) >> ");
			input = ScanUtil.nextInt();
			if(input > this.inventory.length || input < 0 ) {
				System.out.println("잘못 입력하였습니다.");
			}else if(input == 0) {
				return null;
			}else {
				return this.inventory[input - 1];
			}
		}
	}

	public void visitCustomer(Customer customer) {
		if(this.waiting.length == 10) {
			System.out.println("더 이상 손님을 기다리게 할 수 없습니다.");
			return ;
		}
		System.out.println("@@ 손님이 방문했습니다 @@");
		System.out.println(customer);
		Customer[] temp = new Customer[this.waiting.length + 1];
		for(int i = 0; i < this.waiting.length; i++) {
			temp[i] = this.waiting[i];
		}
		temp[temp.length - 1] = customer;
		this.waiting = temp;
	}

	public Customer showCustomerList() {
		while(true) {
			System.out.println("----- waiting 목록 -----");
			for(int i = 0; i < this.waiting.length; i++) {
				System.out.println((i+1) + " : " + this.waiting[i]);
			}
			System.out.println("-----------------------");
			System.out.print("손님 선택 (0.돌아가기) >> ");
			input = ScanUtil.nextInt();
			if(input > this.waiting.length || input < 0 ) {
				System.out.println("잘못 입력하였습니다.");
			}else if(input == 0) {
				return null;
			}else {
				return this.waiting[input - 1];
			}
		}
	}

	public Recipe makeCoffe(Customer customer) {
		boolean check = true;
		int[] jList = {-1, -1, -1, -1};
		int count = 0;
		
		for(int i = 0; i < customer.r.requireItems.length; i++) {
			for(int j = 0; j < this.inventory.length; j++) {
				if(customer.r.requireItems[i].equals(this.inventory[j].item)) {
					jList[i] = j;
				}
			}
			if(jList[i] != -1) {
				check = true;
				count ++;
			}else {
				check = false;
			}
		}
		
		if(count == 4) {
			count = 0;
			for(int i = 0; i < jList.length; i++) {
				if(this.inventory[jList[i]].count > 0) {
					this.inventory[jList[i]].count --;
					count++;
				}else {
					break;
				}
			}
			if(count != 4) {
				for(int i = 0; i < count; i++) {
					this.inventory[jList[i]].count++;
				}
				check = false;
			}
		}
		
		if(check) {
			System.out.println("@@ [" + customer.r.name + "] 을(를) 주었습니다 @@ ");
			return customer.r;
		}else {
			System.out.println("제작에 필요한 재료가 부족합니다.");
			return null;
		}
	}

	public void outCustomer(Customer customer) {
		Customer[] temp = new Customer[this.waiting.length - 1];
		int tune = 0;
		for(int i = 0; i < temp.length; i++) {
			if(this.waiting[i].equals(customer)) {
				tune ++;
			}
			temp[i] = this.waiting[i + tune];
		}
		this.waiting = temp;
	}
}










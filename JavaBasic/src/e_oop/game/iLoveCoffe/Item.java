package e_oop.game.iLoveCoffe;

public class Item {
	String name;
	int buyPrice;
	int sellPrice;
	
	public Item(String name, int buyPrice, int sellPrice) {
		this.name = name;
		this.buyPrice = buyPrice;
		this.sellPrice = sellPrice;
	}
	
	public String sellItem(int num) {
		return String.format("[%5s] - %8s원 (%d개 보유)", this.name, this.buyPrice, num);
	}
	public String buyItem() {
		return String.format("[%5s] - %8s원", this.name, this.buyPrice);
	}
}

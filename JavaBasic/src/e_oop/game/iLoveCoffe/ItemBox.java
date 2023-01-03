package e_oop.game.iLoveCoffe;

public class ItemBox {
	Item item;
	int count;
	
	public ItemBox(Item item, int count) {
		this.item = item;
		this.count = count;
	}

	@Override
	public String toString() {
		return String.format("[%s] - %d개", this.item.name, this.count);
	}
}

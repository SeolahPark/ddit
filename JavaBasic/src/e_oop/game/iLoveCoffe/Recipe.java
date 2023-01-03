package e_oop.game.iLoveCoffe;

public class Recipe {
	String name;
	Item[] requireItems = new Item[4];
	int price;
	int amount;
	
	public Recipe(String name, int price, int amount, Item req0, Item req1, Item req2, Item req3) {
		this.name = name;
		this.price = price; 
		this.amount = amount; 
		this.requireItems[0] = req0;
		this.requireItems[1] = req1;
		this.requireItems[2] = req2;
		this.requireItems[3] = req3;
	}
	
	public String toString() {
		return String.format("[%s] => %s + %s + %s + %s", this.name, this.requireItems[0].name
				, this.requireItems[1].name, this.requireItems[2].name, this.requireItems[3].name);
	}
}

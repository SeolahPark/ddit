package e_oop.game.iLoveCoffe;

import java.util.Random;

public class Customer {
	Recipe r;
	String ment;

	public Customer(Recipe r) {
		this.r = r;
		this.ment = GameInit.FRONT_SCRIPT[new Random().nextInt(GameInit.FRONT_SCRIPT.length)]
				+ "[" + r.name + "] "
				+ GameInit.BACK_SCRIPT[new Random().nextInt(GameInit.BACK_SCRIPT.length)];
	}
	
	public String toString() {
		return ment;
	}

	public int getCoffe(Recipe r) {
		if(this.r.equals(r)) {
			System.out.println(GameInit.END_SCRIPT[new Random().nextInt(GameInit.END_SCRIPT.length)]);
			return r.price;
		}else {
			return -10;
		}
	}
}

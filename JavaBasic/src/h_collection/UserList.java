package h_collection;

import java.util.ArrayList;

public class UserList<E> extends ArrayList<E> {

	@Override
	public String toString() {
		String str = "";
		str += this.get(0);
		for (int i = 1; i < this.size(); i++) {
			str += "\t" + this.get(i);
		}
		str += "\n";
		return str;
	}
}

package e_oop2.phone;

public class PhoneTest {

	public static void main(String[] args) {
		Phone p1 = new Phone(new Apple());
		p1.bt.press();
		Phone p2 = new Phone(new Galaxy());
		p2.bt.press();

		// button 부모(->기능적음), apple & galaxy 자식(->기능많음)
		Button b = new Apple(); // 자식들이 알아서 Button으로 형변환한다.
		Button c = new Galaxy();// 자식들이 알아서 Button으로 형변환한다.

		b.press();
		c.press();
	}

}

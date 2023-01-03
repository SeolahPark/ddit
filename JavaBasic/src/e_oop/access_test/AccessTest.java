package e_oop.access_test;

import e_oop.AccessModifier;

public class AccessTest {

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();

		System.out.println(am.publicVar); // everywhere
		am.publicMethod();

//		System.out.println(am.protectedVar); // 같은패키지or상속 -> 잘 사용x
//		am.protectedMethod();

//		System.out.println(am.defaultVar); // 같은패키지 -> 잘 사용x
//		am.defaultMethod();

//		System.out.println(am.privateVar); // 같은클래스
//		am.privateMethod();
	}

}

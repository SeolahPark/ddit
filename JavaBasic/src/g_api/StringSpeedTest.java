package g_api;

public class StringSpeedTest {

	//
	// 문자열을 사용하는 방법에는 String 객체와 StringBuffer 객체가 있다.
	// 다양한 장단점이 있지만 속도만 보자
	//

	public static void main(String[] args) {
		String str = "a";

		long start = System.currentTimeMillis();
		for (int i = 0; i < 20000; i++) {
			str += "a";
		}
		long end = System.currentTimeMillis();
		System.out.println("String 객체 : " + (end - start) + "ms");
		
		System.out.println("------------------------------");

		StringBuffer sb = new StringBuffer("a");
		start = System.currentTimeMillis();
		for (int i = 0; i < 20000; i++) {
			sb.append("a");
		}
		end = System.currentTimeMillis();
		System.out.println("StringBuffer 객체 : " + (end - start) + "ms");
	}

}

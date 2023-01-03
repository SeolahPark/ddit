package g_api;

import java.util.Arrays;

public class StringClass {

	//
	// * String api *
	// - 여러개의 '문자'를 사용하기 쉽게 만들어놓은 클래스
	//
	// * String의 주요 메서드 *
	// - boolean equals() : 문자열의 내용이 같은지 반환한다. (Override)
	// - int length() : 문자열의 길이를 반환한다.
	// - char charAt(int index) : 특정 인덱스에 위치한 문자를 반환한다.
	// - String substring(int beginIndex[, int endIndex]) : 문자열의 특정 부분을 잘라서 반환한다.
	// - int indexOf(String str) : 문자열 내의 특정 문자의 인덱스를 반환한다.
	// - boolean contains() : 문자열이 특정 문자열을 포함하고 있는지 반환한다.
	// - String split() : 문자열을 특정 문자를 기준으로 나누어 배열형태로 반환한다.
	// - String trim() : 문자열 앞 뒤 공백을 제거해 반환해준다.
	// - String valueOf() : 다른 타입의 데이터를 문자열로 변환해 반환해준다.
	//

	public static void main(String[] args) {

//		1. equlas : 문자열의 내용이 같은지 반환한다. (Override)
		String s1 = new String("문자열");
		String s2 = new String("문자열");
		String s3 = "문자열";
		String s4 = "문자열";

		System.out.println(s1.equals(s2)); // 내용값을 비교하니까 true
		System.out.println(s1 == s2); // 주소값이 다르니까 false

		System.out.println(s3.equals(s4)); // true
		System.out.println(s3 == s4); // true
		// String은 변수처럼 사용할 수 있어서 메모리 내에 "문자열"을 만들어놓고 변수마다 주소값을 공유함.

//		
//		2. length : 문자열의 길이를 반환한다.
		System.out.println(s1.length()); // -> byte 말고 칸

//		
//		3. charAt : 특정 인덱스에 위치한 문자를 반환한다.
//		for (int i = 0; i < s2.length(); i++) {
//			char charAt = s2.charAt(i);
//			System.out.println(charAt);
//		}

//		Q. s1을 뒤집어 출력해주세요.
		String rev = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			rev += s1.charAt(i);
			System.out.println(rev);
		}
		System.out.println("완성 : " + rev);

//		
//		4. subString : 문자열의 특정 부분을 잘라서 반환한다.
		// -- 0123456789
		s1 = "abcdefghij";
		String sub1 = s1.substring(3); // 3번 인덱스부터 끝까지
		System.out.println(sub1);
		String sub2 = s1.substring(5, 8); // 5번부터 8번 전까지
		System.out.println(sub2);

//		
//		5. indexOf : 문자열 내의 특정 문자의 인덱스를 반환한다.
		int indexOf = s1.indexOf("e");
		System.out.println(indexOf); // 해당 문자열이 위치하는 인덱스 반환
		indexOf = s1.indexOf("z");
		System.out.println(indexOf); // 찾으려는 문자열이 없으면 -1 반환

//		Q. "심동근,김소민,고영경,송지훈"을 잘라보세요
		s1 = "심동근,김소민,고영경,송지훈";
		String strtmp = "고영경";
		System.out.println(s1.substring(s1.indexOf(strtmp), (s1.indexOf(strtmp) + strtmp.length())));

//		Q. substring 과 indexof를 조합해서 가격만 int[]에 저장해주세요.
		String[] menu = { "수박 20000원", "오렌지 10000원", "귤 500원", "블루베리 3000원" };
		String[] tmp = new String[menu.length];
		int[] prices = new int[menu.length];

		for (int i = 0; i < menu.length; i++) {
			String str = menu[i];
			tmp[i] = str.substring(str.indexOf(" ") + 1, str.indexOf("원"));
			prices[i] = Integer.parseInt(tmp[i]);
		}
		System.out.println(Arrays.toString(prices));

//		
//		6. contains : 문자열이 특정 문자열을 포함하고 있는지 반환한다.
		s1 = "abcdefghij";

		// 방법1 -> 잘안씀.
		boolean contains = s1.contains("c");
		System.out.println(contains);

		// 방법2 -> 이렇게 함(포함여부, 인덱스위치도 알 수 있어서)
		contains = s1.indexOf("c") > -1;
		System.out.println(contains);

//		
//		7. split : 문자열을 특정 문자를 기준으로 나누어 배열형태로 반환한다. (기준은 배열에 들어가지않음.)
		String[] split = s1.split("e");
		System.out.println(Arrays.toString(split));
		// {abcd, fghij}

		split = s1.split("@");
		System.out.println(Arrays.toString(split));
		// {abcdefghij} ~> 없는 문자로 나누는 경우 전체가 하나의 배열에 담긴다.

		split = s1.split("a");
		System.out.println(Arrays.toString(split));
		// {, bcdefghij} ~> 첫문자나 마지막문자로 나누는 경우 배열에 공백("")이 들어간다. (null x)

		for (int i = 0; i < menu.length; i++) {
			split = menu[i].split(" ");
			System.out.printf("이름 : %s / 가격 : %s\n", split[0], split[1]);
		}

//		
//		8. trim : 문자열 '앞,뒤' 공백을 제거해 반환해준다.
		s1 = " 문 자 열 ";
		String trim = s1.trim();
		System.out.println("[" + s1 + "] => [" + trim + "]");
		// 사용예 : 사용자의 실수로 아이디나 비밀번호 뒤에 공백이 들어가는 것을 방지할 수 있다.
		// (js에서 .trim()은 모든 공백을 제거한다.)

//		
//		9. valueOf : 다른 타입의 데이터를 문자열로 변환해 반환해준다.
		int number = 10;

		// 방법1
		s1 = number + "";
		System.out.println(s1);

		// 방법2
		s1.valueOf(number); // Integer.parseInt(s1) 와 같은 느낌.
		System.out.println(s1);

	}

}

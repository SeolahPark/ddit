package b_operator;

public class B_ComparingOperator {

	public static void main(String[] args) {
		/* [비교 연산자]
		 *  - >, <, >=, <=, ==, !=
		 *  문자열 비교 : .equals()
		 *  비교연산자의 연산 결과는 boolean 이다.
		 */
		
		boolean b = 10 < 20;
		System.out.println("10 < 20 -> " + b);
		b = 10 <= 20 - 15;
		System.out.println("10 <= 20 - 15 -> " + b);
//		비교연산자와 산술연산자가 만나면 산술연산자가 우선이다. 따라서 계산하면 10 <= 5 이므로 false
		
		String str1 = "abc";
		String str2 = "abc";
		b = str1 == str2;
//		원래 문자열은 ==로 비교할 수 없다. 문자열의 내용이 아닌 주소로 비교한 것이다.(참조형 변수)
		System.out.println("str1 == str2 -> " + b);

		String str3 = new String("abc");
		String str4 = new String("abc");
//		각각 새로운 주소에 문자열을 저장.
		b = str3 == str4;
//		str3과 str4의 주소가 다르므로 false라고 뜸.
		System.out.println("str3 == str4 -> " + b);
		
//		String을 비교하기 위해서는 equals() 메서드를 사용한다.
		b = str3.equals(str4);
		System.out.println("str3 == str4 -> " + b);
	}

}

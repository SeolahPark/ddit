package a_hello;
//import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// 클래스에 대해 배우기 전까지 모든 코드는 이곳에 작성된다.
		// 주석 : 프로그램 코드로 인식하지 않는 문장 (주로 코드를 설명할 때 사용)
		//한줄주석 : ctrl + shift + c or ctrl + /

		/*
		 * 범위주석 : ctrl + shift + / (해제 : \) 
		 * 범위주석 안에서 
		 * 엔터를치면
		 * 범위가 늘어난다
		 */
		
		/*
		 * 데이터의종류 
		 * - 정수 : 10, -10, 868, -73525
		 * - 실수 : 3.14, -1.9
		 * - 문자 : 'a', '가', '1'
		 * - 논리 : true, false
		 * 
		 * 프로그래밍 언어의 기준으로 데이터의 종류를 나눠놓은 것
		 *  : 자료형 ( data type )
		 *  
		 *  기본형 타입 (괄호 안에는 자료형의 크기 bytes)
		 *   - 정수 : byte(1), short(2), int(4), long(8)
		 *   - 실수 : float(4), double(8)
		 *   - 문자 : char(2)
		 *   - 논리 : boolean(1)
		 *   
		 *  변수를 만들 때 타입을 사용한다.
		 *  데이터를 다룰 때 일반적으로 변수라는 그릇에 담아서 사용한다.
		 */
		
		//변수 : 하나의 데이터를 담을 수 있는 그릇
		int age; 
		//변수 선언 : 변수를 만드는 곳
		double pi; 
//		double pi; 한 블럭 안에서 변수의 이름은(자료형 무관) 중복될 수 없다.
		
		//int 국어, 영어, 수학; 
		//같은타입의 변수는 한번에 선언 가능. 다만 한글로 선언하지말기
		int kor, eng, math;
		int scoreAgv; //낙타표기법
		int score_total; //뱀표기법
		
		age = 10+20; 
		//초기화 : 변수에 처음으로 값을 입력함.
//		age = "20"; //변수의 타입에 맞는 값을 저장해야한다.
		pi = 3.142425;
		kor = 95;
		eng = 50;
		math = 80;
		score_total = kor+eng+math;
		scoreAgv = score_total/3;
		
		System.out.println(age);
		System.out.println(pi);
		System.out.println(score_total);
		System.out.println(scoreAgv);
		
		int abc = 10;
		System.out.println(abc);
		
		long l = 40L; 
		//접미사 L(l)을 붙여야 long타입이 된다. 안붙이면 int
		float f = 50F; 
		//접미사 F(f)를 붙여야 float 타입이 된다. 안붙이면 int
		char c = '한'; 
		//단따옴표 안에 한 글자(=문자)만 넣어야 한다.
		boolean b = true; 
		//true, false 둘 중 하나만 사용 가능.
		
		//8가지 기본형 타입을 사용하여 변수 선언 및 초기화.
		byte _byte = 127;
		short _short = 12546;
		int _int = 1234;
		long _long = 12345678l;
		float _float = 12.34F;
		double _double = 1234.5678;
		char _char = '가';
		//boolean _boolean = true;
		
		int vA = 1, vB = 2, vC=10; 
		//한번에 여러 변수를 선언하고 초기화 가능.
		
		System.out.println(_double);
		
		//형변환 - 표현범위가 작은 쪽에서 큰 쪽으로 형변환은 생략가능하다.
		int small = 10;
		long big = 2468545453554351841l;
		System.out.println(big);
		small = (int)big; // 큰->작
		System.out.println(small);
		//big = small; // 작->큰
		
		/* 상수(fianl)
		 * 처음 담은 값을 변경할 수 없는 그릇, 고정해서 저장. 
		 * 리터럴에 의미를 부여하기 위해 사용한다.
		 * 보통 전체 대문자 & 뱀표기법 사용*/
		//final int MAX_NUMBER;
		//MAX_NUMBER = 10;
		//MAX_NUMBER = 200; 
		//처음 넣어준 값을 변경 할 수 없다. - 컴파일 에러발생
		/*
		
		System.out.println("'줄바꿈'을 한다."); 
		//print 뒤에 ln이 붙으면 줄바꿈이 된다.
		System.out.print("'줄바꿈'을 안한다. ");
		System.out.println(small);
		System.out.println("나이 : " + age + age ); 
		//문자열 + 숫자가 되면 뒤 숫자가 문자열이 된다.
		System.out.println(age + age + " 입니다."); 
		//문자열 만나기 전에 숫자부터 만나면 계산이 됨.
		System.out.printf("나이는 %d 입니다.", age); 
		//print 뒤에 f가 붙으면 format을 입력해줘야한다.
		System.out.println(small);
		
		Scanner sc = new Scanner(System.in);
		//사용자의 입력을 받기 위해서 스캐너 변수 선언 -> 메인 메소드 밖에 사용하겠다고 선언해야함.
		
		System.out.println("입력해주세요. : ");
		String str = sc.nextLine();
		System.out.println(str);
		//입력을 받게 되면 사용자가 입력할 때 프로그램이 멈추게 된다.
		//내용을 입력 후 엔터를 치면 종료되고 프로그램이 다시 진행된다. 
		
		//int nextInt = sc.nextInt();
		//double nextDouble = sc.nextDouble();
		//이런것들도 있지만 버그로 인해 사용하지않는다.
		
		//숫자를 입력받고 싶을때
		System.out.print("정수를 입력해주세요 : ");
		String input = sc.nextLine();
		//문자열 변수 선언 후, 사용자로부터 문자열을 입력받는다.
		int iInput = Integer.parseInt(input);
		//String을 int로 바꿔주는 형태.
		
		System.out.println(iInput);*/
		
		// (숙제) 
		// 자신의 이름과 나이를 입력받아 변수를 선언 및 초기화 하고 출력하세요
		// ex. 이름 : 홍길동, 현재나이 : 20세, 내년나이 : 21세
		
/*
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요. : ");
		String str = sc.nextLine();
		
		System.out.print("나이를 입력해주세요 : ");
		String input = sc.nextLine();
		int iInput = Integer.parseInt(input);
		
		
		System.out.println("");
		System.out.println("이름 : " + str);
		System.out.println("현재나이 : " + iInput);
		iInput += 1;
		System.out.println("내년나이 : " + iInput);
*/
	}

}

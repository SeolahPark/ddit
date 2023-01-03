package e_oop;

public class OOP {

	public static void main(String[] args) {
		//
		// 객체지향 프로그래밍 (Object Oriented Programming)
		// - 프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라 객체간의 상호작용으로 보는 개념.
		// - 코드의 재사용성이 높고 유지보수가 용이하다.
		// 객체 : 클래스를 이용하여 만든 것
		SampleClass sc1 = new SampleClass();
		SampleClass sc2 = new SampleClass();
		SampleClass sc3 = new SampleClass();

		System.out.println(sc1.classNumber);
		System.out.println(sc2.classNumber);
		sc2.classNumber = "407";
		System.out.println(sc2.classNumber);

		sc3.flowTest1();
		sc2.method2("parm");

		System.out.println("--------------------");
		// 방금 만든 클래스(클래스메이커)의 객체를 생성하고 변수에 저장해주세요.
		ClassMaker sc4 = new ClassMaker();

		// 객체가 저장된 변수를 통해 메서드를 하나씩 호출해주세요.
		// 파라미터가 있는 메서드는 타입에 맞는 값을 넘겨주고, 리턴타입이 있는 메서드는 리턴받아 값을 출력해주세요.
		sc4.method1(); // XX
		System.out.println(sc4.method2()); // OX
		sc4.method3("param"); // XO
		System.out.println("method4 : " + sc4.method4(14, 35)); // OO
		System.out.println("--------------------");

//		다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
//		Calculator 클래스를 만들고 각 번호별 메서드를 만들어주세요.
//		1. 123456 + 654321
//		2. 1번의 결과값 * 123456
//		3. 2번의 결과값 / 123456
//		4. 3번의 결과값 - 654321
//		5. 4번의 결과값 % 123456
		Calculator cct = new Calculator();
		long temp = 0;
		temp = cct.addition(123456, 654321);
		temp = cct.multiplication(temp, 123456);
		temp = cct.division(temp, 123456);
		temp = cct.subtraction(temp, 654321);
		temp = cct.remainder(temp, 123456);
		System.out.println("% 결과값 : " + temp);
		System.out.println("--------------------");
		
		cct._addition();
		cct._multiplication();
		cct._division();
		cct._subtraction();
		cct._remainder();

	}

}

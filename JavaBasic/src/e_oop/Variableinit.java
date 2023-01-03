package e_oop;

//import java.util.Random;
//import java.util.Scanner;

public class Variableinit {
	int _int;

	// 명시적 초기화
	int var = 10;
	static int staticVar = 20;

	// 초기화 블럭 -> 잘 안씀
	{
		var = 20;
		staticVar = 30; // -> 일반 초기화 블럭에서 스태틱변수 초기화 가능.
	}

	// 스태틱 블럭 -> 잘 안씀
	static {
		staticVar = 40;
//		var = 30; // -> 스태틱 블럭에서 초기화 불가능.
	}

	//
	// 생성자
	// - 클래스와 이름이 같은 메서드, 인스턴스 변수로 초기화하기 위해 사용한다.
	// - 클래스에 생성자는 반드시 하나 이상 존재해야한다. 직접 선언해주지 않으면 컴파일러가 기본 생성자를 만들어준다.
	// - 생성자는 리턴타입이 없다.
	// ㄱ 형태
	Variableinit() {
		var = 50;
		// 기본생성자
		// 생성자를 사용하는 이유
		// - 초기화에 여러줄의 코드가 필요할 때
		// - 초기화에 파라미터가 필요할 때
	}

	// 오버로딩 : 같은 이름의 메서드를 여러개 정의하는 것
	Variableinit(int var) {
		this./* 전역변수 */var = /* 파라미터 */var;
		// this : 이 클래스 자체를 this라고 부름. 인스턴스 변수와 지역변수의 이름이 같을 때 둘을 구분하기 위해서 사용.
	}

	public static void main(String[] args) {
		
		
		System.out.println(new Variableinit()._int);
		// stack메모리 안에 있는 값을 static 에서 사용하고싶으면 new로 선언 후 사용하여야 한다.
		// static은 사용하지 않는게 좋음. static을 사용 할 상황이 온다면 다른걸 사용하기.

//		Random rnd = new Random();
		System.out.println(new Variableinit().var); // var의 변천사 : 10 -> 20 -> 50
		System.out.println(new Variableinit(70).var); // var의 변천사 : 10 -> 20 -> 50 -> 70

		System.out.println("\n----");
		DditClass class405 = new DditClass();
		System.out.println(class405.computer);
		System.out.println(class405.student);
		System.out.println(class405.teacher);
		System.out.println("\n----");
//		class405.computer = 25;
//		class405.student = 25;
		class405.teacher = "조현준";
		System.out.println(class405.computer);
		System.out.println(class405.student);
		System.out.println(class405.teacher);

		DditClass class407 = new DditClass();
//		class407.computer = 25;
//		class407.student = 25;
		class407.teacher = "홍길동";

		DditClass class408 = new DditClass();
//		class408.computer = 25;
//		class408.student = 25;
		class408.teacher = "이순신";

		System.out.println("\n----");
		DditClass class409 = new DditClass();
		class409.teacher = "아이유";
		System.out.println("class409.computer : " + class409.computer);
		System.out.println("class409.student : " + class409.student);
		System.out.println("class409.teacher : " + class409.teacher);

		System.out.println("\n----");
		DditClass class410 = new DditClass("유관순");
		System.out.println("class410.computer : " + class410.computer);
		System.out.println("class410.student : " + class410.student);
		System.out.println("class410.teacher : " + class410.teacher);
		
		System.out.println("\n----");
		DditClass class411 = new DditClass();
		System.out.println("class411.computer : " + class411.computer);
		System.out.println("class411.student : " + class411.student);
		System.out.println("class411.teacher : " + class411.teacher);
		
//		Scanner input = new Scanner(); // 기본 생성자가 없기때문에 이런 형식으로 사용 불가능. 입력받기 위한 목적이 있기 때문.
		
		
		
	}

}

class DditClass {
	int computer;
	int student;
	String teacher;

	// 오버로딩 : 같은 이름의 메서드를 여러개 정의하는 것
	DditClass() { // 얘를 주석해버리면 407, 408, 409 오류남. 왜냐면 파라미터가 있는 생성자가 선언되었기 때문.
		//this. : 인스턴스 변수와 지역변수의 이름이 같을 때 둘을 구분하기 위해서 사용.
		//this.computer = 10;
		//this.student = 10;
		this(null);
	}

	DditClass(String str) {
		this.computer = 25;
		this.student = 25;
		this.teacher = str;
	}
}

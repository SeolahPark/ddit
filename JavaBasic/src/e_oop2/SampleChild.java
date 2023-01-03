package e_oop2;

public class SampleChild extends SampleParent {
	String var2;

	public void childMethod() {
		//
		// 상속받은 변수와 메서드를 사용할 수 있다.
		//
		System.out.println(var);
		System.out.println(methodA(1, 2));
	}

	@Override // 오버라이딩 : 상속받은 메서드의 내용을 재정의하는 것. 리턴타입,파라미터갯수와 종류가 동일해야한다.
				// @ : 어노테이션 : 클래스, 변수, 메서드 등에 표시해놓은 태그
	public int methodA(int a, int b) {
		return a * b;
	}

	int var; // 부모가 가지고있는 변수의 이름과 똑같은 이름의 변수를 자식에서 선언하는 경우,
				// super : 부모클래스의 멤버와 자식클래스의 멤버를 구분하기 위해 사용한다.

	public void testMethod(double var) {
		System.out.println(var); // 지역변수(파라미터)
		System.out.println(this.var); // 전역변수(자식클래스)
		System.out.println(super.var); // 전역변수(부모클래스)
		System.out.println(this.methodA(3, 3)); // -> *
		System.out.println(super.methodA(3, 3)); // -> +
	}

	public SampleChild() {
		super("홍길동"); // 부모클래스의 생성자(SampleParent())를 호출하는 메서드가 생략되어있음. 그래도 실행함
						// super()를 통해 클래스의 생성자를 호출하고 부모클래스의 인스턴스 변수도 초기화한다.
						// super()가 없으면 컴파일러가 자동으로 suer()를 넣어준다. 다만 안보인다.
//		super();
	}

	public static void main(String[] arg) {
		SampleChild sc = new SampleChild();
		sc.testMethod(1.1);

		//
		// * 다형성 *
		// 부모타입의 변수로 자식타입의 객체를 사용하는 것
		//
		SampleParent sp = new SampleChild(); // -> SampleParent sp = ((SampleParent)new SampleChild()); 자동형변환. 명시하지않아도 됨
		System.out.println(sp.methodA(2, 3));
		// ㄴ 오버라이딩 했기때문에 자식클래스의 메서드를 실행한다.
		// 오버라이딩 했다는건 부모가 가지고 있었다는 얘기이므로 형변환 하지 않아도 사용 할 수 있다.
//		sp.testMethod(); -> 오류남. 당연함. 부모에 이런 메서드가 없음.
		((SampleChild) sp).testMethod(6.6); // -> sp를 강제로 SampleChild로 바꾸고 testMethod()를 사용할 수 있음.
		SampleChild child = (SampleChild) sp;

		System.out.println("--------------------------");

		child.testMethod(8.8);
//		SampleParent sp2 = new SampleParent();
//		((SampleChild)(sp2)).testMethod(6); //-> sp2를 강제로 SampleChild로 바꿔도 testMethod()를 사용할 수 없음.
		// ㄴ Exception in thread "main" java.lang.ClassCastException:
		// e_oop2.SampleParent cannot be cast to e_oop2.SampleChild at
		// e_oop2.SampleChild.main(SampleChild.java:52)

//		sc = (SampleChild)new SampleParent(); //-> 자식타입으로 형변환하기 위해선 명시적으로 선언해야함.
//		sc.testMethod(2.2);
		// 자식이 부모가 될 수는 있어도 부모가 자식이 될 수는 없다.

	}
}

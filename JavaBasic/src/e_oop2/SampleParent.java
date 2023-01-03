package e_oop2;

public class SampleParent extends Object {
	//
	// * 상속 *
	// - 기존의 클래스를 물려받아 새로운 클래스를 만드는 것
	// - 자식클래스명 extends 부모클래스명 { }
	// - 부모 클래스의 생성자와 초기화블럭을 제외한 모든 멤버를 물려받는다.
	// - 하나의 클래스만 상속받을 수 있다.
	// - 상속받지 않은 모든 클래스는 Object 클래스를 상속받는다 (extends Object -> 적혀있지 않지만 자동으로 추가됨.)
	// - 자식 클래스는 부모 클래스와 멤버 외의 새로운 멤버(전역변수 등)를 가질 수 있으므로
	//   자식 클래스는 부모 클래스보다 크거나 같다.
	// - 두 개 이상의 클래스를 만드는데 공통된 멤버가 있는 경우 부모클래스로 만든다.
	// - !!가장 큰 단점은 하나밖에 상속받을 수 없다는 것!!
	//
	String var;
	int score;
	String name;
	{
		//
		// * 초기화 블럭 *
		// - 생성자보다 먼저 실행되는 블럭
		// - 다양한 생성자를 이용하여 클래스를 만들때, 공통된 멤버를 초기화하기 위해 사용한다.
		//
		var = "초기화블럭은 물려주지 않는다.";
		this.score = 0;
	}

	public SampleParent() { // 생성자
//		this.score = 0;
		var = "생성자도 물려주지 않는다.";
		System.out.println("부모클래스 생성!");
	}

	public SampleParent(String name) {
		this.name = name;
//		this.score = 0; -> 다른 생성자와 초기화가 중복되므로 초기화블럭에 넣어서 코드를 줄인다.
	}

	public int methodA(int a, int b) {
		return a + b;
	}
}

package e_oop;

public class ClassMaker {

	public static void main(String[] args) {
		// 테스트코드 작성
		// 메인메소드가 static이라 일반 메소드를 직접 실행시킬 수 없으므로 new를 사용해서 실행해야함.
		// static이 붙는 순간 메모리가 다른 지역에 있기 때문에 그냥 참조가 불가능. 생성 후 참조해야함
		ClassMaker cm = new ClassMaker();
		cm.test();
	}

	public void test() {
		method1();
		System.out.println(method2());
		method3("파라미터");
		System.out.println("method4 : " + method4(57, 33));
	}

// 1. 전역변수 하나를 선언 및 초기화 해주세요.
	String globalVariable;

// 2. 리턴타입과 파라미터가 없는 메서드를 하나 만들어주세요. (단, 메서드 안에서 전역변수를 출력)
	public void method1() {
		System.out.println("method1 : " + this.globalVariable);
	}

// 3. 전역변수와 동일한 타입의 리턴타입이 있고, 파라미터가 없는 메서드를 하나 만들어주세요. (단, 메서드 안에서 전역변수 리턴)
	public String method2() {
		return this.globalVariable = "method2 : 박설아";
	}

// 4. 리턴타입은 없고 파라미타가 있는 메서드 하나를 만들어주세요. (단, 메서드 안에서 파라미터를 출력해주세요.)
	public void method3(String globalVariable) {
		System.out.println("method3 : " + globalVariable);
	}

// 5. int타입의 리턴타입과 int타입의 파라미터 두 개가 있는 메서드를 하나 만들어주세요. (단, 메서드 안에서 두 파라미터를 * 리턴)
	/* 생략 */public/* 가능 */ int method4(int a, int b) {
		return a * b;
	}
}

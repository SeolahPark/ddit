package e_oop2;

public interface SampleInterface {
	//
	// 인터페이스
	// 괜히 무겁게 만들지 말고 추상메소드로 선언하고 싶은 것만 넣어서 생성.
	// 인터페이스의 목적 : 인터페이스를 구현한 모든 객체가 똑같은 기능을 가져 실행 할 수 있도록 한다.

	// 모든 멤버변수(전역변수)는 public static final 제어자를 사용한다.
	public static final int NUM1 = 1;

	// 모든 멤버변수(전역변수)의 제어자가 같기때문에 생략이 가능하다. -> 타입만 정해주기
	int NUM2 = 2;

	// 인터페이스의 모든 메서드는 public abstract 제어자를 사용한다.
	public abstract void method1();

	// 모든 메서드의 제어자가 같기때문에 생략이 가능하다. -> 리턴타입만 정해주기
	void method2();
}

interface SampleInterface2 {
	void method3();

	void method4();
}

interface SampleInterface3 {
	void method5();
}

class SampleImplements extends SampleAbstractParent implements SampleInterface, SampleInterface2, SampleInterface3 {

	@Override
	public void method1() {

	}

	@Override
	public void method2() {

	}

	@Override
	public void method3() {

	}

	@Override
	public void method4() {

	}

	@Override
	public void method5() {

	}

	@Override
	void abstractMethod() {
		
	}

}

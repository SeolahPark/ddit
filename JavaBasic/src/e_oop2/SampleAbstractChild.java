package e_oop2;

class SampleAbstractChild extends SampleAbstractParent{
	// 추상메소드가 있는 클래스를 상속 받은 경우, 반드시 추상메소드를 구현해야함.

	@Override //-> SampleAbstractParent에 있는 메소드를 반드시 재정의함.
	void abstractMethod() {
		System.out.println("야옹");
	}
	
}
class SampleAb extends SampleAbstractParent{
	// 추상메소드가 있는 클래스를 상속 받은 경우, 반드시 추상메소드를 구현해야함.

	@Override //-> SampleAbstractParent에 있는 메소드를 반드시 재정의함.
	void abstractMethod() {
		System.out.println("멍멍");
	}
	
}

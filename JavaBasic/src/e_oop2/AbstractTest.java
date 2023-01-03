package e_oop2;

public class AbstractTest {

	public static void main(String[] args) {
		SampleAbstractParent sap1 = new SampleAbstractChild();
		SampleAbstractParent sap2 = new SampleAb();
		
		sap1.abstractMethod();
		sap2.abstractMethod();
		// 추상메소드는 밖에서 사용할 수 있는 인터페이스를 미리 만들어놓은것.
		// 추상메소드를 가진 부모를 상속받은 자식은 해당 메소드를 다 사용할 수 있다.
		
		// SampleAbstractParent 객체를 만들고, 추상메소드를 만들면 다른 자식들이 각자의 기능에 맞게 재정의해서 사용할 수 있음.
		
	}

}

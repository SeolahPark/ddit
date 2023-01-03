package e_oop;

//
// * JVM (Java Virtual Machine)
// - 자바로 만들어진 프로그램이 실행되는 컴퓨터 안의 가상 컴퓨터
// - 운영체제 -> JVM -> 자바 프로그램
// - 장점 : 운영체제와 상관없이 실행할 수 있다.
// - 단점 : 속도가 비교적 느리다.
//
// * JVM 메모리 구조
// - Method Area (메서드 영역) : 클래스 멤버가 저장된다.
// - Call Stack(호출 스택) : 현재 호출되어있는 메서드가 저장된다. //LILO
// - Heap (힙) : 객체가 저장된다.
//
public class JVM {
	int instanceVar;
	static int classVar;

	public void instanceMethod() {
		System.out.println(instanceVar);
		System.out.println(classVar);
	}

	public static void classMethod() {
//		System.out.println(instanceVar); //-> Static이 아님
		System.out.println(classVar);
	}

	public static void main(String[] args) {
		// 실행
		// 1. 프로그램 실행시 main(), classVar, classMethod()가 Method Area에 저장됨.
		// 2. main()이 호출되어 Call Stack에 저장됨.

		System.out.println(classVar);
		// 3. System클래스의 out이 Method Area에 저장됨.
		// 4. println()이 호출되어 Call Stack에 저장됨.
		// 5. println()이 classVar를 출력 후 Call Stack에서 제거됨.

		classMethod();
		// 6. classMethod()가 호출되어 Call Stack에 저장됨.
		// 7. instanceVar는 메모리에 존재하지 않기때문에 사용할 수 없음.
		// 8. println()이 호출되어 Call Stack에 저장됨.
		// 9. println()이 classVar를 출력 후 Call Stack에서 제거됨.
		// 10. classMethod()의 실행이 종료되어 Call Stack에서 제거됨.

		JVM jvm = new JVM();
		// 11. JVM객체가 Heap에 저장됨.
		// 12. jvm 변수가 Call Stack에 생성되고, JVM객체의 주소가 저장됨.

		System.out.println(jvm.instanceVar);
		// 13. println()이 호출되어 Call Stack에 저장됨.
		// 14. println()이 instanceVar를 출력 후 Call Stack에서 제거됨.

		jvm.instanceMethod();
		// 15. instanceMethod()가 호출되어 Call Stack에 저장됨.
		// 16. println()이 호출되어 Call Stack에 저장됨.
		// 17. println()이 instanceVar를 출력 후 Call Stack에서 제거됨.
		// 18. println()이 호출되어 Call Stack에 저장됨.
		// 19. println()이 classVar를 출력 후 Call Stack에서 제거됨.
		// 20. instanceMethod()의 실행이 종료되어 Call Stack에서 제거됨.

		jvm = null;
		// 21. jvm 변수에 null이 저장됨
		// 22. 어디에서도 주소를 참조하지 않는 JVM 객체는 GarbageCollector에 의해 삭제됨

		// 23. main()의 실행이 종료되어 CallStack에서 제거됨
		// 24. 프로그램이 종료되고 Method Area 데이터가 삭제됨

	}

}

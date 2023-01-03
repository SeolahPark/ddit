package f_exception;

import java.util.concurrent.TimeUnit;

public class ThrowsException {
	//
	// * 메서드에 예외 선언하기 *
	// - 메서드 호출 시 발생할 수 있는 예외를 선언해줄 수 있다.
	// - 반환타입 method() throws Exception {}
	// - 메서드의 구현부 끝에 throws 예약어와 예외 클래스명으로 예외를 선언할 수 있다.
	// - 에외를 선언하면 에외처리를 하지 않고 자식을 호출한 메서드로 에외처리를 미룬다.
	//
	public static void main(String[] args) {
		new ThrowsException().methodA();
		new ThrowsException().methodB();
		System.out.println("check");
	}

	private void methodA() { // 에러 처리하는 방법을 다르게 두고싶을 때 사용
		try {
			test();
		} catch (InterruptedException e) {
//			System.out.println("methodA 에러처리!");
		}

	}

	private void methodB() { // 에러 처리하는 방법을 다르게 두고싶을 때 사용
		try {
			test();
		} catch (InterruptedException e) {
//			System.out.println("methodB Exception!");
		}
	}

	private void test() throws InterruptedException {
		// 메서드를 호출한 곳이 여러경우일 때, 각각 예외처리 방법은 나를 호출한 곳에서 정해라. (미루기)
		TimeUnit.SECONDS.sleep(1); // -> 오류를 잡아줬어야했는데
		InterruptedException ie = new InterruptedException();
		throw ie;
	}
}

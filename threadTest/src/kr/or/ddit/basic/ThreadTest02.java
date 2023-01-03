package kr.or.ddit.basic;

public class ThreadTest02 {
	public static void main(String[] args) {
		// 멀티 쓰레드 프로그램
		// Thread를 사용하는 방법
		
		// 방법1 : Thread클래스를 상속
		// 상속한 class를 작성한 후, 인스턴스를 생성하여 인스턴스 내 start() 메서드를 호출해서 실행한다.
		MyThread1 th1 = new MyThread1();
		th1.start(); //-> 멀티 쓰레드로 사용하는거임
//		th1.run(); //-> 싱글 쓰레드로 사용하는거임
		
		
		// 방법2 : Runable 인터페이스를 구현
		// 구현한 class를 작성한 후, 인스턴스를 생성하여 Thread객체를 생성할 때 생성자의 인수값으로 넣어준다.
		// 이 떄 생성된 Thread객체의 인스턴스의 start()메서드를 호출해서 실행한다.
		MyThread2 r = new MyThread2();
		Thread th2 = new Thread(r);
		th2.start(); //-> 멀티 쓰레드로 사용하는거임
//		th2.run(); //-> 싱글 쓰레드로 사용하는거임
		
		// 방법2-1 : 익명구현체를 이용하는 방법 -> 하나밖에 못만든다.
		// 인터페이스는 메서드의 시그니처만 있어서 객체생성이 안된다. 따라서 재정의도 같이 해야한다.
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 200; i++) {
					System.out.print("@");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
					}
				}
			}
		};

		Thread th3 = new Thread(r2);
		th3.start(); //-> 멀티 쓰레드로 사용하는거임
		
		System.out.print("메인메서드 끝");
	}
}

// 방법1 : Thread클래스를 상속한 class를 작성한 후, 인스턴스를 생성하여 인스턴스 내 start() 메서드를 호출해서 실행한다.
class MyThread1 extends Thread {
	// 쓰레드에 처리할 내용은 run()메서드를 재정의해서 작성한다.
	@Override
	public void run() {
		// 이 run() 메서드에서 작성한 명령이 쓰레드가 처리할 명령이 된다.
		// 이 run() 메서드의 실행이 끝나면 해당 쓰레드도 종료가 된다.
		for (int i = 1; i <= 200; i++) {
			System.out.print("*");
			try {
				// Thread.sleep(시간) ==> 주어진 '시간'동안 작업을 잠시 멈춘다. '시간'은 밀리세컨드 단위를 사용한다.
				Thread.sleep(100);
			} catch (InterruptedException e) {	}
		}
		System.out.println("1 끝");
	}
}

class MyThread2 implements Runnable { //-> 여러개 만들 수 있다
	// 쓰레드에 처리할 내용은 run()메서드를 재정의해서 작성한다.
	@Override
	public void run() {
		for (int i = 1; i <= 200; i++) {
			System.out.print("$");
			try {
				// Thread.sleep(시간) ==> 주어진 '시간'동안 작업을 잠시 멈춘다. '시간'은 밀리세컨드 단위를 사용한다.
				Thread.sleep(100);
			} catch (InterruptedException e) {	}
		}
		System.out.println("2 끝");
	}
}
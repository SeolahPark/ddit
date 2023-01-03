package kr.or.ddit.basic;

import javax.swing.JOptionPane;

public class ThreadTest06 {
	public static void main(String[] args) {
		// 사용자로부터 데이터 입력 받기
		CountThread ct = new CountThread();
		InputThread it = new InputThread();
		
		ct.start();
		it.start();
	}
}

class CountThread extends Thread {
	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			if (InputThread.check) {
//				this.stop(); 
				return; // run()메서드가 종료되면 쓰레드도 종료된다.
			}
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
		System.out.println("10초가 지났습니다. 프로그램을 종료합니다.");
		System.exit(0);
	}
}

class InputThread extends Thread {
	// 입력 여부를 확인하기 위한 변수 선언 => 스레드에서 공통으로 사용할 변수
	public static boolean check = false;

	@Override
	public void run() {
		String str = JOptionPane.showInputDialog("입력하세요 : ");
		check = true;
		System.out.println("입력값 : " + str);
	}
}
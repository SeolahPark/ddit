package kr.or.ddit.basic;

import java.util.Random;

import javax.swing.JOptionPane;

// 
// 컴퓨터와 가위바위보를 진행하는 프로그램을 작성하시오.
// 컴퓨터의 가위바위보는 난수를 이용해서 구하고
// 사용자의 입력은 showInputDialog() 메서드를 이용해서 입력 받는다.
// 입력 시간은 5초, 초과하면 사용자가 진 것으로 처리하고
// 5초안에 입력이 완료되면 컴퓨터와 승패를 구해서 결과를 출력한다.
// 
public class ThreadTest07 {
	public static void main(String[] args) {
		while (true) {
			UserInput.checked = false;

			TimeThread timethread = new TimeThread();
			Thread userthread = new Thread(new UserInput());
			Thread comthread = new Thread(new ComInput());

			timethread.start(); // -> 죽으면 안살아나요
			comthread.start();
			userthread.start();

			try {
				timethread.join();
				comthread.join();
				userthread.join();
			} catch (InterruptedException e) {

			}
		}
	}
}

class TimeThread extends Thread {
	@Override
	public void run() {
		for (int i = 5; i > 0; i--) {
			if (UserInput.checked) {
				return;
			}
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.out.println("----------------- 결 과 -----------------");
		System.out.println("시간초과로 당신이 졌습니다.");
		System.exit(0);
	}
}

class ComInput implements Runnable {
	Random rnd = new Random();
	public static String comstr = "";

	@Override
	public void run() {
		int num = rnd.nextInt(3);
		if (num == 0)
			comstr = "가위";
		else if (num == 1)
			comstr = "바위";
		else
			comstr = "보";
	}
}

class UserInput implements Runnable {
	public static boolean checked = false;
	public static String userstr = "";

	@Override
	public void run() {
		userstr = JOptionPane.showInputDialog("입력하세요 : ");
		checked = true;

		System.out.println("----------------- 결 과 -----------------");
		System.out.println("컴퓨터 : " + ComInput.comstr);
		System.out.println("사용자 : " + UserInput.userstr);
		switch (UserInput.userstr) {
		case "가위":
			if (ComInput.comstr.equals("가위"))
				System.out.println("결  과 : 비겼습니다.");
			else if (ComInput.comstr.equals("바위"))
				System.out.println("결  과 : 당신이 졌습니다.");
			else
				System.out.println("결  과 : 당신이 이겼습니다.");
			break;
		case "바위":
			if (ComInput.comstr.equals("가위"))
				System.out.println("결  과 : 당신이 이겼습니다.");
			else if (ComInput.comstr.equals("바위"))
				System.out.println("결  과 : 비겼습니다.");
			else
				System.out.println("결  과 : 당신이 졌습니다.");
			break;
		case "보":
			if (ComInput.comstr.equals("가위"))
				System.out.println("결  과 : 당신이 졌습니다.");
			else if (ComInput.comstr.equals("바위"))
				System.out.println("결  과 : 당신이 이겼습니다.");
			else
				System.out.println("결  과 : 비겼습니다.");
			break;
		}
	}
}

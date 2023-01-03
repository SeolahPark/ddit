package kr.or.ddit.basic;

import javax.swing.JOptionPane;

public class ThreadTest05 {
	public static void main(String[] args) {
		// 사용자로부터 데이터 입력 받기
		
		String str = JOptionPane.showInputDialog("입력하세요 : ");
		System.out.println("입력값 : " + str);
	}
}


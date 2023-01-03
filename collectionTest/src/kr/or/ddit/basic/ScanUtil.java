package kr.or.ddit.basic;


import java.util.Scanner;

// nextLine 과 Integer.parseInt(nextLine) 을 쉽게 사용하는 메서드 제작
public class ScanUtil {
	private static Scanner sc = new Scanner(System.in);

	public static String nextLine() {
		return sc.nextLine();
	}

	public static int nextInt() {
		int input = 0;
		while (true) {
			try {
				input = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.print("숫자를 입력해주세요. >> ");
			}
		}
		return input;
	}

	public static Double nextDouble() {
		double input = 0;
		while (true) {
			try {
				input = Double.parseDouble(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.print("숫자를 입력해주세요. >> ");
			}
		}
		return input;
	}
}
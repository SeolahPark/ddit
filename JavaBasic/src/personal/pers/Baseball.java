package personal.pers;

import java.util.Random;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		int num[] = new int[3];
		int inputNum[] = new int[3];
		int first=0;

		Random rnd = new Random();
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < num.length; i++) {
			num[i] = rnd.nextInt();
			if (num[i] < 0)
				num[i] *= -1; // 음수 방지!
			num[i] %= 10;

			int j;
			for (j = 0; j < i; j++)
				if (num[i] == num[j])
					break;
			if (i != j)
				i--; // 중복 숫자 방지!
		}
		System.out.printf("%d %d %d \n", num[0], num[1], num[2]);
		// 컴퓨터에서 정상적으로 출력 개발자가 확인하는 부분 , 게임 시작 시 이 부분은 주석 처리!

		
		
		while (true) {
			System.out.printf("세 자리 숫자를 입력하세요 :");
			first = input.nextInt();
			inputNum[0] = first / 100;
			inputNum[1] = (first / 10) % 10;
			inputNum[2] = first % 10;

			int s = 0, b = 0;
			for (int i = 0; i < num.length ; i++) {
				for (int j = 0; j < num.length ; j++) {
					if (num[i] == inputNum[j]) {
						if (i == j)
							s++; // 자릿수 같으면 증가
						else
							b++; // 숫자 같으면 증가
					}
				}
			}
			System.out.printf("Strike : %d \t Ball : %d \n", s, b);
			if (s == 3)
				break;
		}
		System.out.printf("정답!! \n야구게임 프로그램 종료!");
		input.close();

	}

}

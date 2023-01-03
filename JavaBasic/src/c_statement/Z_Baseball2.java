package c_statement;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Z_Baseball2 {

	/*
	 * 세 자리 랜덤한 숫자를 맞추는 게임을 만들어보자. 세 자리 숫자는 다음과 같은 규칙을 갖는다. 
	 * 1. 중복되는 숫자가 없음(예: 133x 333x 123o ... ) 
	 * 2. 0이 없다. (예: 012x 907x 405x...)
	 * 
	 * 랜덤으로 만들어진 숫자를 저장해두고 사용자에게 세 자리 숫자를 입력받아 다음과 같이 표기한다.
	 * 
	 * 1. 같은 숫자이면서 위치가 같을 경우 S 
	 * 2. 같은 숫자이면서 위치가 다를 경우 B 
	 * 3. 숫자가 없는 경우 O
	 * 
	 * 맞는 숫자를 입력할때까지 계속한다.
	 * 
	 * 출력 예시 : ... 
	 * 세 자리 숫자 입력 >> 571 
	 * 6차 시도(571) : 2S 0B 1O
	 * ------------------------------ 
	 * 세 자리 숫자 입력 >> 671 
	 * 7차 시도(671) : 3S 0B 0O
	 * ------------------------------ 
	 * 정답입니다!!
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rnd = new Random();

		int[] randomNum = new int[3];
		int[] inputNum = new int[3];
		int count = 0, first=0;
		int S = 0, B = 0, O = 0;

		for (int i = 0; i < randomNum.length; i++) { // 랜덤숫자 생성
			for(int j = 0 ; j < i; j++) {
				do {
					randomNum[i] = rnd.nextInt(9) + 1;
				} while (randomNum[i] == randomNum[j]); //범위오류. 당연함. +1만큼 커지면 생성한 배열보다 커짐.
			}
		} 

		System.out.println(Arrays.toString(randomNum));


		do {
			S = 0;
			B = 0;
			O = 0;

			System.out.print("세 자리 숫자 입력 >> ");
			first = input.nextInt();
			inputNum[0] = first / 100;
			inputNum[1] = (first / 10) % 10;
			inputNum[2] = first % 10;
			count++;
			// 사용자로부터 숫자 입력

			for(int i = 0 ; i < randomNum.length ; i++) {
				for(int j = randomNum.length-1 ; j > i ; j--) {
					if (randomNum[i] == inputNum[j])
						S++;
					else if (randomNum[i] == inputNum[j+1])
						B++;
					else
						O++;
				}
				
			}

			System.out.printf("%d차 시도(%d%d%d) : %dS %dB %dO\n-----------------\n", 
					count, inputNum[1], inputNum[2], inputNum[3], S, B, O);

			if (S == 3)
				System.out.print("정답입니다!");

		} while (S != 3);

		input.close();

	}

}

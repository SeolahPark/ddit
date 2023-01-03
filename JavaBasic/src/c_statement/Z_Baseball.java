package c_statement;

import java.util.Random;
import java.util.Scanner;

public class Z_Baseball {

	/*
	 * 세 자리 랜덤한 숫자를 맞추는 게임을 만들어보자. 세 자리 숫자는 다음과 같은 규칙을 갖는다. 1. 중복되는 숫자가 없음(예: 133x
	 * 333x 123o ... ) 2. 0이 없다. (예: 012x 907x 405x...)
	 * 
	 * 랜덤으로 만들어진 숫자를 저장해두고 사용자에게 세 자리 숫자를 입력받아 다음과 같이 표기한다.
	 * 
	 * 1. 같은 숫자이면서 위치가 같을 경우 S 2. 같은 숫자이면서 위치가 다를 경우 B 3. 숫자가 없는 경우 O
	 * 
	 * 맞는 숫자를 입력할때까지 계속한다.
	 * 
	 * 출력 예시 : ... 세 자리 숫자 입력 >> 571 6차 시도(571) : 2S 0B 1O
	 * ------------------------------ 
	 * 세 자리 숫자 입력 >> 671 
	 * 7차 시도(671) : 3S 0B 0O
	 * ------------------------------ 정답입니다!!
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rnd = new Random();
		int randomNum1 = 0, randomNum2 = 0, randomNum3 = 0;
		int inputNum=0, inputNum1 = 0, inputNum2 = 0, inputNum3 = 0;
		int S = 0, B = 0, O = 0;
		int count = 0, total=0;

		randomNum1 = rnd.nextInt(9) + 1;
		do {
			randomNum2 = rnd.nextInt(9) + 1;
		}while(randomNum1==randomNum2);
		do {
			randomNum3 = rnd.nextInt(9) + 1;
		}while(randomNum1==randomNum3 || randomNum2==randomNum3);
		// 중복되는 숫자가 없음. 0이 없음.

		System.out.println("정답 : " + randomNum1 + randomNum2 + randomNum3);
		total = randomNum1*100 + randomNum2*10 + randomNum3;
		
		do {
			S = 0;
			B = 0;
			O = 0;

			System.out.print("세 자리 숫자 입력 >> ");
			inputNum = input.nextInt();
			inputNum1 = inputNum / 100;
			inputNum2 = (inputNum / 10) % 10;
			inputNum3 = inputNum % 10;
			count++;

			if (randomNum1 == inputNum1)
				S++;
			else if (randomNum1 == inputNum2 || randomNum1 == inputNum3)
				B++;
			else
				O++;

			if (randomNum2 == inputNum2)
				S++;
			else if (randomNum2 == inputNum3 || randomNum2 == inputNum1)
				B++;
			else
				O++;

			if (randomNum3 == inputNum3)
				S++;
			else if (randomNum3 == inputNum1 || randomNum3 == inputNum2)
				B++;
			else
				O++;

			System.out.printf("%d차 시도(%d%d%d) : %dS %dB %dO\n-----------------\n", count, inputNum1, inputNum2, inputNum3, S, B, O);
			
			if (S==3)
				System.out.print("정답입니다!");
			
			if(inputNum1 == inputNum2 || inputNum1 == inputNum3 || inputNum2 == inputNum3)
				System.out.println("중복되지 않는 숫자를 입력해주세요.");

		} while (total != inputNum);

		input.close();

	}

}

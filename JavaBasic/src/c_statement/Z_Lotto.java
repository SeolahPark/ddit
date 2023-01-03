package c_statement;

import java.util.Random;

public class Z_Lotto {

	// 임의의 로또 번호 6자리를 생성하고 (중복번호 없음, 1~45번) ==> 1등번호
	// 1등이 나올 때까지 랜덤한 6자리를 생성하여 얼마를 써야 1등이 되는지 알려주세요.
	// 1회 1,000원
	public static void main(String[] args) {
		Random rnd = new Random();

		int rndNum1 = 0, rndNum2 = 0, rndNum3 = 0, rndNum4 = 0, rndNum5 = 0, rndNum6 = 0;
		int _rndNum1 = 0, _rndNum2 = 0, _rndNum3 = 0, _rndNum4 = 0, _rndNum5 = 0, _rndNum6 = 0;
		int money = 1000, count = 0, num = 0;

		// 1등번호 배정
		rndNum1 = rnd.nextInt(45) + 1;
		do {
			rndNum2 = rnd.nextInt(45) + 1;
		} while (rndNum1 == rndNum2);
		do {
			rndNum3 = rnd.nextInt(45) + 1;
		} while (rndNum3 == rndNum1 || rndNum3 == rndNum2);
		do {
			rndNum4 = rnd.nextInt(45) + 1;
		} while (rndNum4 == rndNum1 || rndNum4 == rndNum2 || rndNum4 == rndNum3);
		do {
			rndNum5 = rnd.nextInt(45) + 1;
		} while (rndNum5 == rndNum1 || rndNum5 == rndNum2 || rndNum5 == rndNum3 || rndNum5 == rndNum4);
		do {
			rndNum6 = rnd.nextInt(45) + 1;
		} while (rndNum6 == rndNum1 || rndNum6 == rndNum2 || rndNum6 == rndNum3 || rndNum6 == rndNum4
				|| rndNum6 == rndNum5);

		System.out.printf("로또번호 : %d, %d, %d, %d, %d, %d\n\n", rndNum1, rndNum2, rndNum3, rndNum4, rndNum5, rndNum6);

		// 숫자찾기 시작
		do {
			num = 0;

			System.out.printf("대응숫자 : %d, %d, %d, %d, %d, %d\n\n", _rndNum1, _rndNum2, _rndNum3, _rndNum4, _rndNum5,
					_rndNum6);

			if (rndNum1 == _rndNum1 || rndNum1 == _rndNum2 || rndNum1 == _rndNum3 || rndNum1 == _rndNum4
					|| rndNum1 == _rndNum5 || rndNum1 == _rndNum6) {
				num++;
			} else {
				_rndNum1 = rnd.nextInt(45) + 1;
			}
			if (rndNum2 == _rndNum1 || rndNum2 == _rndNum2 || rndNum2 == _rndNum3 || rndNum2 == _rndNum4
					|| rndNum2 == _rndNum5 || rndNum2 == _rndNum6) {
				num++;
			} else {
				do {
					_rndNum2 = rnd.nextInt(45) + 1;
				} while (_rndNum2 == _rndNum1);
			}
			if (rndNum3 == _rndNum1 || rndNum3 == _rndNum2 || rndNum3 == _rndNum3 || rndNum3 == _rndNum4
					|| rndNum3 == _rndNum5 || rndNum3 == _rndNum6) {
				num++;
			} else {
				do {
					_rndNum3 = rnd.nextInt(45) + 1;
				} while (_rndNum3 == _rndNum1 || _rndNum3 == _rndNum2);
			}
			if (rndNum4 == _rndNum1 || rndNum4 == _rndNum2 || rndNum4 == _rndNum3 || rndNum4 == _rndNum4
					|| rndNum4 == _rndNum5 || rndNum4 == _rndNum6) {
				num++;
			} else {
				do {
					_rndNum4 = rnd.nextInt(45) + 1;
				} while (_rndNum4 == _rndNum1 || _rndNum4 == _rndNum2 || _rndNum4 == _rndNum3);

			}
			if (rndNum5 == _rndNum1 || rndNum5 == _rndNum2 || rndNum5 == _rndNum3 || rndNum5 == _rndNum4
					|| rndNum5 == _rndNum5 || rndNum5 == _rndNum6) {
				num++;
			} else {
				do {
					_rndNum5 = rnd.nextInt(45) + 1;
				} while (_rndNum5 == _rndNum1 || _rndNum5 == _rndNum2 || _rndNum5 == _rndNum3 || _rndNum5 == _rndNum4);
			}
			if (rndNum6 == _rndNum1 || rndNum6 == _rndNum2 || rndNum6 == _rndNum3 || rndNum6 == _rndNum4
					|| rndNum6 == _rndNum5 || rndNum6 == _rndNum6) {
				num++;
			} else {
				do {
					_rndNum6 = rnd.nextInt(45) + 1;
				} while (_rndNum6 == _rndNum1 || _rndNum6 == _rndNum2 || _rndNum6 == _rndNum3 || _rndNum6 == _rndNum4
						|| _rndNum6 == _rndNum5);
			}

			count++;

			System.out.println("동일한 숫자 개수" + num + "");
			System.out.println("반복횟수 : " + count);
		} while (num != 6);

		System.out.printf("\n총 사용한 금액 : %d", money * count);

	}

}

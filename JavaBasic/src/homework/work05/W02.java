package homework.work05;

import java.util.Arrays;
import java.util.Random;
//로또번호를 생성하는 프로그램을 작성하시오. 
//(로또 번호는 1 ~ 45번까지 있으며 이 중에서 중복되지 않는 6개의 숫자를 추출하여 결과를 출력한다.)

public class W02 {

	public static void main(String[] args) {
		Random rnd = new Random();

//		//방법1
//		int[] rndNum = new int[6];
//		rndNum[0] = rnd.nextInt(45) + 1;
//		for (int i = 0; i < rndNum.length; i++) {
//			for (int j = 1; j < rndNum.length; j++) {
//				do {
//					// 중복검사가 안됨.
//					rndNum[j] = rnd.nextInt(45) + 1; 
//				} while (rndNum[j] == rndNum[j - 1]);
//			}
//		}
//		System.out.println(Arrays.toString(rndNum));

//		// 방법2
//		int[] pool = new int[45];
//		for (int i = 0; i < pool.length; i++) {
//			pool[i] = i + 1;
//		}
//		int[] lotto = new int[6];
//		for (int i = 0; i < lotto.length; i++) {
//			//중복된 숫자가 나올 수 있음.
//			lotto[i] = pool[rnd.nextInt(45) + 1]; 
//		}
//		System.out.println(Arrays.toString(lotto));

		// 방법3
		int[] pool = new int[45];
		for (int i = 0; i < pool.length; i++) {
			pool[i] = i + 1;
		}
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			int num = 0;
			int idx = 0;
			while (num == 0) {
				// 값을 가져오는게 아니라 자리수를 가져오는거임
				idx = rnd.nextInt(pool.length); 
				num = pool[idx];
			}
			pool[idx] = 0;
			lotto[i] = num;
		}
		System.out.println(Arrays.toString(lotto));

	}

}
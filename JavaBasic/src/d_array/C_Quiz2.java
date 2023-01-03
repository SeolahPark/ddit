package d_array;

import java.util.Arrays;
import java.util.Random;

public class C_Quiz2 {
	/* 문제2.
	 * 1~5의 숫자가 발생(10번)된 만큼 *을 사용해 그래프를 그려주세요.
	 * 
	 * 예시)
	 * 1 : *** 3
	 * 2 : **** 4
	 * 3 : ** 2
	 * 4 : ***** 5
	 * 5 : * 1
	 */

	public static void main(String[] args) {
		Random rnd = new Random();
		
		int[] count = new int[5]; // = int[] count = {0, 0, 0, 0, 0};
		
		for(int i = 0; i < 10; i++) {
			int num = rnd.nextInt(5); // (0~4)+1
			count[num]++;
		}
		for(int i = 0; i < count.length; i++) {
			System.out.print((i+1) + " : ");
			for(int j = 0; j < count[i]; j++) {
				System.out.print("*");
			}
			System.out.println(" "+count[i]);
		}

		System.out.println("--------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------");		
		

		
		
	}
	
}

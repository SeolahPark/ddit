package d_array;

import java.util.Arrays;
import java.util.Random;

public class C_Quiz {
	/* 문제1.
	 * 거스름돈 (1000 ~ 5000원)이 동전의 단위마다 몇 개의 동전이 필요한지 출력해주세요.
	 * 단, 동전의 종류를 배열로 관리.
	 * 예시)
	 * 거스름돈 : 2860원
	 * 500원 : 5개
	 * 100원 : 3개
	 * 50원 : 1개
	 * 10원 : 3개 */

	public static void main(String[] args) {
		Random rnd = new Random();
		
		int change = (rnd.nextInt(400)+100) *10;
		int[] coin = {500, 100, 50, 10};
		int change_copy = change;
		int[] count = {0, 0, 0, 0};
		
//		/* 방법1. 풀어쓴 방법 */ 
//		count[0] = change_copy / coin[0]; //2860 / 500 =>  몫이 count[0]에 들어감 = 5
//		change_copy %= coin[0]; //2860 % 500 =>  나머지가 count[0]에 들어감 = 360원
//		System.out.println(coin[0] +"원 : " + count[0] +"개" );
//		count[1] = change_copy / coin[1]; //360 / 100 => 몫이 count[1]에 들어감 = 3
//		change_copy %= coin[1]; //360 % 100 = 나머지가 count[1]에 들어감 = 60원
//		System.out.println(coin[1] +"원 : " + count[1] +"개" );
//		count[2] = change_copy / coin[2];
//		change_copy %= coin[2];
//		System.out.println(coin[2] +"원 : " + count[2] +"개" );
//		count[3] = change_copy / coin[3];
//		change_copy %= coin[3];
//		System.out.println(coin[3] +"원 : " + count[3] +"개" );
	
		/* 방법2. 반복문 사용 */
		change_copy = change;
		System.out.print("거스름돈 : " + change_copy + "원\n");
		count = new int[] {0, 0, 0, 0};
		
		for(int i=0; i<coin.length; i++) {
			count[i] = change_copy / coin[i];
			System.out.println(coin[i] +"원 : " + count[i] +"개" );
			change_copy %= coin[i]; 
		}
		
	}
	
}

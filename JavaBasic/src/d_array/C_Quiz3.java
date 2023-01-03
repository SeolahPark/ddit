package d_array;

import java.util.Arrays;
import java.util.Random;

public class C_Quiz3 {
	/* 문제3.
	 * 1~10 사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요.
	 * (key. 중복검사->이중for문, 배열길이->새로운 배열 생성)
	 * 
	 * 예시)
	 * {5,8,8,4,1,4,8,2,5} => {5,8,4,1,2}
	 */

	public static void main(String[] args) {
		Random rnd = new Random();
		int[] pool = new int[10];
		for(int i = 0; i < pool.length; i++) {
			pool[i] = rnd.nextInt(10);
		}
		System.out.println(Arrays.toString(pool));
		
		int[] a = new int[] {pool[0]};
		
		for(int i=0; i < pool.length; i++) {
			int pick = pool[i];
			boolean duple = false; //중복판별
			
			//중복이 있는지만 확인,
			for(int j=0; j<a.length; j++) { 
				if(pick == a[j]) duple = true; //증복이 있으면 duple = true 
				//else duple = false; //else는 추가X.
			}
			
			if(!duple) { // == 'if(duple == false)' == 'if(true)' == 중복이 없다면.
				int[] b = new int[a.length+1]; //임시변수 int tmp
				// 배열 a보다 길이가 1 큰 임시 배열 b를 만듬.
				
				// 배열 a에 있는 값을 배열 b에 복사.
				for(int j = 0; j < a.length; j++) { 
					b[j] = a[j];					
				}
				// 중복이 아닌 숫자 pick을 b 배열 끝에 넣어줌.
				b[b.length-1] = pick; 
				// 배열 a를 배열 b로 주소값 변경함. 따라서 a의 길이가 +1씩 늘어남.
				a = b; 
			}
		}
		System.out.println(Arrays.toString(a));
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------");		
		

		
		
	}
	
}

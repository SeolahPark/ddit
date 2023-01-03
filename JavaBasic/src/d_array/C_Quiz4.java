package d_array;

import java.util.Arrays;
import java.util.Random;

public class C_Quiz4 {
	/*
	 * 문제4. 
	 * 1~100 까지의 랜덤한 숫자 100개를 갖는 배열을 만들고 
	 * 2~5 사이의 랜덤한 수로 나누어 떨어지는 숫자로만 이루어진 배열을 정렬하여 출력해주세요.
	 * 옵션 1 : 중복제거
	 * 옵션 2 : 오름차순 정렬
	 * 
	 * 예시) 
	 * {1,57,84,38,15,10,57,68,48,13,...}
	 * tarket = 5
	 * {5, 10, 20, 80}
	 */

	public static void main(String[] args) {
		Random rnd = new Random();
		
//		int[] pool = new int[100];
//		int target = rnd.nextInt(4)+2;
//		for(int i=0; i<pool.length; i++) {
//			pool[i] = rnd.nextInt(100)+1;
//		}
//		System.out.println("target : " + target);
//		System.out.println("\n정렬 전\n" + Arrays.toString(pool));
//		
//		int[] a = new int[] {pool[0]};
//		
//		//랜덤한 수로 나누어 떨어지는 숫자
//		for(int i=0; i<pool.length; i++) {
//			int pick = pool[i];
//			boolean duple = false; // int count = 0;
//			
//			// 중복되는 숫자 및 나누어 떨어지는 숫자 검증
//			for(int j=0; j<a.length; j++) {
//				if((pick % target) != 0) 
//					duple = true; // c++;
//				if(pick == a[j]) 
//					duple = true; // c++;
//			}
//			
//			// 조건에 맞는 숫자들을 크기가 +1인 새로운 배열에 복사
//			if(!duple) { // if(c == 0){
//				int[] b=new int[a.length+1]; 
//				for(int j=0; j<a.length; j++) {
//					b[j] = a[j];					
//				}
//				b[b.length-1] = pick; 
//				a = b; 
//			}
//		}
//		
//		// 새로운 a배열 오름차순 정렬
//		for (int i=0; i<a.length; i++) {
//			for (int j=0; j<a.length - 1; j++) {
//				if (a[j] > a[j+1]) {
//					int temp = a[j];
//					a[j] = a[j+1];
//					a[j+1] = temp;
//				}
//			}
//		}
//		System.out.println("\n정렬 후\n" + Arrays.toString(a));
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------");		
		
		int[] pool = new int[100];
//		int target = rnd.nextInt(4)+2; // target 범위 숫자 지정
		int target = 5; // target 범위 숫자 지정
		for(int i = 0; i < pool.length; i++) {
			pool[i] = rnd.nextInt(100)+1;
		}
		System.out.println("target : " + target);
		System.out.println("\n정렬 전\n" + Arrays.toString(pool));
		
		
		// 원본 배열의 모든 값이 들어갈 수 있는 크기의 배열을 선언함
		int[] a = new int[100];
		
		
		//값이 들어가야 할 배열의 인덱스 번호
		int c = 0;
		
		
		// pool의 모든 값을 반복문 실행함
		for(int i=0; i<pool.length; i++) {
			// pool의 이번 값(pool[i])이 타겟의 배수라면
			if(pool[i] % target == 0) {
				// 배열 a의 c위치에 pool[i]값을 넣어주고 c를 1 증가시킴
				a[c++] = pool[i]; // if) ++c를 쓰고싶으면 초기값을 0이 아닌 -1로
			}
		}
		
		
		// 결과로 보여줄 배열 result를 만들고 길이는 c로 지정 => 배열 a에 값이 몇개 들어있는지 나타냄.
		int[] result = new int[c];
		
		
		// 배열 a의 값을 배열 result에 복사함. => c만큼만 반복해서 실제로 값이 들어있는 곳만 복사함.
		for(int i=0; i<result.length; i++) {
				result[i] = a[i];
		}
		
		/*------------- 쌤 풀이 -------------*/
//		// 방법 1
//		a = new int[] {result[0]};
//		
//		for(int i=0; i<result.length; i++) {
//			int test = 0; // 0이면 중복 아님, 1이면 중복임
//			int pick = result[i];
//			for(int j=0; j<a.length; j++) {
//				if(pick == a[j]) test=1;
//			}
//			if(test==0) {
//				int[] b = new int[a.length+1]; // b={0,0}, a={10}
//				for(int j=0; j<a.length; j++) {
//					b[j] = a[j];					
//				}
//				// b={10,0}, a={10}, pick=20
//				b[b.length-1]=pick;
//				// b={10,20}, a={10}, pick=20
//				a=b;
//				// b={10,0}, a={10,20}, pick=20
//				System.out.println("\n중간과정\n" + Arrays.toString(a));
//			}
//		}
//		
//		for (int i=0; i<a.length; i++) {
//			for (int j=0; j<a.length-1; j++) {
//				if (a[j] > a[j+1]) {
//					int temp = a[j];
//					a[j] = a[j+1];
//					a[j+1] = temp;
//				}
//			}
//		}System.out.println("\n정렬 후\n" + Arrays.toString(a));
		
		// 방법 2 -> 반복문 횟수가 적어서 효율적임
		a = new int[result.length]; // {0,0,0,0, ... , 0}
		c = 0; // count : a에 몇개의 값이 들어갔는지 체크
		
		for(int i=0; i<result.length; i++) {
			int pick = result[i];
			int test = 0;
			for(int j=0; j<c; j++) {
				if(a[j] == pick) test=1;
			}
			if(test==0) {
				a[c] = pick;
				c += 1;
			}
		}
		int[] b = new int[c];
		for(int i=0; i<c; i++) {
			b[i] = a[i];
		}
		a = b;
		
		//버블정렬
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a.length-1; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j]; 
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}System.out.println("\n정렬 후\n" + Arrays.toString(a));
		
		
//		/*------------- 내 풀이(=방법1) -------------*/ 
//		// 중복제거
//		int[] newArr = new int[] {result[0]}; // 길이가 1이고, 값이 result[0]인 새로운 배열 생성
//		
//		for(int i=0; i<result.length; i++) {
//			int pick = result[i];
//			boolean duple = false;
//
//			for(int j=0; j<newArr.length; j++) {
//				if(pick == newArr[j]) 
//					duple = true;
//			}	
//			if(!duple) {
//				int[] b = new int[newArr.length+1];  // 임시배열
//				for(int j=0; j<newArr.length; j++) {
//					b[j] = newArr[j];					
//				}
//				b[b.length-1] = pick; 
//				newArr = b; 
//			}
//		}
//		
//		// 오름차순 정리
//		for (int i=0; i<newArr.length; i++) {
//			for (int j=0; j<newArr.length-1; j++) {
//				if (newArr[j] > newArr[j+1]) {
//					int temp = newArr[j];
//					newArr[j] = newArr[j+1];
//					newArr[j+1] = temp;
//				}
//			}
//		}
//		System.out.println("\n정렬 후\n" + Arrays.toString(newArr));
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------");	
		
		
		
		
		
	}
	
}

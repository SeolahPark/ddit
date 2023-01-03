package d_array;

import java.util.Arrays;
import java.util.Random;

public class E_MultiDimensionalArray {
	// 다중차원배열(다차원배열)
	// - 배열 안에 배열이 저장되어있는 형태.

	public static void main(String[] args) {
		// 1차원 배열 => {0,0,0, ... ,0}
		int[] array1 = new int[10];

		// 2차원 배열 선언방식1=> {0,0,0, ... ,0},
		// {0,0,0, ... ,0},
		// {0,0,0, ... ,0}
		int[][] array2 = { new int[10], 
						   new int[10], 
						   new int[10] };

		// 3차원 배열 => 사용하지 않음.
		int[][][] array3 = { { new int[10], new int[10], new int[10] }, 
							 { new int[10], new int[10], new int[10] },
							 { new int[10], new int[10], new int[10] } };

		// 2차원 배열 선언방식2
		int[][] arr = new int[2][3];
		arr = new int[][] { { 1, 2 }, 
							{ 3, 4 }, 
							{ 5, 6 } };

		// 2차원 배열 선언방식3 => 보통 이렇게 선언하지 않음. 사용X
		int arr2[][] = new int[2][3];
		int[] _arr[] = new int[2][3];

		// 가변배열 => 참고만 하기. 잘 쓰지 않음.
		// int형으로 1차원배열을 선언하는 경우, 0으로 초기화를 해주기 위해서 크기가 지정되어야함.
		// 단, 2차원 배열은 참조형 변수로 들어가기 때문에 null로 초기화가 됨. 따라서 크기지정하지 않고도 선언 가능.
		int[][] arr3 = new int[3][];
		// ㄴ { null, null, null }
		arr3[0] = new int[1];
		// ㄴ { {0}, null, null }
		arr3[1] = new int[2];
		// ㄴ { {0}, {0,0}, null }
		arr3[2] = new int[3];
		// ㄴ { {0}, {0,0}, {0,0,0} }

		// 2차원 인덱스까지 접근해서 사용할 수 있다.
		System.out.println(arr3[1][1]);
		System.out.println(Arrays.toString(arr3[1]));

		arr3[1][1] = 10;
		System.out.println(Arrays.toString(arr3[1]));
		System.out.println(arr3.length);
		// ㄴ 2차원 배열에서 첫 번째 차원의 배열 길이
		System.out.println(arr3[1].length);
		// ㄴ 2차원 배열에서 두 번째 차원의 배열 길이

		System.out.println("-------------------------------------------------------------------------------");

//		for(int i=0; i<arr3.length; i++) {
//			for(int j=0; j<arr3[i].length; j++) {
//				System.out.println(arr3[i][j]);
//			}
//		}
//		System.out.println("-------------------------------------------------------------------------------");

//		int[][] score = new int[4][3]; // int[학생수][과목수]
//		int[] sum = new int[score.length];
//		double[] avg = new double[score.length];
//
//		for (int i = 0; i < score.length; i++) {
//			for (int j = 0; j < score[i].length; j++) {
//				score[i][j] = new Random().nextInt(101);
//			}
//			System.out.println(Arrays.toString(score[i]));
//		}
//		System.out.println("-------------------------------------------------------------------------------");

		// 문제
		// 각 학생의 점수 합계와 평균을 구하세요.
		
		int[][] score = new int[4][3]; // int[학생수][과목수]
		int[] sum = new int[score.length];
		double[] avg = new double[score.length];
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = new Random().nextInt(101);
				}
			}
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				sum[i] += score[i][j];//
			}
			avg[i] = (double)sum[i] / score[i].length;
			System.out.print(Arrays.toString(score[i]));
			System.out.printf(" " + (i+1)+"번. 합계 : %3d, 평균 : %2.2f\n", sum[i], avg[i]);
		}
		
		
		System.out.println("-------------------------------------------------------------------------------");
		
		
		
		
	}

}

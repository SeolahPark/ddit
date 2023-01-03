package d_array;

import java.util.Arrays;
import java.util.Random;

public class F_Scorebook {
//	김범수 나얼 박효신 이수 신용재 하현우 총 여섯명의 
//	국어 수학 영어 과학 코딩 점수를 각 0~100까지의 랜덤값으로 입력하고,
//	학생별 평균을 구하세요.
//	
//	-------------------원점수-------------------
//	학생명	국어	수학	영어	과학	코딩
//	김범수	 87		 68		 56		 87		 87
//	나얼	 87		 68		 56		 87		 87
//	박효신	 87		 68		 56		 87		 87
//	이수	 87		 68		 56		 87		 87
//	신용재	 87		 68		 56		 87		 87
//	하현우	 87		 68		 56		 87		 87
//	--------------------------------------------
//	-----------------평균점수---------------------------
//	학생명	국어	수학	영어	과학	코딩	평균
//	김범수	 87		 68		 56		 87		 87		 00
//	나얼	 87		 68		 56		 87		 87		 00
//	박효신	 87		 68		 56		 87		 87		 00
//	이수	 87		 68		 56		 87		 87		 00
//	신용재	 87		 68		 56		 87		 87		 00
//	하현우	 87		 68		 56		 87		 87		 00
//	----------------------------------------------------

	public static void main(String[] args) {
		Random rnd = new Random();
		String[] name = { "김범수", "나  얼", "박효신", "이  수", "신용재", "하현우" };
		String[] subjs = { "국어", "수학", "영어", "과학", "코딩" };
		int[][] score = new int[name.length][subjs.length];
//		int[] sum = new int[score.length];
		double[] avg = new double[name.length];

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = new Random().nextInt(100) + 1;
			}
		}
		for (int i = 0; i < score.length; i++) {
			double _sum = 0;
			for (int j = 0; j < score[i].length; j++) {
//				sum[i] += score[i][j];//
				_sum += score[i][j];
			}
//			avg[i] = (double) sum[i] / (score[i].length);
			avg[i] = _sum / (subjs.length);
		}

		System.out.println("====================원점수====================");
		System.out.print("학생명\t");
		for (int i = 0; i < subjs.length; i++) {
			System.out.printf((i + 1) + "." + subjs[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < score.length; i++) {
			System.out.printf(name[i] + "\t ");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print("   " + score[i][j] + "\t");
			}
			System.out.println(" ");
		}
		System.out.println("==============================================");

		System.out.println("======================평균점수======================");
		System.out.print("학생명\t");
//		for (int i = 0; i < subjs.length; i++) {
//			System.out.printf((i+1)+"."+subjs[i]+"\t");
//		}

		// 향상된 for문
		// 배열에 있는 값들을 차례차례 꺼낼 때 사용하면 유용하다.
		// 다만 어떤 인덱스에 조건을 걸어서 사용할 때는 일반 for문이 유용하다.
		int idx = 1;
		for (String subj : subjs) {
			System.out.print(idx + "." + subj + "\t");
			idx++;
		}

		System.out.println("평균");
		for (int i = 0; i < name.length; i++) {
			System.out.printf(name[i] + "\t ");
			for (int j = 0; j < subjs.length; j++) {
				System.out.print("   "+ score[i][j] + "\t");
			}
			System.out.println(avg[i] + "\t");
		}
		System.out.println("====================================================");

	}
}
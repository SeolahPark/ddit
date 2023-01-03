package personal;

import java.util.Arrays;
import java.util.Random;

public class Grade {
	//  시험 예시
    // 문제
    // 각 학생의 점수 합계와 평균을 구하세요
	//이  름 | 자바 | 오라클 | javascript | jsp | python | spring | 합계 | 평균 | 석차 
	//이순신    80        80        80       80     80       80     480     80     1
	//홍길동    80        80        80       80     80       80     480     80     1
	//유관순    80        80        80       80     80       80     480     80     1
	//사임당    80        80        80       80     80       80     480     80     1
	//아이유    80        80        80       80     80       80     480     80     1

	public static void main(String[] args) {
		String[] name = { "이순신", "홍길동", "유관순", "사임당", "아이유" };
		int[][] grade = new int[6][5];
		int[] sum = new int[grade.length];
		double[] avg = new double[grade.length];
		int javaTotal = 0;
		int oracleTotal = 0;
		int jsTotal = 0;
		int jspTotal = 0;
		int pythonTotal = 0;
		int springTotal = 0;

		Random rnd = new Random();
		for (int i = 0; i < grade.length; i++) {
			for (int j = 0; j < grade[i].length; j++) {
				grade[i][j] = rnd.nextInt(101);
			}
			System.out.println(Arrays.toString(grade[i]));
		}

		for (int i = 0; i < grade.length; i++) {
			for (int j = 0; j < grade[i].length-1; j++) {
				sum[i] += grade[i][j];//
			}
			for(int j=0; i< grade.length; i++) {
				javaTotal += grade[j][0];
				oracleTotal += grade[j][1];
				jsTotal += grade[j][2];
				jspTotal += grade[j][3];
				pythonTotal += grade[j][4];
				springTotal += grade[j][5];
			}
			
			avg[i] = (double) sum[i] / grade[i].length;
			System.out.printf("자바 : %d 오라클 : %d 자스 : %d jps : %d 파이썬 : %d 스프링 : %d\n",javaTotal,oracleTotal,jsTotal,jspTotal,pythonTotal,springTotal);
			System.out.printf((i + 1) + "번째 학생 합계 : %d, 평균 : %.2f\n", sum[i], avg[i]);
		}

	}

}

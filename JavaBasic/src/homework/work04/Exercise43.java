package homework.work04;

import java.util.Scanner;

public class Exercise43 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String grade = "";

		System.out.println("점수를 입력하세요.");
		System.out.print("프로그래밍 기초: ");
		int programing = Integer.parseInt(input.nextLine());
		System.out.print("데이터베이스: ");
		int DB = Integer.parseInt(input.nextLine());
		System.out.print("화면 구현: ");
		int embodiment = Integer.parseInt(input.nextLine());
		System.out.print("애플리케이션 구현: ");
		int application = Integer.parseInt(input.nextLine());
		System.out.print("머신러닝: ");
		int machine = Integer.parseInt(input.nextLine());

		int total = programing + DB + embodiment + application + machine;
		double average = total / 5.0;
		

//		if (average < 60) { grade = "F"; } else if (average < 70) { grade = "D"; }
//		else if (average < 80) { grade = "C"; } else if (average < 90) { grade = "B";
//		} else { grade = "A"; }

		if (average >= 90) {
			grade = "A";
		} else if (average >= 80) {
			grade = "B";
		} else if (average >= 70) {
			grade = "C";
		} else if (average >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
//		System.out.printf("총점 :%d\n평균: %.1f\n학점: \"%s\"", total, average, grade);
		System.out.printf("총점 \\ 평균 : %,d \\ %.1f\n학점: \"%s\"", total, average, grade);
		// \n 줄바꿈
		// \t 탭
		// \" "를 출력 ->
		// , 1000단위 ,를 찍어줌 (ex. %,d)

		input.close();
	}

}
/*
 * 사용자로부터 5과목의 점수를 입력받아 평균을 구하는 프로그램을 작성하여 보자. 평균 점수로 학점을 계산하여 출력한다.(평균 점수는 소숫점
 * 둘째자리까지만 출력) 평균 점수가 90점 이상이면 A, 80점 이상 90점 미만이면 B, 70점 이상 80점 미만이면 C, 60점 이상
 * 70점 미만이면 D, 60점 미만이면 F로 계산한다.
 */

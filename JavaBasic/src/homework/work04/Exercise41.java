package homework.work04;

import java.util.Scanner;

public class Exercise41 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("삼각형의 첫번째 변의 길이를 입력하세요: ");
		int first = Integer.parseInt(input.nextLine());
		System.out.print("삼각형의 두번째 변의 길이를 입력하세요: ");
		int second = Integer.parseInt(input.nextLine());
		System.out.print("삼각형의 세번째 변의 길이를 입력하세요: ");
		int third = Integer.parseInt(input.nextLine());

		// 방법 1
		if (first < second) {
			int temp = first;
			first = second;
			second = temp;
		}
		if (first < third) {
			int temp = first;
			first = third;
			third = temp;
		}
		if (second < third) {
			int temp = second;
			second = third;
			third = temp;
		}

		if (first < (second + third))
			System.out.println("삼각형을 만들 수 있습니다.");
		else
			System.out.println("삼각형을 만들 수 없습니다.");

		// 방법2
		if((first+second > third) && (first+third > second) && (second+third > first)) {
			System.out.println("가능");
		}else System.out.println("불가능");
		
		input.close();

	}

}

/*
 * 사용자로부터 세 변의 길이를 입력받은 후, 입력받은 변의 길이로 삼각형을 만들 수 있는지 판별하는 프로그램을 만들어 보자 삼각형을 판별하는
 * 방법은 가장 긴 변의 길이가 다른 두 변의 길이의 합보다 작으면 삼각형을 만들 수 있다.
 */
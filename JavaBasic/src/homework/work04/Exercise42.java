package homework.work04;

import java.util.Scanner;

public class Exercise42 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		boolean b = true;
		int month = 0;

//		while (b) {
//			System.out.print("월을 입력하세요(1~12) : ");
//			month = Integer.parseInt(input.nextLine());
//
//			switch (month) {
//			case 3:
//			case 4:
//			case 5:
//				System.out.printf("%d월은 봄입니다. \n", month);
//				break;
//
//			case 6:
//			case 7:
//			case 8:
//				System.out.printf("%d월은 여름입니다. \n", month);
//				break;
//
//			case 9:
//			case 10:
//			case 11:
//				System.out.printf("%d월은 가을입니다. \n", month);
//				break;
//
//			case 12:
//			case 1:
//			case 2:
//				System.out.printf("%d월은 겨울입니다. \n", month);
//				break;
//
//			default:
//				System.out.printf("%d월은 잘못된 입력입니다. \n", month);
//				b = false;
//				break;
//			}
//		}

		outer: while (true) {
			System.out.print("월을 입력하세요(1~12) : ");
			month = Integer.parseInt(input.nextLine());

			if (month == 3 || month == 4 || month == 5)
				System.out.printf("%d월은 봄입니다. \n", month);

			else if (month == 6 || month == 7 || month == 8)
				System.out.printf("%d월은 여름입니다. \n", month);

			else if (month == 9 || month == 10 || month == 11)
				System.out.printf("%d월은 가을입니다. \n", month);

			else if (month == 1 || month == 2 || month == 12)
				System.out.printf("%d월은 겨울입니다. \n", month);

			else {
				System.out.printf("%d월은 잘못된 입력입니다. \n", month);
				break outer;
			}

		}
		input.close();

	}

}
/*
 * 사용자로부터 특정 월을 입력받은 후, 입력 받은 월의 계절이 어떤 계절인지 알아내는 프로그램을 만들어 보자. 3월~5월은 봄, 6월~8월은
 * 여름, 9월~11월은 가을, 12월~2월은 겨울을 출력한다. 잘못 입력할 때까지 반복해주세요.
 */

package homework.work05;

import java.util.Random;
import java.util.Scanner;

public class W03 {
//인공지능 컴퓨터와 게이머(사람)가 가위바위보 게임을 할 수 있도록 프로그램을 작성하시오.
//가위바위보를 입력하세요 : 보
//게이머: 보
//인공지능 컴퓨터: 바위
//결과: 게이머 승리!

	public static void main(String[] args) {
//		Random rnd = new Random();
		Scanner input = new Scanner(System.in);
		String[] RPS = { "가위", "바위", "보" };
		System.out.print("가위바위보를 입력하세요 : ");
		String gamer = input.nextLine();
		System.out.printf("게이머: %s\n", gamer);

//		int rndIndex = rnd.nextInt(RPS.length); // 0,1,2 값이 나옴
//		String temp = RPS[rndIndex]; // 0, 1, 2에 해당하는 글자가 들어감
		String _RPS = RPS[new Random().nextInt(RPS.length)];
		System.out.printf("인공지능 컴퓨터: %s\n", _RPS);

//		 switch (gamer) {
//			case "가위":
//				if (temp.equals("가위"))
//					System.out.println("비겼습니다.");
//				else if (temp.equals("바위"))
//					System.out.println("컴퓨터 승리!");
//				else
//					System.out.println("게이머 승리!");
//				break;
//			case "바위":
//				if (temp.equals("가위"))
//					System.out.println("게이머 승리!");
//				else if (temp.equals("바위"))
//					System.out.println("비겼습니다.");
//				else
//					System.out.println("컴퓨터 승리!");
//				break;
//			case "보":
//				switch (temp) {
//				case "가위":
//					System.out.println("컴퓨터 승리!");
//					break;
//				case "바위":
//					System.out.println("게이머 승리!");
//					break;
//				case "보":
//					System.out.println("비겼습니다.");
//					break;
//				}
//				break;
//			default:
//				System.out.println("잘못 입력했습니다");
//				break;
//		}

//		 switch (gamer) {
//			case "가위":
//				if (_RPS.equals("가위"))
//					System.out.println("비겼습니다.");
//				else if (_RPS.equals("바위"))
//					System.out.println("컴퓨터 승리!");
//				else
//					System.out.println("게이머 승리!");
//				break;
//			case "바위":
//				if (_RPS.equals("가위"))
//					System.out.println("게이머 승리!");
//				else if (_RPS.equals("바위"))
//					System.out.println("비겼습니다.");
//				else
//					System.out.println("컴퓨터 승리!");
//				break;
//			case "보":
//				if (_RPS.equals("가위"))
//					System.out.println("컴퓨터 승리!");
//				else if (_RPS.equals("바위"))
//					System.out.println("게이머 승리!");
//				else
//					System.out.println("비겼습니다.");
//				break;
//			default:
//				System.out.println("잘못 입력했습니다");
//				break;
//		}

		input.close();
	}

}

package homework.work04;

import java.util.Scanner;

public class Exercise44 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("철수: ");
		String cheol = input.nextLine();
		System.out.print("영희: ");
		String young = input.nextLine();

//		if (cheol.equals("가위") && young.equals("바위"))
//			System.out.println("결과: 영희 승리!");
//		else if (cheol.equals("가위") && young.equals("보"))
//			System.out.println("결과: 철수 승리!");
//		else if (cheol.equals("가위") && young.equals("가위"))
//			System.out.println("결과: 비겼습니다.");
//		else if (cheol.equals("바위") && young.equals("바위"))
//			System.out.println("결과: 비겼습니다.");
//		else if (cheol.equals("바위") && young.equals("보"))
//			System.out.println("결과: 영희 승리!");
//		else if (cheol.equals("바위") && young.equals("가위"))
//			System.out.println("결과: 철수 승리!");
//		else if (cheol.equals("보") && young.equals("바위"))
//			System.out.println("결과: 철수 승리!");
//		else if (cheol.equals("보") && young.equals("보"))
//			System.out.println("결과: 비겼습니다.");
//		else if (cheol.equals("보") && young.equals("가위"))
//			System.out.println("결과: 영희 승리!");
		
			switch (cheol) {
			case "가위":
				if (young.equals("가위"))
					System.out.println("비겼습니다.");
				else if (young.equals("바위"))
					System.out.println("영희 승리!");
				else
					System.out.println("철수 승리!");
				break;
			case "바위":
				if (young.equals("가위"))
					System.out.println("철수 승리!");
				else if (young.equals("바위"))
					System.out.println("비겼습니다.");
				else
					System.out.println("영희 승리!");
				break;
			case "보":
				switch (young) {
				case "가위":
					System.out.println("영희 승리!");
					break;
				case "바위":
					System.out.println("철수 승리");
					break;
				case "보":
					System.out.println("비겼습니다.");
					break;
				}
				break;
			default:
				System.out.println("잘못 입력");
				break ;
		}
		input.close();
	}

}
/*
 * 두 사람이 하는 가위 바위 보 게임을 만들어 보자. 두 사람이 입력한 문자열을 비교하여 누가 이겼는지 출력하는 프로그램이다. 문자열을 읽기
 * 위해서는 Scanner 클래스의 nextLine() 메소드를 이용하면 된다. 또 자바에서 문자열 비교는 주의를 기울여야 한다. String
 * 타입 변수와 문자열 비교는 == 이 아닌 equals() 메소드로 비교하여야 한다.
 */
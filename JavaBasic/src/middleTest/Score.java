package middleTest;

import java.util.Random;
import java.util.Scanner;

public class Score {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean addName = false, addSubject = false, sorted = false, modify = false;
		boolean init = true;

		int idxSort = -1;

		String[] names = new String[1];
		String[] subjects = new String[1];
		int[][] score = new int[1][1];

		main: while (true) {
			// 블럭 잡고 tab 키를 누르면 한칸 들여쓰기가 된다
			// 블럭 잡고 shift + tab 키를 누르면 한칸 내여쓰기가 된다.

			// 1. 6명의 이름을 저장할 수 있는 변수 names를 선언 및 생성하고,
			// 주변 친구들의 이름으로 초기화한다. (5점)
			if (init)
				names = new String[] { "김범수", "나  얼", "박효신", "이  수", "신용재", "하현우" };
			if (addName) {
				String[] temp = new String[names.length + 1];
				for (int i = 0; i < names.length; i++) {
					temp[i] = names[i];
				}
				System.out.print("이름 입력 >> ");
				temp[temp.length - 1] = sc.nextLine();
				names = temp;
			}

			// 2. 7과목의 이름을 저장할 수 있는 변수 subjects를 선언 및 생성하고,
			// 국어, 영어, 수학, 사회, 과학, Java, Oracle로 초기화한다. (5점)
			if (init)
				subjects = new String[] { "국어", "영어", "수학", "사회", "과학", "Java", "Oracle" };
			if (addSubject) {
				String[] temp = new String[subjects.length + 1];
				for (int i = 0; i < subjects.length; i++) {
					temp[i] = subjects[i];
				}
				System.out.print("과목 입력 >> ");
				temp[temp.length - 1] = sc.nextLine();
				subjects = temp;
			}

			// 3. 6명의 7과목의 점수(정수)를 저장할 수 있는 변수 score를 선언 및 생성한다. (5점)
			// (단, names와 subjects의 길이를 이용한다.)
			if (init)
				score = new int[names.length][subjects.length];

			int[][] tempScore = new int[names.length][subjects.length];
			for (int i = 0; i < score.length; i++) {
				for (int j = 0; j < score[i].length; j++) {
					tempScore[i][j] = score[i][j];
				}
			}
			score = tempScore;

			// 4. score의 모든 요소에 50~100 사이의 임의의 값(정수)을 저장한다. (5점)
			if (init) {
				for (int i = 0; i < score.length; i++) {
					for (int j = 0; j < score[i].length; j++) {
						score[i][j] = new Random().nextInt(51) + 50;
					}
				}
			}
			if (addName) {
				for (int i = 0; i < score[score.length - 1].length; i++) {
					score[score.length - 1][i] = new Random().nextInt(51) + 50;
				}
			}
			if (addSubject) {
				for (int i = 0; i < names.length; i++) {
					score[i][subjects.length - 1] = new Random().nextInt(51) + 50;
				}
			}
			if (modify == true) {
				System.out.print("학생이름을 입력하세요 >> ");
				String modiName = sc.nextLine();
				System.out.print("과목명을 입력하세요 >> ");
				String modiSubject = sc.nextLine();
				System.out.print("점수를 입력하세요 >> ");
				int modiScore = Integer.parseInt(sc.nextLine());

				int idxSub = -1, idxName = -1;

				for (int i = 0; i < subjects.length; i++) {
					if (subjects[i].equals(modiSubject)) {
						idxSub = i;
					}
				}
				if (idxSub == -1) {
					System.out.println(modiSubject + " 과목은 없습니다.");
				}

				for (int i = 0; i < names.length; i++) {
					if (names[i].equals(modiName)) {
						idxName = i;
					}
				}
				if (idxName == -1) {
					System.out.println(modiName + " 학생은 없습니다.");
				}

				if (idxSub != -1 && idxName != -1) {
					if (modiScore > 100 || modiScore < 50) {
						System.out.println("점수가 이상합니다.");
					} else {
						score[idxName][idxSub] = modiScore;
					}
				}
			}

			// 5. 학생별 합계를 저장할 수 있는 변수 nameSum을 선언 및 생성한다. (5점)
			// (단, names의 길이를 이용한다.)
			int[] nameSum = new int[names.length];

			// 6. nameSum의 요소에 훈련생별 합계를 저장한다. (5점)
			for (int i = 0; i < score.length; i++) {
				for (int j = 0; j < score[i].length; j++) {
					nameSum[i] += score[i][j];
				}
			}

			// 7. 학생별 평균(실수)을 저장할 수 있는 변수 nameAvg를 선언 및 생성한다. (5점)
			// (단, names의 길이를 이용한다.)
			double[] nameAvg = new double[names.length];

			// 8. nameAvg의 요소에 학생별 평균(실수)을 저장한다. (5점)
			// (단, 평균은 소수점 세 번째 자리에서 '반올림'하여 두 번째 자리까지 저장한다.)
			for (int i = 0; i < nameAvg.length; i++) {
				// nameAvg[i] = (double) nameSum[i] / subjects.length;
				// 81.33333333333333334
				// nameAvg[i] *= 100;
				// 8133.3333333333334
				// nameAvg[i] = Math.round(nameAvg[i]);
				// 8133.0
				// nameAvg[i] /= 100;
				// 81.33
				nameAvg[i] = Math.round(((double) nameSum[i] / subjects.length) * 100) / 100.0;
			}

			// 9. 과목별 합계를 저장할 수 있는 변수 subSum을 선언 및 생성한다. (5점)
			// (단, subjects의 길이를 이용한다.)
			int[] subSum = new int[subjects.length];

			// 10. subSum의 요소에 과목별 합계를 저장한다. (5점)
			for (int i = 0; i < subjects.length; i++) {
				for (int j = 0; j < names.length; j++) {
					subSum[i] += score[j][i];
				}
			}

			// 11. 과목별 평균(실수)을 저장할 수 있는 변수 subAvg를 선언 및 생성한다. (5점)
			// (단, subjects의 길이를 이용한다.)
			double[] subAvg = new double[subjects.length];

			// 12. subAvg의 요소에 과목별 평균(실수)을 저장한다. (5점)
			// (단, 평균은 소수점 세 번째 자리에서 '반올림'하여 두 번째 자리까지 저장한다.)
			for (int i = 0; i < subAvg.length; i++) {
				subAvg[i] = (double) subSum[i] / names.length;
				subAvg[i] *= 100;
				subAvg[i] = Math.round(subAvg[i]);
				subAvg[i] /= 100.0;
			}

			// 13. 학생별 석차를 저장할 수 있는 변수 rank를 선언 및 생성한다. (5점)
			// (단, names의 길이를 이용한다.)
			int[] rank = new int[names.length];

			// 14. rank의 요소에 합계를 기준으로 훈련생별 석차를 저장한다. (15점)
			for (int i = 0; i < rank.length; i++) {
				rank[i] = 1;
			}
			for (int i = 0; i < rank.length; i++) {
				for (int j = 0; j < rank.length; j++) {
					if (nameSum[i] < nameSum[j]) {
						rank[i]++;
					}
				}
			}

			// 정렬
			if (sorted == true) {
				System.out.print("정렬하실 과목명 >> ");
				String sortSub = sc.nextLine();

				for (int i = 0; i < subjects.length; i++) {
					if (subjects[i].equals(sortSub)) {
						idxSort = i;
					}
				}
				if (sortSub.equals("합계")) {
					idxSort = -2;
				}
				if (sortSub.equals("평균")) {
					idxSort = -3;
				}
				if (sortSub.equals("석차")) {
					idxSort = -4;
				}

				if (idxSort == -1) {
					System.out.println("과목이 없습니다.");
				}
			}
			if (idxSort != -1) {
				int[] scoreSub = new int[names.length];
				switch (idxSort) {
				case -2:
				case -3: // 평균으로 정렬된 것처럼 보이게 함.
					for (int i = 0; i < scoreSub.length; i++) {
						scoreSub[i] = nameSum[i];
					}
					break;
				case -4:
					for (int i = 0; i < scoreSub.length; i++) {
						scoreSub[i] = rank[i] * -1;
						// 코드를 똑같이 사용하고싶어서 * -1을 해줌.
					}
					break;
				default:
					for (int i = 0; i < scoreSub.length; i++) {
						scoreSub[i] = score[i][idxSort];
					}
				}
				// {95,74,80,99,51,84}
				for (int i = 0; i < scoreSub.length; i++) {
					int idxMax = i;
					for (int j = i; j < scoreSub.length; j++) {
						if (scoreSub[idxMax] < scoreSub[j]) {
							idxMax = j;
						}
					}

					int tempInt = scoreSub[i];
					scoreSub[i] = scoreSub[idxMax];
					scoreSub[idxMax] = tempInt;

					String tempName = names[i];
					names[i] = names[idxMax];
					names[idxMax] = tempName;

					int[] tempRow = score[i];
					score[i] = score[idxMax];
					score[idxMax] = tempRow;

					int tempSum = nameSum[i];
					nameSum[i] = nameSum[idxMax];
					nameSum[idxMax] = tempSum;

					double tempAvg = nameAvg[i];
					nameAvg[i] = nameAvg[idxMax];
					nameAvg[idxMax] = tempAvg;

					int tempRank = rank[i];
					rank[i] = rank[idxMax];
					rank[idxMax] = tempRank;
				}
			}

			// 15. 위에서 생성된 변수들을 이용하여 아래와 같이 출력한다.(구분선 제외) (20점)
			// ====================================================================================
			// | 국어 영어 수학 사회 과학 Java Oracle | 합계 평균 석차
			// --------┼-------------------------------------------------------┼-------------------
			// 김범수 | 95 55 73 64 53 68 96 | 504 72.0 4
			// 나얼 | 74 81 97 64 59 89 74 | 538 76.86 1
			// 박효신 | 80 50 55 51 63 82 85 | 466 66.57 6
			// 이수 | 99 59 84 99 55 68 72 | 536 76.57 2
			// 신용재 | 51 82 53 76 91 64 93 | 510 72.86 3
			// 하현우 | 84 67 73 79 55 61 73 | 492 70.29 5
			// --------┼-------------------------------------------------------┼-------------------
			// 합계 | 483 394 435 433 376 432 493 |
			// 평균 | 80.5 65.67 72.5 72.17 62.67 72.0 82.17 |
			// ====================================================================================

			System.out.println("====================================================================================");
			System.out.print("\t|");
			for (int i = 0; i < subjects.length; i++) {
				if (idxSort == i)
					System.out.print(subjects[i] + "*\t");
				else
					System.out.print(subjects[i] + "\t");
			}
			System.out.print("| 합계");
			if (idxSort == -2)
				System.out.print("*");
			System.out.print("\t평균");
			if (idxSort == -3)
				System.out.print("*");
			System.out.print("\t석차");
			if (idxSort == -4)
				System.out.print("*");
			System.out.print("\n");
			System.out.println("------------------------------------------------------------------------------------");
			for (int i = 0; i < score.length; i++) {
				System.out.printf("%3s  |", names[i]);
				for (int j = 0; j < score[i].length; j++) {
					System.out.printf(" %2d \t", score[i][j]);
				}
				System.out.print("| ");
				System.out.print(nameSum[i] + "\t");
				System.out.print(nameAvg[i] + "\t ");
				System.out.print(rank[i] + "\n");
			}
			System.out.println("------------------------------------------------------------------------------------");
			System.out.print("합계 \t| ");
			for (int i = 0; i < subjects.length; i++) {
				System.out.print(subSum[i] + "\t");
			}
			System.out.print("| \n");
			System.out.print("평균 \t| ");
			for (int i = 0; i < subjects.length; i++) {
				System.out.print(subAvg[i] + "\t");
			}
			System.out.print("| ");
			System.out.println("\n\n\n");

			init = false;
			addName = false;
			addSubject = false;
			sorted = false;
			modify = false;
			System.out.println("작업을 선택해주세요.");
			System.out.println("1.학생추가 2.과목추가 3.정렬 4.점수수정 5.프로그램종료");
			System.out.print("선택 >> ");
			int input = Integer.parseInt(sc.nextLine());
			switch (input) {
			case 1:
				addName = true;
				break;
			case 2:
				addSubject = true;
				break;
			case 3:
				sorted = true;
				break;
			case 4:
				modify = true;
				break;
			case 5:
				System.out.println("종료합니다.");
				break main;
			}

		}
//		(optional. 15번까지 완성했다면, 도전해보세요.)
//		추가1. 사용자에게 학생을 추가할 것인지 물어보고 (y/n) (+10점)
//		사용자가 학생 추가를 원한다면 학생의 이름을 입력받아 학생의 일곱 과목 점수를 랜덤으로 부여합니다.
//		학생을 계속 입력할 것 인지 물어보고(y/n). 계속 입력을 받거나 중단합니다.
//		새로 추가된 학생의 점수를 포함하여 계산된 총 출력을 다시 보여줍니다.

//		추가2. 사용자에게 과목을 추가할 것인지 물어보고 (y/n) (+10점)
//		사용자가 과목 추가를 원한다면 과목의 이름을 입력받아 과목을 추가하고 학생들의 점수는 랜덤 부여합니다.
//		새로 추가된 과목의 점수를 포함하여 계산된 총 출력을 다시 보여줍니다.

//		추가3. 과목 및 합계, 평균, 석차 중에 사용자가 선택하여 정렬할 수 있는 기능을 만들어보세요. (+15점)
//		(단, 과목 및 합계, 평균은 내림차순으로 / 석차는 오름차순으로(1등이 맨 위로))
//		(단, 정렬 기준에 * 표시를 해둔다)
//			예시)
//			정렬할 대상을 선택해주세요.
//			1.국어 2.영어 3.수학 4.사회 5.과학 6.Java 7.Oracle 8.합계 9.평균 10.석차
//			선택 >> 10
//			====================================================================================
//					| 국어	영어	수학	사회	과학	Java	Oracle	| 합계	평균	석차*
//			--------┼-------------------------------------------------------┼-------------------
//			나얼	| 74	81		97		64		59		89		74		| 538	76.86	1
//			이수	| 99	59		84		99		55		68		72		| 536	76.57	2
//			신용재	| 51	82		53		76		91		64		93		| 510	72.86	3
//			김범수	| 95	55		73		64		53		68		96		| 504	72.0	4
//			하현우	| 84	67		73		79		55		61		73		| 492	70.29	5
//			박효신	| 80	50		55		51		63		82		85		| 466	66.57	6
//			--------┼-------------------------------------------------------┼-------------------
//			합계	| 483	394		435		433		376		432		493		|
//			평균	| 80.5	65.67	72.5	72.17	62.67	72.0	82.17	|
//			====================================================================================

//		추가4. 특정 학생의 특정 과목 점수를 수정할 수 있는 기능을 만들어보세요. (+20점)
//			예시)
//			점수를 수정하시겠습니까? (y/n) >> y
//			학생이름을 입력하세요 >> 하현우
//			과목명을 입력하세요 >> 과학
//			점수를 입력하세요 >> 100
//			====================================================================================
//					| 국어	영어	수학	사회	과학	Java	Oracle	| 합계	평균	석차*
//			--------┼-------------------------------------------------------┼-------------------
//			나얼	| 74	81		97		64		59		89		74		| 538	76.86	1
//			하현우	| 84	67		73		79		100		61		73		| 537	76.71	2
//			이수	| 99	59		84		99		55		68		72		| 536	76.57	3
//			신용재	| 51	82		53		76		91		64		93		| 510	72.86	4
//			김범수	| 95	55		73		64		53		68		96		| 504	72.0	5
//			박효신	| 80	50		55		51		63		82		85		| 466	66.57	6
//			--------┼-------------------------------------------------------┼-------------------
//			합계	| 483	394		435		433		421		432		493		|
//			평균	| 80.5	65.67	72.5	72.17	70.17	72.0	82.17	|
//			====================================================================================

//		본 내용을 모두 선택하여 복사하여 붙여넣고 '각 문제 아래'에 코드를 작성합니다.
//		문제 풀이 완료 후 소스코드 전체를 복사하여 tablet7823@daum.net 으로 메일 본문에 붙여넣어 보내주세요.
//		메일 제목은 '[초급자바 레벨테스트] 202209 이름'으로 합니다.
//		본문 아래에 건의사항이나 요청사항, 도움사항 등 내용을 작성하셔도 좋습니다.
// 		dditpsr@naver.com
	}

}
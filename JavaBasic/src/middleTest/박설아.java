package middleTest;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 박설아 {
//	nameAvg[i] = (double) nameSum[i] / subjects.length;
//	subAvg[i] = (double) subSum[i] / names.length;
	public static void main(String[] args) {
//		1. 6명의 이름을 저장할 수 있는 변수 names를 선언 및 생성하고, 주변 친구들의 이름으로 초기화한다. (5점)
		String[] names = { "박설아", "홍지은", "박지은", "이태영", "이상혁", "송치원" };

//		2. 7과목의 이름을 저장할 수 있는 변수 subjects를 선언 및 생성하고, 
//		국어, 영어, 수학, 사회, 과학, Java, Oracle로 초기화한다. (5점)
		String[] subjects = { "국어", "영어", "수학", "사회", "과학", "Java", "Oracle" };

//		3. 6명의 7과목의 점수(정수)를 저장할 수 있는 변수 score를 선언 및 생성한다. (5점)
//		(단, names와 subjects의 길이를 이용한다.)
		int[][] score = new int[names.length][subjects.length];

//		4. score의 모든 요소에 50~100 사이의 임의의 값(정수)을 저장한다. (5점)
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = new Random().nextInt(51) + 50;
			}
		}

		/*---------------------------------------------------------------------------------------------*/

//		5. 학생별 합계를 저장할 수 있는 변수 nameSum을 선언 및 생성한다. (5점)
//		(단, names의 길이를 이용한다.)
		int[] nameSum = new int[names.length];

//		6. nameSum의 요소에 훈련생별 합계를 저장한다. (5점)
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				nameSum[i] += score[i][j];
			}
		}

//		7. 학생별 평균(실수)을 저장할 수 있는 변수 nameAvg를 선언 및 생성한다. (5점)
//		(단, names의 길이를 이용한다.)		
		double[] nameAvg = new double[names.length];

//		8. nameAvg의 요소에 학생별 평균(실수)을 저장한다. (5점)
//		(단, 평균은 소수점 세 번째 자리에서 '반올림'하여 두 번째 자리까지 저장한다.)
		for (int i = 0; i < score.length; i++) {
			double tempnAvg = (double) nameSum[i] / subjects.length;
			nameAvg[i] = Math.round(tempnAvg * 100.0) / 100.0;
		}

		/*---------------------------------------------------------------------------------------------*/

//		9. 과목별 합계를 저장할 수 있는 변수 subSum을 선언 및 생성한다. (5점)
//		(단, subjects의 길이를 이용한다.)
		int[] subSum = new int[subjects.length];

//		10. subSum의 요소에 과목별 합계를 저장한다. (5점)
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < subjects.length; j++) {
				subSum[j] += score[i][j];
			}
		}

//		11. 과목별 평균(실수)을 저장할 수 있는 변수 subAvg를 선언 및 생성한다. (5점)
//		(단, subjects의 길이를 이용한다.)
		double[] subAvg = new double[subjects.length];

//		12. subAvg의 요소에 과목별 평균(실수)을 저장한다. (5점)
//		(단, 평균은 소수점 세 번째 자리에서 '반올림'하여 두 번째 자리까지 저장한다.)
		for (int i = 0; i < subjects.length; i++) {
			double tempnAvg = (double) subSum[i] / names.length;
			subAvg[i] = Math.round(tempnAvg * 100.0) / 100.0;
		}
		/*---------------------------------------------------------------------------------------------*/

//		13. 학생별 석차를 저장할 수 있는 변수 rank를 선언 및 생성한다. (5점)
//		(단, names의 길이를 이용한다.)
		int[] rank = new int[names.length];

//		14. rank의 요소에 합계를 기준으로 훈련생별 석차를 저장한다. (15점)
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (nameAvg[i] < nameAvg[j]) {
					rank[i] += 1;
				}
			}
		}

		System.out.println("====================================================================================");
		System.out.print("\t");
		for (String sub : subjects) {
			System.out.print(sub + "\t");
		}
		System.out.println("합계\t평균\t석차");
		for (int i = 0; i < score.length; i++) {
			System.out.print(names[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(nameSum[i] + "\t");
			System.out.printf("%.2f\t", nameAvg[i]);
			System.out.print(" " + (rank[i] + 1));
			System.out.println();
		}
		System.out.print("합계\t");
		for (int i = 0; i < subjects.length; i++) {
			System.out.print(subSum[i] + "\t");
		}
		System.out.print("\n평균\t");
		for (int i = 0; i < subjects.length; i++) {
			System.out.printf("%.2f\t", subAvg[i]);
		}
		System.out.print("\n====================================================================================\n");

		Scanner input = new Scanner(System.in);
		int number = 0;
		boolean b = true;

		while (b) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 학생 추가");
			System.out.println("2. 과목 추가");
			System.out.println("3. 정렬");
			System.out.println("4. 점수 수정");
			System.out.println("5. 종료하기");
			System.out.print("입력 >> ");
			number = Integer.parseInt(input.nextLine());

			switch (number) {

			case 1:
				System.out.println();
				String answer = "a";
				boolean b1 = false;

				System.out.print("학생을 추가합니까? (y/n) : ");
				answer = input.nextLine();

				if (answer.equals("y")) {
					b1 = true;
				}

				while (b1) {
					String[] newNames = new String[names.length + 1];
					int[][] newScore = new int[newNames.length][subjects.length];
					nameSum = new int[newNames.length];
					nameAvg = new double[newNames.length];
					rank = new int[newNames.length];
					subSum = new int[subjects.length];
					subAvg = new double[subjects.length];

					System.out.print("이름을 입력하세요 : ");
					String addname = input.nextLine();
					newNames[newNames.length - 1] = addname;

					// 이름 및 성적 복사
					for (int i = 0; i < score.length; i++) {
						newNames[i] = names[i];
						for (int j = 0; j < score[i].length; j++) {
							newScore[i][j] = score[i][j];
						}
					}

					// 마지막 배열에 새로운 점수 입력
					for (int i = newScore.length - 1; i < newScore.length; i++) {
						for (int j = 0; j < newScore[i].length; j++) {
							newScore[i][j] = new Random().nextInt(51) + 50;
						}
					}

					// 과목 합계 및 평균
					for (int i = 0; i < newNames.length; i++) {
						for (int j = 0; j < subjects.length; j++) {
							subSum[j] += newScore[i][j];
						}
					}
					for (int i = 0; i < subjects.length; i++) {
						subAvg[i] = (double) subSum[i] / newNames.length;
					}

					// 학생 합계 및 평균
					for (int i = 0; i < newScore.length; i++) {
						for (int j = 0; j < newScore[i].length; j++) {
							nameSum[i] += newScore[i][j];
						}
					}
					for (int i = 0; i < newScore.length; i++) {
						nameAvg[i] = (double) nameSum[i] / subjects.length;
					}

					// 석차 정렬
					for (int i = 0; i < rank.length; i++) {
						for (int j = 0; j < rank.length; j++) {
							if (nameAvg[i] < nameAvg[j]) {
								rank[i] += 1;
							}
						}
					}

					names = newNames;
					score = newScore;

					// 출력
					System.out.println(
							"====================================================================================");
					System.out.print("\t");
					for (String sub : subjects) {
						System.out.print(sub + "\t");
					}
					System.out.println("합계\t평균\t석차");
					for (int i = 0; i < score.length; i++) {
						System.out.print(names[i] + "\t");
						for (int j = 0; j < score[i].length; j++) {
							System.out.print(score[i][j] + "\t");
						}
						System.out.print(nameSum[i] + "\t");
						System.out.printf("%.2f\t", nameAvg[i]);
						System.out.print(" " + (rank[i] + 1));
						System.out.println();
					}
					System.out.print("합계\t");
					for (int i = 0; i < subjects.length; i++) {
						System.out.print(subSum[i] + "\t");
					}
					System.out.print("\n평균\t");
					for (int i = 0; i < subjects.length; i++) {
						System.out.printf("%.2f\t", subAvg[i]);
					}
					System.out.print(
							"\n====================================================================================\n");

					// 반복 확인
					System.out.print("계속 입력합니까?");
					answer = input.nextLine();

					if (answer.equals("n")) {
						System.out.println("학생 추가를 종료합니다.\n");
						break;
					}
				}
				break;

			case 2:
				System.out.println();
				answer = "a";
				boolean b2 = false;

				System.out.print("과목을 추가합니까? (y/n) : ");
				answer = input.nextLine();

				if (answer.equals("y")) {
					b2 = true;
				}

				while (b2) {
					String[] newSubjects = new String[subjects.length + 1];
					int[][] newScore = new int[names.length][newSubjects.length];
					nameSum = new int[names.length];
					nameAvg = new double[names.length];
					subSum = new int[newSubjects.length];
					subAvg = new double[newSubjects.length];
					rank = new int[names.length];

					System.out.print("과목을 입력하세요 : ");
					String addname = input.nextLine();
					newSubjects[newSubjects.length - 1] = addname;

					// 이름 및 성적 복사
					for (int i = 0; i < newScore.length; i++) {
						for (int j = 0; j < score[i].length; j++) {
							newSubjects[j] = subjects[j];
							newScore[i][j] = score[i][j];
						}
					}

					// 마지막 배열에 새로운 점수 입력
					for (int i = 0; i < newScore.length; i++) {
						for (int j = newScore[i].length - 1; j < newScore[i].length; j++) {
							newScore[i][j] = new Random().nextInt(51) + 50;
						}
					}

					// 과목 합계 및 평균
					for (int i = 0; i < names.length; i++) {
						for (int j = 0; j < newSubjects.length; j++) {
							subSum[j] += newScore[i][j];
						}
					}
					for (int i = 0; i < newSubjects.length; i++) {
						subAvg[i] = (double) subSum[i] / names.length;
					}

					// 학생 합계 및 평균
					for (int i = 0; i < newScore.length; i++) {
						for (int j = 0; j < newScore[i].length; j++) {
							nameSum[i] += newScore[i][j];
						}
					}
					for (int i = 0; i < newScore.length; i++) {
						nameAvg[i] = (double) nameSum[i] / newSubjects.length;
					}

					// 석차 정렬
					for (int i = 0; i < rank.length; i++) {
						for (int j = 0; j < rank.length; j++) {
							if (nameAvg[i] < nameAvg[j]) {
								rank[i] += 1;
							}
						}
					}

					subjects = newSubjects;
					score = newScore;

					// 출력
					System.out.print(
							"\n====================================================================================\n");
					System.out.print("\t");
					for (String sub : subjects) {
						System.out.print(sub + "\t");
					}
					System.out.println("합계\t평균\t석차");
					for (int i = 0; i < score.length; i++) {
						System.out.print(names[i] + "\t");
						for (int j = 0; j < score[i].length; j++) {
							System.out.print(score[i][j] + "\t");
						}
						System.out.print(nameSum[i] + "\t");
						System.out.printf("%.2f\t", nameAvg[i]);
						System.out.print(" " + (rank[i] + 1));
						System.out.println();
					}
					System.out.print("합계\t");
					for (int i = 0; i < subjects.length; i++) {
						System.out.print(subSum[i] + "\t");
					}
					System.out.print("\n평균\t");
					for (int i = 0; i < subjects.length; i++) {
						System.out.printf("%.2f\t", subAvg[i]);
					}
					System.out.print(
							"\n====================================================================================\n");

					// 반복 확인
					System.out.print("계속 입력합니까?");
					answer = input.nextLine();

					if (answer.equals("n")) {
						System.out.println("학생 추가를 종료합니다.\n");
						break;
					}

				}
				break;

			case 3:
				System.out.println();
				boolean b3 = true;

				while (b3) {
					System.out.println("1.국어 2.영어 3.수학 4.사회 5.과학 6.Java 7.Oracle 8.합계 9.평균 10.석차 11.종료");
					System.out.print("정렬할 대상을 선택해주세요 : ");
					int sort = Integer.parseInt(input.nextLine());

					switch (sort) {
					case 1:
						for (int i = 0; i < score.length - 1; i++) {
							boolean changed = false;
							for (int j = 0; j < score.length - 1; j++) {
								if (score[j][i] < score[j + 1][i]) {

									int[] temp = score[j+1];
									score[j+1] = score[i];
									score[i] = temp;

									String nTemp = names[j+1];
									names[j+1] = names[i];
									names[i] = nTemp;

									int sTmp = nameSum[j+1];
									nameSum[j+1] = nameSum[i];
									nameSum[i] = sTmp;

									double sAmp = nameAvg[j+1];
									nameAvg[j+1] = nameAvg[i];
									nameAvg[i] = sAmp;
									
									int rTmp = rank[j+1];
									rank[j+1] = rank[i];
									rank[i] = rTmp;
									
									changed = true;

								}
							}

							if (changed == false) {
								break;
							}
						}
						System.out.print(
								"\n====================================================================================\n");
						System.out.print("\t");
						for (String sub : subjects) {
							System.out.print(sub + "\t");
						}
						System.out.println("합계\t평균\t석차");
						for (int i = 0; i < score.length; i++) {
							System.out.print(names[i] + "\t");
							for (int j = 0; j < score[i].length; j++) {
								System.out.print(score[i][j] + "\t");
							}
							System.out.print(nameSum[i] + "\t");
							System.out.printf("%.2f\t", nameAvg[i]);
							System.out.print(" " + (rank[i] + 1));
							System.out.println();
						}
						System.out.print("합계\t");
						for (int i = 0; i < subjects.length; i++) {
							System.out.print(subSum[i] + "\t");
						}
						System.out.print("\n평균\t");
						for (int i = 0; i < subjects.length; i++) {
							System.out.printf("%.2f\t", subAvg[i]);
						}
						System.out.print(
								"\n====================================================================================\n");

						break;

					case 2:
						System.out.println("2번\n");
						break;

					case 3:
						System.out.println("3번\n");
						break;

					case 4:
						System.out.println("4번\n");
						break;

					case 5:
						System.out.println("5번\n");
						break;

					case 6:
						System.out.println("6번\n");
						break;

					case 7:
						System.out.println("7번\n");
						break;

					case 8:
						System.out.println("8번\n");
						break;

					case 9:
						System.out.println("9번\n");
						break;

					case 10:
						System.out.println("10번\n");
						break;

					case 11:
						System.out.println("정렬을 종료합니다.\n");
						b3 = false;
						break;

					default:
						System.out.print("다시 입력해주세요 : ");
						sort = Integer.parseInt(input.nextLine());
						break;

					}
				}
				break;

			case 4:
				System.out.println();
				String answer4 = "";
				String tempName = "";
				String tempSub = "";
				int tempGrade = 0;
				boolean b4 = false;

				System.out.print("점수를 수정하시겠습니까? (y/n) >> ");
				answer4 = input.nextLine();

				if (answer4.equals("y")) {
					b4 = true;
				}

				while (b4) {
//					System.out.println("4번 구현ing...\n");
					System.out.print("학생이름을 입력하세요 >> ");
					tempName = input.nextLine();
					System.out.print("과목명을 입력하세요 >> ");
					tempSub = input.nextLine();
					System.out.print("점수를 입력하세요 >> ");
					tempGrade = Integer.parseInt(input.nextLine());

					outer: for (int i = 0; i < names.length; i++) {
						if (tempName.equals(names[i])) {
							for (int j = 0; j < subjects.length; j++) {
								if (tempSub.equals(subjects[j])) {
									score[i][j] = tempGrade;
									break outer;
								}
							}
						}
					}

					nameSum = new int[names.length];
					nameAvg = new double[names.length];
					rank = new int[names.length];
					subSum = new int[subjects.length];
					subAvg = new double[subjects.length];

					for (int i = 0; i < score.length; i++) {
						for (int j = 0; j < score[i].length; j++) {
							nameSum[i] += score[i][j];
						}
					}
					for (int i = 0; i < score.length; i++) {
						nameAvg[i] = (double) nameSum[i] / subjects.length;
					}
					for (int i = 0; i < names.length; i++) {
						for (int j = 0; j < subjects.length; j++) {
							subSum[j] += score[i][j];
						}
					}
					for (int i = 0; i < subjects.length; i++) {
						subAvg[i] = (double) subSum[i] / names.length;
					}
					for (int i = 0; i < rank.length; i++) {
						for (int j = 0; j < rank.length; j++) {
							if (nameAvg[i] < nameAvg[j]) {
								rank[i] += 1;
							}
						}
					}

					// 출력
					System.out.print(
							"\n====================================================================================\n");
					System.out.print("\t");
					for (String sub : subjects) {
						System.out.print(sub + "\t");
					}
					System.out.println("합계\t평균\t석차");
					for (int i = 0; i < score.length; i++) {
						System.out.print(names[i] + "\t");
						for (int j = 0; j < score[i].length; j++) {
							System.out.print(score[i][j] + "\t");
						}
						System.out.print(nameSum[i] + "\t");
						System.out.printf("%.2f\t", nameAvg[i]);
						System.out.print(" " + (rank[i] + 1));
						System.out.println();
					}
					System.out.print("합계\t");
					for (int i = 0; i < subjects.length; i++) {
						System.out.print(subSum[i] + "\t");
					}
					System.out.print("\n평균\t");
					for (int i = 0; i < subjects.length; i++) {
						System.out.printf("%.2f\t", subAvg[i]);
					}
					System.out.print(
							"\n====================================================================================\n");

					// 반복 확인
					System.out.print("계속 입력합니까? : ");
					answer4 = input.nextLine();

					if (answer4.equals("n")) {
						System.out.println("점수 수정을 종료합니다.\n");
						break;
					}
				}
				break;

			case 5:
				System.out.println();
				System.out.println("프로그램을 종료합니다");
				b = false;
				break;

			default:
				System.out.println();
				System.out.println("1-5 사이의 숫자로 입력해주세요\n");

			}
		}
	}

}
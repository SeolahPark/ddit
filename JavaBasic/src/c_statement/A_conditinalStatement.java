package c_statement;

import java.util.Scanner;

public class A_conditinalStatement {

	public static void main(String[] args) {
		//* 줄 지우기 : ctrl + d
		//* 되돌리기 : ctrl + z
		//* 앞으로 가기 : ctrl + y
		
//		[조건문]
//		- if문
//		- switch문
		
//		[if문]
//		- if(조건식) { } : 조건식의 결과가 true이면 블럭 안의 문장을 수행
//		- else if(조건식) { } : 다수의 조건이 필요할 때 if 뒤에 추가
//		- else { } : 결과가 true인 조건식이 하나도 없을 때 수행
		
		int a = 1;
		
		if(a==1) {
			System.out.println("조건식의 결과가 true면 수행된다. \n");
		}
		
		if(a == 0) {
			System.out.println("조건식의 결과가 false면 수행되지 않음.\n");
		}
		
		if(a == 0) {
			System.out.println("a가 0인 경우 하고 싶은 것\n");
		}else if(a == 1) {
			System.out.println("a가 1인 경우 하고 싶은 것\n");
		}else if(a == 2) {
			System.out.println("a가 2인 경우 하고 싶은 것\n");
		}else {
			System.out.println("이외의 경우에 하고 싶은 것\n");
		}
		
//		조건절의 범위가 큰 것이 위에 있으면 작은 조건은 사용되지 않을 가능성이 높으므로 조건식 작성에 주의해야함.
//		작은 조건 먼저 쓰고, 큰 조건을 나중에 쓰도록 하기.
		if(a < 20) {
			System.out.println("a가 20보다 작은 경우 하고 싶은 것\n");
		}else if(a < 10) {
			System.out.println("a가 10보다 작은 경우 하고 싶은 것\n"); 
		}
		
//		성적에 등급을 부여하는 프로그램을 작성해주세요.
//		90~ : A, 80~ : B, 70~ :C, 60~ :D, 나머지: F 
		Scanner input = new Scanner(System.in);
		/*String grade = "";
		System.out.print("성적 입력 : ");
		int score = Integer.parseInt(input.nextLine());
		
		
		if(score < 60) {
			grade = "F";
		}else if(score < 70) {
			grade = "D";
		}else if(score < 80) {
			grade = "C";
		}else if(score < 90) {
			grade = "B";
		}else {
			grade = "A";		
		}System.out.printf("%d점의 학점은 %s 입니다. ", score, grade);
		
		or
		
		if(score  >= 90) {
			grade = "A";
		}else if(score >= 80) {
			grade = "B";
		}else if(score >= 70) {
			grade = "C";
		}else if(score >= 60) {
			grade = "D";
		}else {
			grade = "F";		
		}System.out.printf("%d점의 학점은 %s 입니다. ", score, grade);
		*/
		
//		성적에 등급을 부여하는 프로그램을 작성해주세요.	
//		1. 성적을 입력받으세요.
//		X0 ~ X3 : - , X4~X6 : 0 , X7~X9 : +
		
//		반복문파티 버전
		/*if(score  >= 90) {
			if(score >= 97 ) {
				grade = "A+";
			}else if(score >= 94) {
				grade = "A";
			}else {
				grade = "A-";
			}
		}else if(score >= 80) {
			if(score >= 87 ) {
				grade = "B+";
			}else if(score >= 84) {
				grade = "B";
			}else {
				grade = "B-";
			}
		}else if(score >= 70) {
			if(score >= 77 ) {
				grade = "C+";
			}else if(score >= 74) {
				grade = "C";
			}else {
				grade = "C-";
			}
		}else if(score >= 60) {
			if(score >= 67 ) {
				grade = "D+";
			}else if(score >= 64) {
				grade = "D";
			}else {
				grade = "D-";
			}
		}else {
			grade = "F";		
		}
		System.out.printf("%d점의 학점은 %s 입니다. ", score, grade);*/
		
//		삼항연산자 버전
		/*if(score  >= 90) {
			grade = (score  >= 97 ? "A+" : score >= 94 ? "A0" : "A-");
		}else if(score >= 80) {
			grade = (score  >= 87 ? "B+" : score >= 84 ? "B0" : "B-");
		}else if(score >= 70) {
			grade = (score  >= 77 ? "C+" : score >= 74 ? "C0" : "C-");
		}else if(score >= 60) {
			grade = (score  >= 67 ? "D+" : score >= 64 ? "D0" : "D-");
		}else {
			grade = "F";		
		}System.out.printf("%d점의 학점은 %s 입니다. ", score, grade);*/
		
//		2반복문 버전
		/*if(score  >= 90) {
			grade = "A";
		}else if(score >= 80) {
			grade = "B";
		}else if(score >= 70) {
			grade = "C";
		}else if(score >= 60) {
			grade = "D";
		}else {
			grade = "F";		
		}
		
		if(score % 10 <= 3) grade += "-";
		else if(score % 10 >= 7) grade += "+";
		else grade += "0";
//		조건 하나에 실행문 하나라면 {}(블럭)을 사용하지 않아도 된다.
//		다른 조건문은 조건하나~실행문하나 인데, 한 조건문만 여러 조건이라면 그 조건문만 {}(블럭)을 사용하면 된다.
		
		System.out.printf("%d점의 학점은 %s 입니다. ", score, grade);	
		input.close();*/
		
		
		
//		[switch문]
//		- switch(int/String) {case 1: break;}
//		- 조건식의 결과는 정수와 문자열만 허용된다.
//		- 조건식과 알치하는 case 문 '이후'의 문장을 수행한다.
		
		/*a = 1;
		switch(a) {
		case 0:
			System.out.println("a가 0인 경우에 하고 싶은 것 \n");
			break;
		case 1: case 3: case 4:
//			스위치문은 범위지정이 불가능. 정확한 숫자만 요구하기때문에 범위를 지정하고싶으면 case를 여러개 겹쳐야 한다.
//			범위지정. break를 만나지 않았기 때문에 break를 만날 때까지 계속 출력한다.
			System.out.println("a가 1인 경우에 하고 싶은 것 \n");
			break;
		case 2:
			System.out.println("a가 2인 경우에 하고 싶은 것 \n");
			break;
		default:
			System.out.println("a가 0,1,2가 아닌 경우에 하고 싶은 것\n");
			break;
		}
		
		String str = "a";
		switch(str) {
		case "a":
			System.out.println("a 입니다.\n");
			break;
		case "b":
			System.out.println("b 입니다.\n");
			break;
		case "c":
			System.out.println("c 입니다.\n");
			break;
		default:
			System.out.println("a,b,c가 아닙니다. \n");
			break;
		}
		
//		입력하는 월에 해당하는 계절을 출력해봅시다.
		
		System.out.print("월 입력 : ");
		int month = Integer.parseInt(input.nextLine());
		
		switch(month) {
		case 3: case 4: case 5:
			System.out.printf("%d월은 봄 입니다. \n", month);
			break;
		case 6: case 7: case 8:
			System.out.printf("%d월은 여름 입니다. \n", month);
			break;
		case 9: case 10: case 11:
			System.out.printf("%d월은 가을 입니다. \n", month);
			break;
		case 12: case 1: case 2:
			System.out.printf("%d월은 겨울 입니다. \n", month);
			break;
		default:
			System.out.printf("잘못 입력했습니다. \n", month);
			break; //맨 아래 조건문은 break를 적지 않아도 된다.
		}*/
		
//		숫자 3개를 입력받아 내림차순으로 출력해주세요. ex. 40 > 24> 7
		
		System.out.println("숫자 3개를 입력하세요 " );
		int first = Integer.parseInt(input.nextLine());
		int second = Integer.parseInt(input.nextLine());
		int third = Integer.parseInt(input.nextLine());
		
		
		/*if(first >= second && first >= third) {
			if(second >= third) System.out.printf("%d > %d > %d", first, second, third);
			else System.out.printf("%d > %d > %d", first, third, second);
		}else if(second >= first && second >= third){
			if(first >= third) System.out.printf("%d > %d > %d", second, first, third);
			else System.out.printf("%d > %d > %d", second, third, first);
		}else if(third >= first && third >= second) {
			if(first >= second) System.out.printf("%d > %d > %d", third, first, second);
			else System.out.printf("%d > %d > %d", third, second, first);			
		}*/
		
		if(first < second) {
			int temp = first;
			first = second;
			second = temp;
		}
		if(first < third) {
			int temp = first;
			first = third;
			third = temp;			
		}
		if(second < third) {
			int temp = second;
			second = third;
			third = temp;			
		}
		System.out.printf("%d > %d > %d", first, second, third);
		
		input.close();
		
	}

}

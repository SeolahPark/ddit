package c_statement;

//import java.util.Random;
//import java.util.Scanner;

public class B_RepetitiveStatement {
	static int temp = 2;

	public static void main(String[] args) {
		/*
		 * [[반복문]]
		 * - for문
		 * - while문
		 * - do-while문
		
		
		
		
		
		
		 * [for문]
		 * - for(초기화; 조건식; 증감식){ 실행문 }
		 * - 실행문을 정해진 횟수만큼 반복하게 해주는 문장
		 */
		
		int tmp=0;
		// 블럭 밖에서 이미 i가 선언된 경우, for문 안에서 같은 이름을 가진 변수를 선언할 수 없다.
		for(int i = 0 ; i <= 10 ; i++){
			// 초기화 : 조건식과 증감식에 사용할 변수 초기화
			// 조건식 : 연산결과가 true이면 블럭 안의 내용을 수행한다.
			// 증감식 : 변수를 증가/감소시켜 반복문을 제어한다.
			// 블럭 안에서 선언한 변수는 블럭 안에서만 사용할 수 있다.
			System.out.println(i+"번째 반복");
			tmp=i;
			
		}System.out.println(tmp +"\n");
		// for문안에서 선언한 변수의 마지막 값을 확인할 경우 사용하는 방식.
		
		// 규칙이 있는 문장들을 효율적으로 작성하기 위해 반복문을 사용한다.
		
		
		
		
		
		// Q. 1~10까지의 합계를 구하시오.
		int sum = 0;
		for(int i = 1 ; i <= 10 ; i++) {
			sum += i;
		}System.out.println(sum +"\n");
		
		// Q. 1부터 100까지의 합을 구하시오.
		sum=0;
		for(int i = 100 ; i >= 1 ; i--) {
			sum += i;
		}System.out.println(sum +"\n");
		
		// Q. 1부터 100까지 짝수의 합을 출력하시오.
		//방법1, 
		sum=0;
		for(int i = 1 ; i <= 100 ; i++) {
			if(i%2==0) sum+=i;
		}System.out.println(sum +"\n");
		
		//방법2, 횟수가 적어서 더 효율적인 코드.
		sum=0;
		for(int i = 2 ; i <= 100 ; i += 2) {
			sum+=i;
		}System.out.println(sum +"\n");
		
		//역산
		sum=0;
		for(int i = 100 ; i >= 0 ; i -= 2) {
			sum+=i;
		}System.out.println(sum +"\n");
		
		
		
		
		
		// Q. 구구단을 출력해주세요.
		// 예 : 
		/*
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 * ...
		 * */
		System.out.println("구구단");
		for(int i = 1 ; i < 10 ; i++) {
			System.out.println("\n - " + i + "단 - \n");
			for(int j = 1 ; j < 10 ; j++) {
				System.out.println(i + " * " + j + " = " + (i*j) );
			}System.out.println("----------- \n");
		}
		//반복문은 규칙을 찾는게 중요, 모르겠으면 다 풀어서 규칙 찾아보기.
		
		
		
		
		
		// Q. 구구단 전체를 가로로 출력해주세요.
		// 예 : 
		/* \t : 탭
		 * 2 * 1 = 2    3 * 1 = 3   4 * 1 = 4    5 * 1 = 5   ...
		 * 2 * 2 = 4    3 * 2 = 6   4 * 2 = 8    5 * 2 = 10   ...
		 * 2 * 3 = 6    3 * 3 = 9   4 * 3 = 12   5 * 3 = 15   ...
		 */
	
		System.out.println("구구단");
		for(int i = 1; i<10 ; i++) {
			for(int j = 1 ; j<10 ; j++) {
				System.out.print(j + " * " + i + " = " + (i*j) + "\t" );
			}System.out.println();
		}System.out.println();
		
		/*
		//푸는법
		System.out.println("1 * 2 = 2\t");
		System.out.println("2 * 2 = 4\t");
		System.out.println("3 * 2 = 6\t");
		
		for(int i = 2 ; i <= 9 ; i++) {
			System.out.println(i + " * 2 = " + (i * 2) + "\t");
		}
		for(int i = 3 ; i <= 9 ; i++) {
			System.out.println(i + " * 3 = " + (i * 3) + "\t");
		}
		for(int i = 4 ; i <= 9 ; i++) {
			System.out.println(i + " * 4 = " + (i * 4) + "\t");
		}
		
		for(int i = 1; i<10 ; i++) {
			for(int j = 1 ; j<10 ; j++) {
				System.out.print(j + " * " + i + " = " + (i*j) + "\t" );
			}System.out.println();
		}*/
		
		
		
		
		
		// [while문]
		/* while(조건식) {실행문}
		 * - 실행문을 조건식이 만족하는 동안 '계속' 반복하는 문장
		 * - 반복횟수가 정확하지 않을 때 사용함.
		 */
		
		// a에 2씩 몇번을 곱해야 1000이 상이 되는지 알고싶다.
		int a = 1;
		int count =0;
		while(a < 1000) {
			a *= 2;
			count++;
		}System.out.println(count + "번 : " + a + "\n");
		
		
		
		
		// [do-while문]
		/* do{실행문}while(조건식)
		 * - 최소 한 번의 실행이 보장된다.
		 		
		
		a = 1000;
		count =0;
		do{
			a *= 2;
			count++;
		}while(a < 1000);
		System.out.println(count + "번 : " + a + "\n");
		
		
		//숫자맞추기 게임
		Random rnd = new Random();
		int qNum = rnd.nextInt(100);
		int input = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("0부터 99까지의 정수 입력 >> ");
			input = sc.nextInt();
			if(input > qNum) System.out.println(input + "보다 작습니다.");
			else if(input < qNum) System.out.println(input + "보다 큽니다.");
			else System.out.println("정답입니다");
		}while(input != qNum);*/
		
		
		
		
		
		/*
		 * [반복문 예약어]
		 * break; : 가장 가까운 반복문 하나를 빠져나간다.
		 * break 반복문 이름; : 이름에 맞는 반복문을 빠져나간다. 
		 * continue; : 가장 가까운 반복문 하나의 반복 회차를 빠져나간다. 
		 * continue 반복문 이름; : 이름에 맞는 현재 반복 회차를 빠져나간다.
		 * */
		
		// i * j 가 123 이상이 되면 종료.
		outer:for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				//j가 5일때 반복문 모두 종료하시오.
				if(j==5) break outer;
				System.out.println(i + " : " + j);
			}
		}
		
		outer:for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				//j가 5일때 반복문 모두 종료하시오.
				if(j==5) continue outer;
				System.out.println(i + " : " + j);
			}
		}
		// 둘의 차이점 : break 경우 아예 for문 종료, continue는 다음 회차 진행.(4 -> 6)
		
		
		
		
		// Q. 
		
		
		
		
		
		
		
		
		
	}
	
}



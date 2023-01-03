package homework.work03;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요 >> ");
		int Int = Integer.parseInt(input.nextLine());
		
		//삼항연산자
		//System.out.println((Int % 2 == 0) ? "짝수" : "홀수");
			
		//조건문
		if(Int%2==0) System.out.println("짝수");
		else System.out.println("홀수");	
		
		input.close();
	}

}
//입력된 정수가 홀수인지 짝수인지를 출력하는 프로그램을 조건(삼항) 연산자를 사용해서 작성해보자.
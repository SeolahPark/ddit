package homework.work03;

import java.util.Scanner;

public class Exercise32 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int capital=0, population=0, income=0;
		
		System.out.print("수도입니까? (수도 : 1, 수도아님: 0) ");
		capital = Integer.parseInt(input.nextLine());
		System.out.print("총 인구는? (단위: 만) ");
		population = Integer.parseInt(input.nextLine());
		System.out.print("연소득이 1억 이상인 인구는? (단위: 만) ");
		income = Integer.parseInt(input.nextLine());
		
//		String City = ((capital == 1 && population >= 100) || income >= 50) ? "이 도시는 메트로폴리스입니다." : "이 도시는 메트로폴리스가 아닙니다.";
//		System.out.println(City);
		
//		boolean a = capital == 1 && population >= 100;
//		boolean b = income >= 50;
//		System.out.println(a || b ? "이 도시는 메트로폴리스입니다." : "이 도시는 메트로폴리스가 아닙니다.");
////		같은 코드지만 좀 더 이해하기 쉽게 나눠서 코딩. 남들이 봤을 때 이해하기 쉬운 코드가 좋은 코드다.
		
		if(capital == 1 && population >= 100){
			System.out.println("이 도시는 메트로폴리스입니다.");				
		}else if(income >= 50) {
			System.out.println("이 도시는 메트로폴리스입니다.");
			}
		else {
				System.out.println("이 도시는 메트로폴리스가 아닙니다.");
				}
		input.close();

	}

}
/*
 * 메트로폴리스(거대도시)는 다음과 같은 2가지 조건 중 하나를 만족하여야 한다고 가정한다. 
 * 어떤 도시가 메트로폴리스인지를 알아보는 프로그램을 작성하여 보자.(삼항연산자 사용)
 * 1. 한 나라의 수도이고, 인구가 100만 이상이어야 한다. 
 * 2. 연 소득이 1억 이상인 인구가 50만 이상이어야 한다.
*/
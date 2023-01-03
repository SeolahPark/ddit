package personal.pers;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("연도를 입력해주세요. : ");
		String year = input.nextLine();
		int AD = Integer.parseInt(year);
		AD = AD - 543;
		
		System.out.println(AD);
		
		input.close();

	}

}

/*
 * 불교 국가인 태국은 불멸기원(佛滅紀元), 즉 석가모니가 열반한 해를 기준으로 연도를 세는 불기를 사용한다. 
 * 반면, 우리나라는 서기 연도를 사용하고 있다. 불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성하시오.
 */
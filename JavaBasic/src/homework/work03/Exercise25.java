package homework.work03;

import java.util.Scanner;

public class Exercise25 {

	public static void main(String[] args) {
		int num1=0, num2=0, num3=0, num4=0, total=0;
		Scanner input = new Scanner(System.in);
		System.out.print("500원짜리 동전의 갯수 : ");
		String _num1 = input.nextLine();
		num1 = Integer.parseInt(_num1);
		System.out.print("100원짜리 동전의 갯수 : ");
		String _num2 = input.nextLine();
		num2 = Integer.parseInt(_num2);
		
		System.out.print("50원짜리 동전의 갯수 : ");
		String _num3 = input.nextLine();
		num3 = Integer.parseInt(_num3);
		
		System.out.print("10원짜리 동전의 갯수 : ");
		String _num4 = input.nextLine();
		num4 = Integer.parseInt(_num4);
		
		total = num1*500 + num2*100 + num3*50 + num4*10;
		System.out.println("저금통 안의 동전의 총 액수 : " + total);

		
		input.close();
	}

}
//사용자로부터 500원, 100원, 50원, 10원짜리 동전의 갯수를 입력 받아 
//저금통 안에 총 얼마가 들어 있는지 출력하는 프로그램을 만들어 보자.
package homework.book;

import java.util.Scanner;

public class Exer03_02_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("첫 번째 수 : ");
		double fir = Double.parseDouble(input.nextLine());
		System.out.print("두 번째 수 : ");
		double sec = Double.parseDouble(input.nextLine());
		
		if(sec == 0) {
			System.out.println("결과 : 무한대");
		}else {
			System.out.println("결과 : " + fir/sec);
		}
		
		input.close();
	}

}

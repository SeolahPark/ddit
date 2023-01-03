package homework.work04;

import java.util.Random;

public class EvenOdd {

	public static void main(String[] args) {
//		Random rnd = new Random();
//		int change = (rnd.nextInt(5000) + 1) / 10 * 10;
//		System.out.printf("거스름돈 : %d\n", change);
//
//		System.out.println("500원 : " + change / 500 + "개");
//		System.out.println("100원 : " + (change % 500) / 100 + "개");
//		System.out.println("50원 : " + ((change % 500) % 100) / 50 + "개");
//		System.out.println("10원 : " + (((change % 500) % 100) % 50) / 10 + "개");
		
		
		//수업
		Random rnd = new Random();
		int change = (rnd.nextInt(500) + 1) * 10;
		System.out.printf("거스름돈 : %d\n", change);
		
		int coin500 = change / 500;
		change %= 500;
		int coin100 = change / 100;
		change %= 100;
		int coin50 = change / 50;
		change %= 50;
		int coin10 = change / 10;
		change %= 10;
		
		System.out.printf("500원 : %d개\n", coin500);
		System.out.printf("100원 : %d개\n", coin100);
		System.out.printf("50원 : %d개\n", coin50);
		System.out.printf("10원 : %d개\n", coin10);
		

	}

}
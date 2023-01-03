package personal.pers;
import java.util.Scanner;

public class Chess {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int king, queen, look, bishop, knight, phon;
		
		king = Integer.parseInt(input.nextLine());
		queen = Integer.parseInt(input.nextLine());
		look = Integer.parseInt(input.nextLine());
		bishop = Integer.parseInt(input.nextLine());
		knight = Integer.parseInt(input.nextLine());
		phon = Integer.parseInt(input.nextLine());
		
		
		
		input.close();

	}

}

/*
 * 체스는 총 16개의 피스를 사용하며, 
 * 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다. 
 * 동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 
 * 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오. 
 * 첫째 줄에 동혁이가 찾은 흰색 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수가 주어진다. 
 * 이 값은 0보다 크거나 같고 10보다 작거나 같은 정수이다.
*/
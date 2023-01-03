package homework.work03;
import java.util.Scanner;

public class Exercise31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		int first = Integer.parseInt(input.nextLine());
//*		줄 복사 : ctrl + alt + ↑ (or ↓)
//*		줄 이동 : alt + ↑ (or ↓)
		System.out.print("두 번째 숫자를 입력하세요 : ");
		int second = Integer.parseInt(input.nextLine());
		
		//삼항연산자
		//int Big = first > second ? first : second;
		//int Small = Big == first ? second : first;
		//System.out.printf("큰 수를 작은 수로 나눈 몫은 %d이고, 나머지는 %d이다.", Big/Small , Big%Small);
		
		if(first < second){
			int temp = first;
			first = second;
			second = temp;			
		}

		System.out.printf("큰 수를 작은 수로 나눈 몫은 %d이고, 나머지는 %d이다.", first/second , first%second);
		input.close();

	}

}

/*
 * 두 정수를 입력받아 큰 수를 작은 수로 나눈 몫과 나머지를 출력하는 프로그램을 만들어 보자. 
 * 
 * 어떤 수를 0으로 나누는 것은 수학적으로 성립하지 않으므로 
 * 0을 입력하지 않는다고 가정하고 프로그램을 작성
 */

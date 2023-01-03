package homework.work03;
import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		//스캐너 선언 후 어떻게, 어디서 입력 받을지를 지정.
		System.out.print("이름을 입력해주세요. : ");
		String name = input.nextLine();
		//다음 라인에 사용자가 입력한 내용을 스캐너로 읽어옴.
		
		System.out.print("나이를 입력해주세요 : ");
		String age = input.nextLine();
		//다음 라인에 사용자가 입력한 내용을 스캐너로 읽어옴.
		int nextAge = Integer.parseInt(age);
		/*문자열로 읽어온 내용을 정수형으로 형변환해서 정수형으로 선언된 변수에 입력.
		 
		 Integer.parseInt(str); -> 입력받은 값을 int로 변환할 때
		 Float.parseFloat(str); ->입력받은 값을 float로 변환할 때
		 Double.parseDouble(str); -> 입력받은 값을 double로 변환할 때
		 */
		
		System.out.println("");
		System.out.printf("이름 : %s, 현재나이 : %d세, 내년나이 : %d세", name, nextAge, nextAge+1);
		//각각 변수에 있는 내용들을 불러와서 출럭 (%s는 문자, %d는 숫자)

		input.close();
	}

}
// (숙제) 
// 자신의 이름과 나이를 입력받아 변수를 선언 및 초기화 하고 출력하세요
// 예제. 이름 : 홍길동, 현재나이 : 20세, 내년나이 : 21세
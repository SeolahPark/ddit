package b_operator;
import java.util.Scanner;
//* 임포트 하는 단축키 ctrl + shift + o

public class D_Etc {
	
	public static void main(String[] args) {
		//단독 프로그램은 메인 메소드가 있어야 실행이 된다.
		
//		[비트연산자(http://tcpschool.com/java/java_operator_bitwise)]
//		 - | , & , ^ , ~ , << , >>
//		 - 비트 단위로 연산한다. 자바로 만든 단독 프로그램에서는 사용하지만 보통 사용하지 않는다.
		
//		[기타연산자]
//		 - .(참조연산자) : 특정 범위 내에 속해있는 멤버를 지칭할 때 사용한다.
//		 - (type)        : 형변환
//		 - ?(삼항연산자) : (조건식) ? "(조건식이 참일 경우 수행할 문장)" : "(조건식이 거짓일 경우 수행할 문장)"
		int x = 10, y = 20;
		int result = (x > y) ? x : y;
//		앞부분이 false이므로 y값이 result에 들어감.
//		만약 앞부분이 true라면 x값이 result에 들어감.
//		간단한 조건을 행할 때 사용함. 조건문보다 간단하다.
		System.out.println(result);
		
		/*주민등록번호 뒷 자리의 첫 번째 숫자가 1이면 남자, 2면 여자*/	
		int regNo = 1;
		String gender = (regNo == 1) ? "남자" : "여자"; //해당 코드 결과가 남자가 되므로 gender에 남자가 들어감.
		System.out.println(gender);

		regNo = 8;
		gender = (regNo == 1) ? "남자" : (regNo == 2) ? "여자" : "확인불가";
//		해당 코드의 결과값이 1이면 남자, 2면 여자, 이 외 숫자면 확인불가가 출력되도록 한다.
		System.out.println(gender + "\n");
	
		/*한 자리 숫자를 입력받고. 그 숫자가 1이나 3이면 남자를, 2나 4면 여자를, 이 외 숫자를 입력하면 확인불가를 출력해주세요.*/
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요. : ");
		int Num = Integer.parseInt(input.nextLine());
//		.(참조연산자) : 특정 범위 내에 속해있는 멤버를 지칭할 때 사용한다. , '~안에' 라고 이해하면 편함.
		
		String _gender = (Num == 1 || Num == 3) ? "남자" : ((Num == 2 || Num == 4) ? "여자" : "확인불가");
		System.out.println(_gender + "\n");
		input.close();
		
	}
}

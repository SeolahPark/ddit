package b_operator;

import java.util.Random;
import java.util.Scanner;

public class A_ArithmeticOperator {

	public static void main(String[] args) {
		/* 
		 * [산술 연산자]
		 *  - 사칙연산 : +, -, *, /, %(나머지)
		 *  - 복합 연산자 : +=, -=, *=, /=, %=
		 *  - 증감 연산자 : ++, --
		 */
		
		int result = 10 + 20 - (((30 * 40) / 50) % 60);
//		 *, /가 +, - 보다 우선순위가 높다.
		
//		 나머지 연산
		result = 10 / 3 ;
		System.out.println(result);
		result = 10 % 4 ;
		System.out.println(result + "\n"); 
		
//		 5개의 산술 연산자를 사용해서 5개의 연산을 수행해보자.
//		 result = .....
//		 System.out.println(result);
		
		result = 144*35;
		System.out.println(result);
		result = 356 % 32;
		System.out.println(result);
		result = 5438-3842;
		System.out.println(result);
		result = 363456+13508935;
		System.out.println(result);
		result = 1343 / 37;
		System.out.println(result + "\n");
		
//		[복합 연산자]
//		변수에 저장되어있는 값에 연산을 수행할 때 수행할 연산자와 대입 연산자를 병합해서 사용할 수 있다
		
		result = 10;
		result += 10;
		//기존에 있는 result에 10을 더해서 출력.
		System.out.println(result + "\n");
		
		result += 10;
		System.out.println(result);
		result -= 10;
		System.out.println(result);
		result /= 10;
		System.out.println(result);
		result *= 10;
		System.out.println(result);
		result %= 10;
		System.out.println(result + "\n");
		result += 5 + 3 ; 
//		5+3이 먼저 수행되고, 그 값과 result값을 더해줌. = 'result = result + ( 5 + 3 )'
		System.out.println(result + "\n");
		
//		[증감 연산자]
//		증감연산자(++) : 변수의 값을 1 증가시킨다.
//		감소연산자(--) : 변수의 값을 1 감소시킨다.
		
		int i = 0;
		++i; // 전위형 : 변수의 값을 읽어오기 전에 1 증가
		i++; // 후위형 : 변수의 값을 읽어오고 1 증가
		
		i = 0;
		System.out.println("++i = " + (++i)); // 결과값 : 1
//		i를 1 증가 시키고 화면에 출력함. 
		
		i = 0;
		System.out.println("i++ = " + (i++)); // 결과값 : 0
//		i를 증가시키기 전에 화면에 출력하고 그 뒤에 1을 증가시킴
		System.out.println(i + "\n"); 
//		 따라서 해당 i를 다시 출력하는 경우 i값은 1이 됨.
		
		int _int = 10;
		double _double = 3.14;
		double result2 = _int + _double;
//		표현 범위가 다른 두 타입을 연산하는 경우 더 큰 타입으로 형변환 된다.
		System.out.println(result2 + "\n");
		
		byte _byte = 5;
		short _short = 10;
		int result3 = _byte + _short;
//		int보다 작은 타입을 연산하는 경우 int로 형변환 된다.
		System.out.println(result3 + "\n");
		
		char _char1 = 'a';
		char _char2 = 'b';
		int result4 = _char1 + _char2 ;
//		작은 따옴표로 감싼 문자 리터럴은 유니코드로 변환되어 저장된다. char의 경우 정수 타입.
//		int보다 작은 타입을 연산하는 경우 int로 형변환 된다.
		System.out.println(result4 + "\n");
		
		
//		[오버플로우, 언더플로우]
//		표현범위를 벗어나는 값을 표현할 때 발생하는 현상
		byte b = 127;
		b++;
		System.out.println(b);
//		오버플 : byte의 표현 범위는 -128~127까지이므로 범위를 벗어나는 경우 마지막으로 돌아감
		b--;
		System.out.println(b + "\n");
//		언더플 : byte의 표현 범위는 -128~127까지이므로 범위를 벗어나는 경우 마지막으로 돌아감
//		타입을 선택할 때 연산의 범위를 고려해야 한다.
		
//		다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
//		1. 123456 + 654321
//		2. 1번의 결과값 * 123456
//		3. 2번의 결과값 / 123456
//		4. 3번의 결과값 - 654321
//		5. 4번의 결과값 % 123456
		
		long _result = 123456l; 
		_result += 654321;
		_result *= 123456;
		_result /= 123456;
		_result -= 654321;
		_result %= 123456;
		System.out.println("long 최종결과값 : " + _result);
		
		int _result1 = 123456;
		_result1 += 654321;
		_result1 *= 123456;
		_result1 /= 123456;
		_result1 -= 654321;
		_result1 %= 123456;
		System.out.println("int 최종결과값 : " + _result1);
		
		float _result2 = 123456f;
		_result2 += 654321;
		_result2 *= 123456;
		_result2 /= 123456;
		_result2 -= 654321;
		_result2 %= 123456;
		System.out.println("float 최종결과값 : " + _result2);
		
		double _result3 = 123456;
		_result3 += 654321;
		_result3 *= 123456;
		_result3 /= 123456;
		_result3 -= 654321;
		_result3 %= 123456;
		System.out.println("double 최종결과값 : " + _result3 + "\n");
	
//		3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구하세요.
		
		double first = 0, second = 0, third = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요 : ");
		String _first = sc.nextLine();
		first = Double.parseDouble(_first);
		
		System.out.print("점수를 입력해주세요 : ");
		String _second = sc.nextLine();
		second = Double.parseDouble(_second);
		
		System.out.print("점수를 입력해주세요 : ");
		String _third = sc.nextLine();
		third = Double.parseDouble(_third);
		
		double sum = first + second + third ;
		double avg = sum / 3.0;
		
		System.out.printf("합계 : %f", sum);
		System.out.printf("평균 : %f", avg);
		
		sc.close();
		
		int num1=13, num2=27, num3=31;
		int _sum = num1+num2+num3;
		double _avg = sum / 3.0;
//		소수점 아래 숫자가 0이 된다
//		방법1. -> 정수로 저장하고 실수타입 변수에 입력하면 안될...지도?
//		  double avg = sum / 3 ;
//		  
//	    방법2. -> 소수점을 만들고 저장해야함.
//		  double avg = (double)sum / 3 ;
//		
		System.out.println("합계 : " + _sum);
		System.out.println("평균 : " + _avg);
		
//		반올림, 올림, 버림
//		반올림 : Math.round(실수);
//		올림 : Math.ceil(실수);
//		버림 : Math.flood(실수);
		avg = Math.ceil(avg);
		System.out.println(avg+"\n");
		
		avg = sum / 3.0;
//		방법1. -> 소수점 둘째자리까지 보여줌. avg가 변함
//		  avg *= 100;
//		  avg = Math.round(avg);
//		  avg /= 100;
//		  System.out.println(avg);
//		  
//		 방법2. -> 출력시에만 소수점 둘째자리까지 보여줌. 단, avg값은 변하지 않음.
//		  System.out.printf("%.2f", avg);
		
		
//		[랜덤]
//		Math.random() : 0.0 ~ 1.0미만 (0.99999 ...); -> 보안이슈 있어서 사용하지 않음.
		Random rnd = new Random();
//		rnd.nextInt(); => int범위 내의 int가 랜덤으로 출력
//		rnd.nextInt(46); => 46보다 작은 int가 랜덤으로 출력
		System.out.println(rnd.nextInt(46));
		
//		if) 50-99 사이의 숫자를 원하는 경우, ~> (0 ~ 49) + 50 ~> (0 ~ ( 50 - 1 ) + 50 )
		int rNum = rnd.nextInt(50) + 50;
		System.out.println(rNum);
		
		
	}

}

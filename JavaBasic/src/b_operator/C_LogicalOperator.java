package b_operator;

import java.util.Scanner;

public class C_LogicalOperator {

	public static void main(String[] args) {
		/*
		 * [논리 연산자]
		 * &&(AND) ||(OR) !(NOT) ^(XOR)->웹개발에서는 사용하지 않음.
		 */
		
		boolean b = 5 < 10 && (15 % 2 == 0 || 9 >= 5);
		System.out.println("5 < 10 && (15 % 2 == 0 || 9 >= 5) : " + b + "\n");
		boolean _b = 5 < 10 && 15 % 2 == 0 || 9 >= 5;
		System.out.println("5 < 10 && 15 % 2 == 0 || 9 >= 5 : " + _b + "\n");
//		!! 그냥 앞부터 순서대로, 원하는 대로 연산이 되게 하려면 반드시 괄호를 넣어야 한다.
		
//		효율적인 연산
		b = true && true; // true
		b = true && false; // false
		b = false && true; // false
		b = false && false; // false
		
		b = true || true; // true
		b = true || false; // true
		b = false || true; // true
		b = false || false; // false
//		왼쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다.
		
		int d = 0;
		System.out.println(0 == d || 0 == ++d);
//		왼쪽 연산자에서 true 결과가 나왔기때문에 오른쪽은 수행하지 않는다. 따라서 d는 여전히 0
		System.out.println(d + "\n");
		
//		int 타입의 변수 x와 y를 만들고 다음의 문장들을 코드로 작성하시오.
		int x = 0, y = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("x를 입력하시오 : ");
		String _x = input.nextLine();
		x = Integer.parseInt(_x);
		System.out.print("y를 입력하시오 : ");
		String _y = input.nextLine();
		y = Integer.parseInt(_y);
		
//		1. x가 y보다 크고, x가 10보다 작다.
		b = x > y && x < 10;
		System.out.println(b);
//		2. x가 짝수이고, x가 y의 배수이다.
		b = (x % 2 == 0) && (x % y == 0);
		System.out.println(b);
//		3. x가 3의 배수이거나, x가 5의 배수이다.
		b = (x % 3 == 0) || (x % 5 == 0); 
		System.out.println(b);
		

		input.close();

	}

}

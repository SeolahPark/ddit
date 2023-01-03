package homework.work03;

import java.util.Scanner;

public class Exercise21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double width = 0, height=0, area=0, perimeter=0;
		
		System.out.print("가로의 길이는? (단위: m) : ");
		String _width = sc.nextLine();
		width = Double.parseDouble(_width);
		
		System.out.print("세로의 길이는? (단위: m) : ");
		String _height = sc.nextLine();
		height = Double.parseDouble(_height);
		
		area = width * height;
		perimeter = (width+height)*2;
		
		System.out.println("직사각형의 넓이 : " + area);
		System.out.println("직사각형의 둘레 : " + perimeter);
		
		sc.close();

	}

}
/*실수 자료형을 이용하여 직사각형의 둘레와 면적을 구하는 프로그램을 만들어보자. 
 * 실수형 변수 width(가로), height(세로), area(넓이), perimeter(둘레)를 선언하고, 
 * Scanner 클래스를 이용하여 사용자로부터 직사각형의 가로, 세로 길이를 입력받아 
 * 다음과 같이 넓이와 둘레를 출력한다.
 * */
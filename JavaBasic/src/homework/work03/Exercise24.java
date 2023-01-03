package homework.work03;

import java.util.Scanner;

public class Exercise24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius = 0.0, height = 0.0;
		double area = 0.0, volume = 0.0;
		
		System.out.print("원기둥 밑변의 반지름을 입력하시오. (단위: cm): ");
		String _radius = input.nextLine();
		radius = Double.parseDouble(_radius);
		
		System.out.print("원기둥의 높이를 입력하시오. (단위: cm): ");
		String _height = input.nextLine();
		height = Double.parseDouble(_height);
		
		area = radius * radius * Math.PI;
		volume = area * height;
		System.out.println("원기둥 밑변의 넓이는 " + area + "cm^2이고, 원기둥의 부피는 " + volume + "cm^2이다.");

		input.close();
	}

}
//원기둥 밑면의 반지름과 높이를 입력 받아서 밑면의 넓이와 부피를 계산하는 프로그램을 작성하여 보자. 
//원주율은 Math.PI를 사용한다.
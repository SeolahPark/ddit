package e_oop;

public class UserDefinedDataType {

	public static void main(String[] args) {
		//
		// * 사용자 정의 데이터 타입
		// - 데이터의 최종 진화 형태이다. ( 변수 -> 배열 -> 클래스 )
		// - 서로 다른 타입의 데이터를 묶어서 사용하는 것이다.
		// - 변수와 메서드로 구성할 수 있다.
		//

		//
		// 1차형 데이터 관리
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		String name;

		//
		// 2차형 데이터 관리
		int[] score = new int[3]; // kor, eng, math
		int _sum;
		double _avg;
		String name2;

//		//
//		// 3차형 데이터 관리
//		Student student = new Student();
//		student.name = "홍길동";
//		student.kor = 90;
//
//		System.out.println(student.name);
//		System.out.println(student.kor);
//		System.out.println(student);
	}

}

// 3차형 데이터 관리
class Student {
	private int kor, eng, math;
	private int sum;
	private double avg;
	String name;

	Student(int kor, int eng, int math, String name) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.name = name;
		this.sum = sum();
		this.avg = avg();
	}

	private double avg() {
		return (double) sum / 3;
	}

	private int sum() {
		return kor + eng + math;
	}

	// Alt + Shift + s : 코드 자동생성
	@Override
	public String toString() {
		return "Student [kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg=" + avg + ", name="
				+ name + "]";
	}

}

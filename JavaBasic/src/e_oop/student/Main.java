package e_oop.student;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rnd = new Random();
//		Student s1 = new Student("김범수", rnd.nextInt(51) + 50, rnd.nextInt(51) + 50, rnd.nextInt(51) + 50,
//				rnd.nextInt(51) + 50, rnd.nextInt(51) + 50, rnd.nextInt(51) + 50, rnd.nextInt(51) + 50);
//		Student s2 = new Student("나  얼", rnd.nextInt(51) + 50, rnd.nextInt(51) + 50, rnd.nextInt(51) + 50,
//				rnd.nextInt(51) + 50, rnd.nextInt(51) + 50, rnd.nextInt(51) + 50, rnd.nextInt(51) + 50);
//		Student s3 = new Student("박효신", rnd.nextInt(51) + 50, rnd.nextInt(51) + 50, rnd.nextInt(51) + 50,
//				rnd.nextInt(51) + 50, rnd.nextInt(51) + 50, rnd.nextInt(51) + 50, rnd.nextInt(51) + 50);
//		Student s4 = new Student("이  수", rnd.nextInt(51) + 50, rnd.nextInt(51) + 50, rnd.nextInt(51) + 50,
//				rnd.nextInt(51) + 50, rnd.nextInt(51) + 50, rnd.nextInt(51) + 50, rnd.nextInt(51) + 50);
//		Student s5 = new Student("신용재", rnd.nextInt(51) + 50, rnd.nextInt(51) + 50, rnd.nextInt(51) + 50,
//				rnd.nextInt(51) + 50, rnd.nextInt(51) + 50, rnd.nextInt(51) + 50, rnd.nextInt(51) + 50);
//		Student s6 = new Student("하현우", rnd.nextInt(51) + 50, rnd.nextInt(51) + 50, rnd.nextInt(51) + 50,
//				rnd.nextInt(51) + 50, rnd.nextInt(51) + 50, rnd.nextInt(51) + 50, rnd.nextInt(51) + 50);
//
//		System.out.println("이  름\t|국어\t영어\t수학\t사회\t과학\tJava\tOracle\t|합계\t평균\t석차");
//		System.out.println("--------------------------------------------------------------------------------------");
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s4);
//		System.out.println(s5);
//		System.out.println(s6);

		Student[] studentList = new Student[6];
		System.out.println("이  름\t|국어\t영어\t수학\t사회\t과학\tJava\tOracle\t|합계\t평균\t석차");
		System.out.println("--------------------------------------------------------------------------------------");
		for (int i = 0; i < studentList.length; i++) {
			studentList[i] = new Student("null", rnd.nextInt(51) + 50, rnd.nextInt(51) + 50, rnd.nextInt(51) + 50,
					rnd.nextInt(51) + 50, rnd.nextInt(51) + 50, rnd.nextInt(51) + 50, rnd.nextInt(51) + 50);
		}

		studentList[0].setName("김범수");
		studentList[1].setName("나  얼");
		studentList[2].setName("박효신");
		studentList[3].setName("이  수");
		studentList[4].setName("신용재");
		studentList[5].setName("하현우");
		studentList[0].getName();

		studentList[0].setKor(100);
		studentList[0].setEng(100);
		studentList[0].setMath(100);

		for (int i = 0; i < studentList.length; i++) {
			for (int j = 0; j < studentList.length; j++) {
				if (studentList[i].getSum() > studentList[j].getSum()) {
//					studentList[i].setRank(studentList[i].getRank()+1);
					studentList[i].addRank();
				}
			}
		}

		for (int i = 0; i < studentList.length; i++) {
			System.out.println(studentList[i]);
		}
		System.out.println("--------------------------------------------------------------------------------------");
	}

}

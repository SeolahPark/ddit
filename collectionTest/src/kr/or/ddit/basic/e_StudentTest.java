package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class e_StudentTest {
//	숙제
//	문제) 학번, 이름, 국어점수, 영어점수, 수학점수, 총점, 등수를 멤버로 갖는 Student클래스를 만든다.
//	이 클래스의 생성자에서는 학번, 이름, 국어점수, 영어점수, 수학점수만 인수값으로 받아서 초기화 처리를 한다.
//
//	이 Student객체는 List에 저장하여 관리한다.
//
//	List에 저장된 데이터들을 학번의 오름차순으로 정렬할 수 있는 '내부' 정렬 기준을 구현하고,
	
//	1. 총점의 역순으로 정렬하는데 
//	2. 총점이 같으면 이름의 오름차순으로 정렬이 되는 '외부' 정렬 기준 클래스를 작성하여 정렬된 결과를 출력하시오.
	
//	(단, 등수는 List에 전체 데이터가 추가된 후에 구하도록 한다.) -> 어려우면 패스?

	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<Student>();
		Random rnd = new Random();

		student.add(new Student(5, "변학도", rnd.nextInt(50)+51, rnd.nextInt(50)+51, rnd.nextInt(50)+51));
		student.add(new Student(4, "성춘향", rnd.nextInt(50)+51, rnd.nextInt(50)+51, rnd.nextInt(50)+51));
		student.add(new Student(1, "홍길동", rnd.nextInt(50)+51, rnd.nextInt(50)+51, rnd.nextInt(50)+51));
		student.add(new Student(2, "유관순", rnd.nextInt(50)+51, rnd.nextInt(50)+51, rnd.nextInt(50)+51));
		student.add(new Student(3, "이순신", rnd.nextInt(50)+51, rnd.nextInt(50)+51, rnd.nextInt(50)+51));
		
		for(int i=0;i<student.size();i++) {
			student.get(i).setSum(student.get(i).getKor(), student.get(i).getEng(), student.get(i).getMath());
			student.get(i).setAvg(student.get(i).getSum());
		}
		
		int[] ranks = new int[student.size()];

		for (int i = 0; i < student.size(); i++) {
			ranks[i] = 1;
		}
		for (int i = 0; i < student.size(); i++) {
			for (int j = 0; j < student.size(); j++) {
				if (student.get(i).getSum() < student.get(j).getSum()) {
					ranks[i]++;
				}
			}
		}
		
		for(int i=0;i<student.size();i++) {
			student.get(i).setRank(ranks[i]);
		}
		
		System.out.println("정렬 전");
		for(Student stu : student) {
			System.out.println(stu.toString());
		}System.out.println("-------------------------------------------");
		
		Collections.sort(student, new SortAvgDesc());

		System.out.println("정렬 후");
		for(Student stu : student) {
			System.out.println(stu);
		}System.out.println("-------------------------------------------");
		
		
	}
}

class Student implements Comparable<Student>{
	int id;
	String name;
	int kor, eng, math, sum, rank;
	double avg;

	public Student(int id, String name, int kor, int eng, int math) {
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getId() {
		return id;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int kor, int eng, int math) {
		this.sum = kor + eng + math;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(int sum) {
		this.avg = Math.round((double) sum * 10 / 3.0) / 10.0;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public int compareTo(Student stu) {
		return new Integer(this.getId()).compareTo(stu.getId());
	}

	@Override
	public String toString() {
		return "[학번 " + id + "] 이름 : " + name + " 국어 : " + kor + "점 영어 : " + eng + "점 수학 : " + math + "점 " + rank + "등 합계=" + sum + "점 평균=" + avg + "점";
	}
	
}

class SortAvgDesc implements Comparator<Student> {
	@Override
	public int compare(Student stu1, Student stu2) {
		if(stu1.getAvg() > stu2.getAvg()) // 앞에 숫자가 더 크면 안바꿔야함 그래서 음수 반환
			return -1;
		else if(stu1.getAvg() < stu2.getAvg()) // 앞의 숫자가 더 작으면 바꿔야함 그래서 양수 반환
			return 1;
		else
			return stu1.getName().compareTo(stu2.getName());
	}
}

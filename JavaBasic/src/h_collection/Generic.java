package h_collection;

public class Generic {
	Student<Double> s1 = new Student<>(); // 대학생 -> 점수타입 실수
	Student<Integer> s2 = new Student<>(); // 고등학생 -> 점수타입 정수

}

class Student<T> { // 제네릭은 타입을 미리 정하지 않고 사용자에 맞게끔 적어둔것.
	String name;
	T kor, eng, math; // T라는 타입을 가짐
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T getKor() {
		return kor;
	}
	public void setKor(T kor) {
		this.kor = kor;
	}
	public T getEng() {
		return eng;
	}
	public void setEng(T eng) {
		this.eng = eng;
	}
	public T getMath() {
		return math;
	}
	public void setMath(T math) {
		this.math = math;
	}
}
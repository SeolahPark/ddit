package kr.or.ddit.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class e_ListSortTest02 {
	public static void main(String[] args) {
		ArrayList<Member> memList = new ArrayList<Member>();
		
		memList.add(new Member(1, "홍길동", "010-1111-2222"));
		memList.add(new Member(2, "유관순", "010-1234-1234"));
		memList.add(new Member(5, "이순신", "010-1524-2462"));
		memList.add(new Member(9, "성춘향", "010-2351-3463"));
		memList.add(new Member(3, "변학도", "010-1357-8426"));
		memList.add(new Member(6, "일지매", "010-2857-3758"));
		memList.add(new Member(8, "강감찬", "010-1886-2472"));
		
		System.out.println("정렬 전");
		for(Member mem : memList) {
			System.out.println(mem.toString());
		}System.out.println("-------------------------------------------");
		
		Collections.sort(memList); //Member객체에는 내부 정렬 기준이 없어서 오류남. -> compareTo 재정의 후 오류 사라짐
		
		System.out.println("정렬 후");
		for(Member mem : memList) {
			System.out.println(mem); 
		}System.out.println("-------------------------------------------");
		
		// 회원번호로 정렬하기
		for(int i=0;i<memList.size();i++) {
			Collections.sort(memList, new SortNumDesc());
		}
		System.out.println("정렬 후");
		for(Member mem : memList) {
			System.out.println(mem);
		}System.out.println("-------------------------------------------");
	}
}


// 데이터를 저장할 객체 생성,
// 회원관리를 위한 Member 클래스 작성하기.
// ==> 회원 이름을 기준으로 해서 오름차순이 되도록 내부 정렬 기준을 지정하기
// ==> Comparable 인터페이스를 구현한다.
class Member implements Comparable<Member> {
	private int num;		// 회원번호
	private String name; 	// 회원이름
	private String tel; 	// 전화번호
	
	public Member(int num, String name, String tel) {
		this.num = num;
		this.name = name;
		this.tel = tel;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Member [num=" + num + ", name=" + name + ", tel=" + tel + "]";
	}
	
	@Override
	// 이름 기준으로 오름차순 정렬,(this와 비교, this가 앞임)
	public int compareTo(Member mem) {
		return (this.getName().compareTo(mem.getName())); //-> 오름차순
//		return (this.getName().compareTo(mem.getName())) * -1; //-> 내림차순
	}
}

// 회원번호의 내림차순으로 정렬하는 외부 정렬기준 클래스를 이용하여 정렬하시오.
// 클래스명 : SortNumDesc


class SortNumDesc implements Comparator<Member> {
	@Override
	public int compare(Member mem1, Member mem2) {
		// 방법1
//		if(mem1.getNum() > mem2.getNum()) // 앞에 숫자가 더 크면 안바꿔야함 그래서 음수 반환
//			return -1;
//		else if(mem1.getNum() < mem2.getNum()) // 앞의 숫자가 더 작으면 바꿔야함 그래서 양수 반환
//			return 1;
//		else
//			return 0;

		// 방법2 --> 숫자의 경우 빼기를 사용해서 할 수 있음.
//		return mem2.getNum() - mem1.getNum(); // 오름차순
//		return (mem1.getNum() - mem2.getNum()) * -1; // 내림차순

		// 방법3 --> Wrapper Class
//		return new Integer(mem1.getNum()).compareTo(mem2.getNum()); // 오름차순
//		return new Integer(mem1.getNum()).compareTo(mem2.getNum()) * -1; // 내림차순

		// 방법4 --> Wrapper Class
//		return Integer.compare(mem1.getNum(), mem2.getNum()); // 오름차순
		return Integer.compare(mem1.getNum(), mem2.getNum()) * -1; // 내림차순
	}
}
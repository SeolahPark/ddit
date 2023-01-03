package kr.or.ddit.basic;

import java.util.Stack;

public class d_StackTest {
	// 웹브라우저의 앞으로가기, 뒤로가기 기능 구현하기 (stack 이용)
	public static void main(String[] args) {
		Browser b = new Browser();
		
		b.history();
		b.goURL("1. 네이버");
		b.history();
		
		b.goURL("2. 야후");
		b.goURL("3. 구글");
		b.goURL("4. 다음");
		b.history();
		
		System.out.println("뒤로가기 후,");
		b.goBack();
		b.history();
		
		System.out.println("뒤로가기 후,");
		b.goBack();
		b.history();
		
		System.out.println("앞으로가기 후,");
		b.goForward();
		b.history();
		
		System.out.println("새로운 사이트 방문하기");
		b.goURL("5. 네이트");
		b.history();
		
	}
}

class Browser {
	private Stack<String> back; // 이전 방문 내역이 저장될 Stack객체 변수
	private Stack<String> forward; // 다음 방문 내역이 저장될 Stack객체 변수
	private String currentURL; // 현재 페이지 주소가 저장될 변수

	// 생성자
	public Browser() {
		back = new Stack<String>();
		forward = new Stack<String>();
		currentURL = "";
	}

	// 방문할 사이트의 주소를 인수값으로 받아서 해당 사이트에 접속하는 메서드
	public void goURL(String url) {
		System.out.println(url + " 사이트에 접속합니다");
		if (currentURL != null && !"".equals(currentURL)) { // 현재 페이지가 있으면
			back.push(currentURL); // 현재 페이지를 back스택에 저장한다
		}
		currentURL = url; // 현재 페이지 변경
		forward.clear(); // 새로운 사이트 방문시, forward 스택 비우기
	}

	// 뒤로 가기
	public void goBack() {
		// isEmpty() ==> List가 비어있으면 true, 아니면 false
		if (!back.isEmpty()) { // back스택에 값이 있으면
			forward.push(currentURL); // 현재 페이지를 forward스택에 추가한다.
			currentURL = back.pop(); // back스택에서 자료를 꺼내와 현재 페이지로 한다.
		}
	}

	// 앞으로 가기
	public void goForward() {
		if (!forward.isEmpty()) {
			back.push(currentURL);
			currentURL = forward.pop();
		}
	}

	// 방문 기록 확인하는 메서드
	public void history() {
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println("	방		문		기		록");
		System.out.println("-----------------------------------");
		System.out.println("back => " + back);
		System.out.println("현재 => " + currentURL);
		System.out.println("forward => " + forward);
		System.out.println("-----------------------------------");
		System.out.println();
	}
}
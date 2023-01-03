package kr.or.ddit.basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class d_StackQueueTest {
	// 
	// * Stack
	// ㅡ 마지막에 넣은 데이터가 제일 먼저 나간다 (후입선출, LIFO) 
	// ㅡ EX) 이클립스에서 작업하면 스택에 저장.
	// ㅡ EX) 웹브라우저 앞으로가기, 뒤로가기
	// ㅡ EX) call stack
	// 
	// * Queue
	// ㅡ 먼저에 넣은 데이터가 제일 먼저 나간다 (선입선출, FIFO)
	// ㅡ EX) 프린트 등등
	// 
	// * Stack과 Queue는 LinkedList를 이용하여 사용할 수 있다.
	// 
	public static void main(String[] args) {
		//
		// Stack
		// 1. 자료 입력 : push(data)
		// 2. 자료 출력 : pop() 	==> 자료를 꺼내온 후 꺼내온 자료를 Stack에서 삭제한다.
		// 				  peek() 	==> 삭제 없이 자료를 꺼내온다.
		// 
		
		// 객체 생성
		Stack<String> stack = new Stack<String>();				// 방법1. Stack클래스 이용
//		LinkedList<String> stack2 = new LinkedList<String>(); 	// 방법2. LinkedList클래스 이용
		
		stack.push("홍길동");
		stack.push("이순신");
		stack.push("유관순");
		stack.push("일지매");
		
		System.out.println("현재 stack값 : " + stack);
		String data = stack.pop();
		System.out.println(data);
		System.out.println(stack.pop());
		System.out.println("현재 stack값 : " + stack);
		
		stack.push("성춘향");
		System.out.println("현재 stack값 : " + stack);
		System.out.println(stack.pop());
		System.out.println("현재 stack값 : " + stack);
		
		System.out.println("삭제없이 꺼내온 값 : " + stack.peek());
		System.out.println("현재 stack값 : " + stack);
		
		System.out.println("====================================================================");
		
		//
		// Queue
		// 1. 자료 입력 : offer(data)
		// 2. 자료 출력 : poll() 	==> 자료를 꺼내온 후 꺼내온 자료를 Queue에서 삭제한다.
		// 				  peek() 	==> 삭제 없이 자료를 꺼내온다.
		// 
		
		Queue<String> queue = new LinkedList<String>();
		queue.offer("홍길동");
		queue.offer("이순신");
		queue.offer("유관순");
		queue.offer("일지매");
		
		System.out.println("현재 queue의 값 : " + queue);
		data = queue.poll();
		System.out.println(data);
		System.out.println(queue.poll());
		System.out.println("현재 queue값 : " + queue);

		queue.offer("성춘향");
		System.out.println("현재 queue값 : " + queue);
		System.out.println(queue.peek());
		System.out.println("현재 queue값 : " + queue);
		System.out.println();
	}
}

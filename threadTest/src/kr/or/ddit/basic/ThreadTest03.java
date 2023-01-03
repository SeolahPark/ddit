package kr.or.ddit.basic;

public class ThreadTest03 {

	public static void main(String[] args) {
		// 쓰레드가 처리되는 시간을 체크해보자.\
		Thread th = new Thread(new MyRunner()); // 쓰레드를 만들고 인터페이스를 파라미터로 넣어줌.
		long start = System.currentTimeMillis(); // 시작하기 전에 현재 시간을 저장
		
		th.start();
		
		try {
			th.join(); 
			// join : 현재 위치에서 대상이 되는 쓰레드가 끝날때까지 기다린다. (현재 우선순위 : th, 멈추는 대상 : main)
			// 이 때 th가 반복문으로 1~1_000_000_000 까지의 숫자를 더한다.
			// th가 반복문을 끝내면 main이 코드를 실행한다.
		} catch (InterruptedException e) {
			
		}
		
		long end = System.currentTimeMillis(); // 반복문이 끝낼 때의 시간을 저장
		
		System.out.println("걸린 시간 : "+ (end - start)); //-> 메인스레드가 하는 업무
		
	}
}

class MyRunner implements Runnable{

	@Override
	public void run() {
		long sum = 0L;
		
		for(long i=1L; i<=1_000_000_000L; i++) {
			sum += i;
		}
		
		System.out.println("합계 : " + sum);
	}
}
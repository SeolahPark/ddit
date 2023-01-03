package kr.or.ddit.basic;

// 1~20억까지의 합계를 구하는 프로그램을 하나의 스레드가 단독으로 처리할 때와
// 여러개의 쓰레드가 협력해서 처리할 때의 경과시간을 비교해보자

public class ThreadTest04 {

	public static void main(String[] args) {
//		SumThread st1 = new SumThread(            1L, 500_000_000L);
//		SumThread st2 = new SumThread(  500_000_001L, 1_000_000_000L);
//		SumThread st3 = new SumThread(1_000_000_001L, 1_500_000_000L);
//		SumThread st4 = new SumThread(1_500_000_001L, 2_000_000_000L);

		//여러개의 쓰레드가 협력해서 처리할 쓰레드 생성(배열사용)
		SumThread[] sumThArr = new SumThread[] {new SumThread(            1L, 500_000_000L), 
				                             new SumThread(  500_000_001L, 1_000_000_000L),
				                             new SumThread(1_000_000_001L, 1_500_000_000L),
				                             new SumThread(1_500_000_001L, 2_000_000_000L)};
		long start = System.currentTimeMillis();
		for(SumThread th : sumThArr) {
			th.start();
		}
		for(SumThread th : sumThArr) {
			try {
				th.join();
			} catch (InterruptedException e) {
				
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("걸린 시간 : "+ (end - start));
		System.out.println("-----------------------------------------------------------");
		
		// 단독으로 처리하는 쓰레드 생성
		SumThread sm = new SumThread(            1L, 2_000_000_000L);
		start = System.currentTimeMillis();
		sm.start();
		try {
			sm.join();
		} catch (InterruptedException e) {
			
		}
		end = System.currentTimeMillis();
		System.out.println("걸린 시간 : "+ (end - start));
		System.out.println("-----------------------------------------------------------");
		
		
		//---------------------------------------------------------------------------------------------
		
		// 단독으로 처리하는 쓰레드 생성
		sm = new SumThread(1L, 2_000_000_000L);
		start = System.currentTimeMillis();
		sm.start();
		try {
			sm.join();
		} catch (InterruptedException e) {

		}
		end = System.currentTimeMillis();
		System.out.println("걸린 시간 : " + (end - start));
		System.out.println("-----------------------------------------------------------");
		
		//여러개의 쓰레드가 협력해서 처리할 쓰레드 생성(배열사용)
		sumThArr = new SumThread[] {new SumThread(            1L, 500_000_000L), 
				                             new SumThread(  500_000_001L, 1_000_000_000L),
				                             new SumThread(1_000_000_001L, 1_500_000_000L),
				                             new SumThread(1_500_000_001L, 2_000_000_000L)};
		start = System.currentTimeMillis();
		for(SumThread th : sumThArr) {
			th.start();
		}
		for(SumThread th : sumThArr) {
			try {
				th.join();
			} catch (InterruptedException e) {
				
			}
		}
		end = System.currentTimeMillis();
		System.out.println("걸린 시간 : "+ (end - start));
		System.out.println("-----------------------------------------------------------");
	}
}

// 시작값 ~ 종료값 까지의 합계를 구하는 클래스 작성
class SumThread extends Thread{
	private long start, end;
	
	public SumThread(long start, long end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		long sum=0L;
		for(long i=start; i<=end; i++) {
			sum += i;
		}
		System.out.println(start+"부터 "+end+"까지의 합계 : " + sum);
	}
}
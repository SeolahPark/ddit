package kr.or.ddit.basic;

// 3개의 스레드가 각각 알파벳 A ~ Z까지 출력하는데, 출력을 끝낸 순서대로 결과를 나타내는 프로그램을 작성해보자.

public class ThreadTest09 {

	public static void main(String[] args) {
		Alphabet[] threadArr = new Alphabet[] {new Alphabet("1"), new Alphabet("2"), new Alphabet("3")};
		
		for(Alphabet ap : threadArr) {
			ap.start();
		}
		for(Alphabet ap : threadArr) {
			try {
				ap.join();
			} catch (InterruptedException e) {
				
			}
		}
		System.out.println();
		
		System.out.println("경기 결과");
		System.out.println("순위 : " + Alphabet.ranking);
		
	}
}

class Alphabet extends Thread{
	public static String ranking = "";
	private String name;                                                                                                                                                     
	
	
	public Alphabet(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for(char c = 'A'; c<='Z'; c++) {
			try {
				// 난수를 이용해서 일시정지 시킨다.
				Thread.sleep((int) (Math.random()*500) );
			} catch (InterruptedException e) {
				
			}
			System.out.println(name + "의 출력문자 : " + c);
		}
		
		System.out.println(name + " 출력 끝");
		ranking += name+"  ";
		
	}
}
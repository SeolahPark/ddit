package other;

import java.util.Arrays;

public class test {

	/*
	 * 10마리의 말들이 경주하는 경마 프로그램을 작성하시오.
	 * 
	 * 말은 Horse라는 이름의 쓰레드 클래스로 작성하는데
	 * 이 클래스는 말 이름(String), 등수(int), 현재 위치(int)를 멤버변수로 갖는다.
	 * 
	 * 그리고 이 클래스는 등수를 오름차순으로 처리할 수 있는 내부 정렬 기준을 갖는다.
	 * (Comparable 인터페이스를 구현)
	 * 
	 * 경기 구간은 1 ~ 50 구간으로 되어 있다.
	 * (1 ~ 50까지 진행하는 것)
	 * 
	 * 경기중에는 중간중간에 각 말들의 위치를 아래와 같이 나타낸다.
	 * 예)
	 * 		01 번마 : ---->---------------------------------------------
	 * 		02 번마 : -->-----------------------------------------------
	 * 		~~
	 * 		10 번마 : ------>-------------------------------------------
	 * 
	 * 
	 * 경기가 끝나면 등수의 오름차순으로 정렬하여 출력한다.
	 */
	
	public static void main(String[] args) {
		new test().start();
	}
	
	public static boolean isGameEnd = false;
	Horse[] horseList;
	Game game;
	
	public test() {
		
		horseList = new Horse[] {
				new Horse("01번馬"),
				new Horse("02번馬"),
				new Horse("03번馬"),
				new Horse("04번馬"),
				new Horse("05번馬"),
				new Horse("06번馬"),
				new Horse("07번馬"),
				new Horse("08번馬"),
				new Horse("09번馬"),
				new Horse("10번馬")
		};
		
		game = new Game(horseList);
	}
	
	private void start() {
		gameStart();
		printResult();
		
	}
	
	
	// 경주 결과를 출력하는 메소드
	private void printResult() {
		
		game.clearConsole();
		Arrays.sort(horseList);
		
		System.out.println("  === 순위 ===  ");
		for(Horse h : horseList) {
			System.out.println("----------------");
			System.out.println(" " + h.getRank() + "등  :  " + h.getHorseName());
		}
		System.out.println("----------------");
		
	}
	
	
	// 경주를 시작하는 메소드
	private void gameStart() {
		
		// 말 달리기 시작
		for(Horse h : horseList) {
			h.start();
		}
		
		// 경주 현황 출력 시작
		game.start();
		
		// 말들이 모두 결승선에 도착할 때까지 대기
		for(Horse h :horseList) {
			try {
				h.join();
			} catch (InterruptedException e) {}
		}
		
		// 말들이 모두 결승선에 도착하면 게임 끝
		isGameEnd = true;
	}
}


// 경주 현황을 출력해주는 쓰레드 클래스
class Game extends Thread{
	
	private Horse[] horseList;
	
	Game(Horse[] horseList){
		this.horseList = horseList;
	}
	
	@Override
	public void run() {
		
		while(true) {
			// 경주가 끝났을 경우 출력 종료
			if(test.isGameEnd) break;

			clearConsole();
			for(Horse h : horseList) {
				
				System.out.print(h.getHorseName() + " : ");
				
				// 각 포지션에 맞게 ">" 출력
				for(int i = 1; i <= 50; i++) {
					if(h.getCurrPos() == i) {
						System.out.print(">");
					}else {
						System.out.print("-");
					}
				}
				System.out.println();
			}
			
			// 출력 간격 0.5초
			try {
				sleep(500);
			} catch (Exception e) {}
		}
	}
	
	public void clearConsole() {
		for(int i = 0; i < 100; i++) {
			System.out.println();
		}
	}
}


// 달리는 말들을 구현한 쓰레드 클래스
class Horse extends Thread implements Comparable<Horse>{

	private String horseName;
	private int currPos;
	private static int totalRank = 1;
	private int rank;
	
	
	public Horse(String name) {
		this.horseName = name;
		this.currPos = 0;
	}
	
	public String getHorseName() {
		return horseName;
	}

	public int getRank() {
		return rank;
	}

	public int getCurrPos() {
		return currPos;
	}

	@Override
	public void run() {
		
		// 1부터 50까지 열심히 달린다.
		for(int i = 1; i <= 50; i++) {
			this.currPos++;
			
			// 말 객체마다 각자 다른 랜덤의 속도로 달린다.
			try {
				sleep((int)(Math.random() * (800) + 100));
			} catch (InterruptedException e) {}
		}
		
		// 결승선에 도착한 말들은 순위를 매긴다.
		this.rank = totalRank++;
	}
	
	// Arrays.sort 사용을 위한 메소드
	// 순위별 오름차순으로 정렬 

	@Override
	public int compareTo(Horse other) {
		return Integer.compare(this.rank, other.rank);
	}
	
}

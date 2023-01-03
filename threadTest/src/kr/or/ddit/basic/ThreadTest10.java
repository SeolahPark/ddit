package kr.or.ddit.basic;

import java.util.Arrays;

//
// 문제)
// 10마리의 말들이 경주하는 경마 프로그램 작성하기.
// 말은 Horse 쓰레드 클래스로 작성하는데, 말이름(String), 등수(int), 현재위치(int)를 멤버로 갖는다.
// 그리고 이 클래스는 등수를 오름차순으로 처리할 수 있는 내부 정렬기준(Comparable)이 있다.
// 
// 경기 구간은 1 ~ 50 구간으로 되어있다.
// 경기 중에는 중간중간 에 각 말들의 위치를 아래와같이 나타낸다.
// 
// 예시)
// 01번말 : ----->--------------------------------------------
// 02번말 : -------->-----------------------------------------
// 03번말 : -->-----------------------------------------------
// ~~~
// 10번말 : ------------>-------------------------------------
// 
// 경기가 끝나면 등수의 오름차순으로 정렬하여 출력한다.
// 

public class ThreadTest10 {

	public static void main(String[] args) {
		Horse[] horseThread = { 
				new Horse("01번말"), new Horse("02번말"), new Horse("03번말"), 
				new Horse("04번말"), new Horse("05번말"), new Horse("06번말"), 
				new Horse("07번말"), new Horse("08번말"), new Horse("09번말"),
				new Horse("10번말") };
		Rank rank = new Rank(horseThread);

		for (Horse hr : horseThread) {
			hr.start();
		}
		rank.start();

		for (Horse hr : horseThread) {
			try {
				hr.join();
			} catch (InterruptedException e) {
			}
		}
		try {
			rank.join();
		} catch (InterruptedException e) {
		}
		
		System.out.println("\n\n\n\n\n경기 끝");
		
		Arrays.sort(horseThread);
		
		System.out.println("경기 결과");
		for(Horse h : horseThread){
			System.out.println(h);
		}
	}
}

class Rank extends Thread {
	private Horse[] horse;

	public Rank(Horse[] horse) {
		this.horse = horse;
	}

	@Override
	public void run() {
		while (true) {
			if (Horse.current == horse.length) {
				break;
			}
			for(int i=1; i<=50; i++){
				System.out.println();
			}

			for (int i = 0; i < horse.length; i++) {
				System.out.printf("%4s : ", horse[i].getHorsename());
				for (int j = 1; j <= 50; j++) {
					if (horse[i].getPosition() == j) {
						System.out.print(">");
					} else {
						System.out.print("-");
					}
				}
				System.out.println();
			}

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

			}
		}
	}
}

class Horse extends Thread implements Comparable<Horse> {
	public static int current = 0;
	
	private String horsename;
	private int ranking;
	private int position;

	public Horse(String horsename) {
		this.horsename = horsename;
	}

	public String getHorsename() {
		return horsename;
	}

	public void setHorsename(String horsename) {
		this.horsename = horsename;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return ranking + "등 : " + horsename;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			this.position = i;
			try {
				Thread.sleep((int) (Math.random() * 300));
			} catch (InterruptedException e) {

			}
		}
		ranking = ++Horse.current;
	}

	@Override
	public int compareTo(Horse horse) {
		return Integer.compare(this.ranking, horse.ranking);
	}

}
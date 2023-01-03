package homework.work05;

import java.util.Random;

public class W04 {
// 주사위를 던져서 각 면이 나오는 횟수를 출력하는 프로그램을 만들어 보자. 
// 주사위를 던지는 동작은 1부터 6까지의 임의로 만들어내는 난수 발생기(Random 객체)가 대신한다. 
// 난수 발생기를 10,000번 호출하여 각 면이 나타나는 횟수를 계산하여 배열에 저장한다. 
// 확률 이론에 의하면 주사위의 각각의 면들이 거의 동일한 횟수로 나와야 한다.
// 아래 그림과 똑같은 값이 나오지 않고 컴퓨터마다 값이 다르게 나오는 것이 정상이다.

	public static void main(String[] args) {
		int[] dice = new int[6];
		int rndNum = 0;
		int temp = 0;
		Random rnd = new Random();

		for (int i = 0; i < 10000; i++) {
			rndNum = rnd.nextInt(dice.length) + 1;
			dice[rndNum - 1]++;
		}

		for (int i = 0; i < dice.length; i++) {
			System.out.printf((i + 1) + "이 나온 횟수 : %d\n", dice[i]);
			temp += dice[i];
		}
		System.out.println("총 실행 횟수 : " + temp);

	}

}

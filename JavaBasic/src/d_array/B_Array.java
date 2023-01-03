package d_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class B_Array {

	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner input = new Scanner(System.in);
		/*
		 * [배열] 
		 * - 여러개의 값을 하나의 변수에 저장해서 사용하는 것이다. 
		 * - 참조형 타입이다. 
		 * - 인덱스로 값을 구분한다 
		 * - 길이를 변경할 수 없다.
		 */

//		기존 int형 변수 6개 선언방법
//		int num1, num2, num3, num4, num5, num6;

//		배열
		int[] intArray; // 배열의 주소를 저장할 공간이 만들어진다.
		intArray = new int[5]; // 배열이 선언되고 그 주소가 저장된다. (= intArray = {1, 2, 3, 4, 5}; ) 
		System.out.println(intArray[0]); // 배열의 순서는 0부터 시작이다.
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
//		System.out.println(intArray[5]); // java.lang.ArrayIndexOutOfBoundsException 에러. 배열은 5개인데 6개를 출력했기 때문에

		/*
		 * [타입별 기본값]
		 *
		 * char : '\u0000'
		 * byte, short, int : 0 
		 * long : 0L 
		 * float : 0F 
		 * double : 0.0
		 * boolean : false (0) 
		 * 참조형변수(예,String) : null ("" X)
		 */

		intArray = new int[] { 1, 2, 3, 4, 5 }; // 초기화하면서 배열의 길이가 자동으로 5개가 됨.
		System.out.println(intArray[0]);
		intArray[0] = 10;
		System.out.println(intArray[0]);
		System.out.println();

		int[] array = { 1, 2, 3, 4, 5 }; // int[] array = new int[] {1,2,3,4,5}; new int는 생략가능
		int[] arr1;
		arr1 = new int[] { 1, 2, 3, 4, 5 };
	
		arr1 = new int[5]; // => {0, 0, 0, 0, 0} 값이 들어감
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
		
		
		/* 이전 방법 : 합계 및 평균을 구해라. */
		int i1 = 10;
		int i2 = 20;
		int i3 = 30;
		int i4 = 40;
		int i5 = 50;
		int sum = i1 + i2 + i3 + i4 + i5;
		double avg = sum/5.0;
		
		/* 배열 방법 : 합계 및 평균을 구해라. */
		sum = 0;
		int[] score = new int[] { 10, 20, 30, 40 ,50 };
		for(int i = 0 ; i < score.length ; i++) {
			sum += score[i];
		}
		avg = (double)sum / score.length;
		System.out.println(sum);
		System.out.println(avg+"\n");
		
		boolean[] bArray = {true, false, 1>2};
		int[] arr2 = new int[5]; 
//		arr2 ,,,, => arr2 ~> 6 으로 변경하고싶음
//		arr2.length = 6; //불가능. 변경 할 수 없음
		
		
		/* 문제1. 10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요. */
		int[] tenNum = new int[10];
		
		/* 문제2. 위에서 만든 배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요. */
		for(int i = 0; i < tenNum.length ; i++) {
			tenNum[i] = rnd.nextInt(100) + 1;
		}
		System.out.println(Arrays.toString(tenNum));
		
		/* 문제3. 배열에 저장된 모든 값의 합계와 평균을 구해주세요.*/
		int total = 0; // 합계
		double avg2 = 0; // 평균
		for(int i = 0 ; i < tenNum.length ; i++) {
			total += tenNum[i];
		}
		avg2 = (double)total/tenNum.length;
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg2 + "\n");
		
//		/* 문제4. 배열에 저장된 값들 중 최소값과 최대값을 출력해주세요. */
//		
//		for(int i = 0 ; i < tenNum.length ; i++) {
//			for(int j = 0 ; j < i ; j++) {
//				if(tenNum[j+1] < tenNum[j]) {
//					int temp = tenNum[j+1];
//					tenNum[j+1] = tenNum[j];
//					tenNum[j] = temp;
//				}
//			}
//		}System.out.printf("최소값 %d, 최대값 %d",tenNum[0],tenNum[9]);
//	
//		
//		int max = tenNum[0];
//		int min = tenNum[0];
//		
//		for(int i=0 ; i < tenNum.length ; i++) {
//			if(tenNum[i] > max) max = tenNum[i];
//			if(tenNum[i] < min) min = tenNum[i];
//			System.out.printf(i+"번쨰 : min %d, max %d\n", min , max);
//		}System.out.printf("최소값 %d, 최대값 %d", min , max);
		
		
//		/* 배열의 값을 섞는 방법 */
//		String[] names = {"홍길동", "이순신", "유관순", "김유신", "아이유"};
//		System.out.println(Arrays.toString(names));
//		
//		for(int i=0 ; i < 5 ; i++) {
//			int rndIndex = rnd.nextInt(names.length); // => 0~4 범위의 숫자가 나옴
//			String tmp = names[rndIndex];
//			names[rndIndex] = names[0];
//			names[0] = tmp;
//			System.out.println(Arrays.toString(names));
//		}
		
//		/* 1 ~ 6 사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요. */	
//		int[] Dice = new int[6];
//		int rndNum = 0;
//		
//		for(int i=0 ; i<500 ; i++) {
//			rndNum = rnd.nextInt(5) + 1;
//			if(rndNum==1) Dice[0]++;
//			if(rndNum==2) Dice[1]++;
//			if(rndNum==3) Dice[2]++;
//			if(rndNum==4) Dice[3]++;
//			if(rndNum==5) Dice[4]++;
//			if(rndNum==6) Dice[5]++;
//			rndNum = rnd.nextInt(Dice.length)+1;
//			Dice[rndNum-1]++;
//			 if) r=1, dice[1-1]++ => dice[0]++
//
//		}
//		
//		System.out.printf("1: %d번, 2: %d번, 3: %d, 4: %d번, 5: %d번, 6: %d번",
//				Dice[0], Dice[1], Dice[2], Dice[3], Dice[4], Dice[5]);
//		for(int i=0 ; i<Dice.length ; i++) {
//			System.out.printf((i+1)+"이 나온 횟수 : %d\n", Dice[i]);
//		}
		
		System.out.println("--------------------------------------------------------------");
		
		
		
//		/*문제 5. 21~50 사이의 랜덤값을 650번 생성하고, 각 숫자가 생상된 횟수를 출력해주세요.
//		1~30 ==> (0~29)+1*/
//	
//		int tmp=0;
//		int[] newDice = new int[30];
//		int rndNum = 0;
//		
//		for(int i=0 ; i<650 ; i++) {
//			//rndNum = rnd.nextInt(30)+1;
//			//Dice[rndNum-1]++;
//			rndNum = rnd.nextInt(newDice.length)+21;
//			newDice[rndNum-21]++;
//		}
//		
//		for(int i=0 ; i<newDice.length ; i++) {
//			System.out.printf((i+21)+"이 나온 횟수 : %d\n", newDice[i]);
//			tmp += newDice[i];
//		}
//		System.out.println(tmp);
		
		
		
//		문제 6. 위 형태의 문제에서 최소값, 최대값, 반복횟수를 입력받아 각 숫자가 생성된 횟수를 출력해주세요.
//		(옵션1 : 최소값보다 작은 최대값을 입력하면 다시 입력받아보기.
//		(옵션2 : 반복횟수가 음수면 다시 입력 받아보기.
		
		int[] newDice = new int[30];
		int rndNum = 0;
		int min = 0, max = 0, count = 0;
		
		System.out.print("최소값(21~)을 입력하세요 : ");
		min = input.nextInt();
		System.out.print("최대값(~50)을 입력하세요 : ");
		max = input.nextInt();
		System.out.print("반복횟수를 입력하세요 : ");
		count = input.nextInt();
		
		//옵션1
		while(min > max){
			System.out.print("최대값을 다시 입력하세요 : ");
			max = input.nextInt();
		}
		
		//옵션2
		while(0 >= count){
			System.out.print("반복횟수를 다시 입력하세요 : ");
			count = input.nextInt();
		}
		
		for(int i = 0 ; i < count ; i++) {
			rndNum = rnd.nextInt(newDice.length)+21;
			newDice[rndNum-21]++ ;
			
		}

		System.out.printf("최소(%d)값 반복 횟수 : %d \n최대(%d)값 반복 횟수 : %d\n", min, newDice[min-21], max, newDice[max-21]);
		input.close();
	}

}








//		배열의 크기를 랜덤하게 만들 수 있나? : 가능.
//		int[] Test = new int[rnd.nextInt(9)+1];
//		
//		for(int i=0 ; i<Test.length ; i++) {
//			Test[i] = rnd.nextInt(Test.length)+1;
//			Test[i]++;
//
//		}
//		for(int i=0 ; i<Test.length ; i++) {
//			System.out.printf((i+1)+"이 나온 횟수 : %d\n", Test[i]);
//			tmp += Test[i];
//		}
//		
//		System.out.println();
//		System.out.println(Test.length);
//		System.out.println(tmp);

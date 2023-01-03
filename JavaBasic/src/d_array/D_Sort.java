package d_array;

import java.util.Arrays;
import java.util.Random;

public class D_Sort {

//	 정렬 
//	 - 석차 구하기 : 점수를 비교해 작은 점수의 등수를 증가시키는 방식 
//	 - 선택정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는 방식 
//	 - 버블정렬 : 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식 
//	 - 삽입정렬 : 두 번째 숫자부터 앞의 숫자들과 비교해서 큰 수는 뒤로 밀고 중간에 삽입하는 방식

	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(100) + 1;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("--------------------------------------------------------------");

		// 메서드는 소문자로 시작, 반드시 뒤에 ()가 붙음. 해당 ()안에 변수를 넣어줌.
		// bubbleSort(arr); // 버블정렬 -> 왠만하면 다 느리지만 특정 소스에서는 빠를 수 있음.
		// insertSort(arr); // 삽입정렬 -> 로직이 어려움. 이런게 있구나 정도로만.
		// selectSort(arr); // 선택정렬 -> 매번 전체를 비교해야하므로 가장 오래걸림.
		printRanks(arr); // 석차내기 -> 정렬은 아님, 순위를 출력하고 싶을 때 사용
		// System.out.println("최종결과 : " + Arrays.toString(arr));

	}

	private static void printRanks(int[] arr) {
		// score = {5,3,4,1}
		// rank = {1,3,2,4}

		// 순위를 나타나기 위한 배열을 선언함
		// 배열의 길이는 순위를 구하려는 배열의 길이와 같음
		int[] ranks = new int[arr.length]; // {0,0,0,0,...,0}

		for (int i = 0; i < ranks.length; i++) {
			ranks[i] = 1; // {1,1,1,1,...,1}
			// 순위를 나타내는 배열의 모든 값에 1을 입력함.
			// 누구와도 비교하지 않았기 때문에 모두 1등임
		}
		// 순위를 구하려는 배열의 for문을 작성
		for (int i = 0; i < ranks.length; i++) {
			// 다른 값들과의 비교하기 위해 순위를 구하려는 배열을 중첩for문을 작성.
			for (int j = 0; j < ranks.length; j++) {
				if (arr[i] < arr[j]) {
					ranks[i]++;
					// arr = {50, 100, 80}
					// ranks = {1,1,1} => {2,1,1} => {3,1,1} => {3,1,2}
				}
			}
			System.out.println((i + 1) + "회전 : " + Arrays.toString(arr));
		}
		for (int i = 0; i < ranks.length; i++) {
			System.out.printf("%2d점 : %2d등\n", arr[i], ranks[i]);
		}
	}

	private static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i; // 가장 작은 숫자의 위치
			// 비교한 대상이 가장 작은 수라는 가정으로 매 회전 시작
			for (int j = i + 1; j < arr.length; j++) { // 나를 다시 비교 할 필요가 없기 때문에 i+1로 시작
				// 비교대상 다음 순서부터 끝 순서까지 비교대상과 크기를 비교
				if (arr[j] < arr[min]) {
					// 만약 비교대상보다 특정위치(j)의 값이 더 작다면 가장 작은 값의 위치는 j위치다.
					min = j; // 값 자체를 의미하는게 아니라 자리수를 의미
				}
			}
			int tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;
			System.out.println((i + 1) + "회전 : " + Arrays.toString(arr));
		}

	}

	private static void insertSort(int[] arr) {
		// 반복횟수만을 위한 for문
		// 반복 횟수는 배열의 길이 -1 만큼으로 버블정렬과 동일하나, 시작위치가 첫번째(0) 위치가 아닌 두 번째(1) 부터
		for (int i = 1; i < arr.length; i++) {
			int pick = arr[i]; // 비교대상값을 임시저장함.
			int j = 0;
			for (j = i - 1; j >= 0; j--) {
				// 반복은 비교 대상 앞 번호부터 앞으로 하나씩 비교한다.
				if (arr[j] > pick) {
					// 임시저장한 값보다 현재 비교대상의 값이 크다면
					arr[j + 1] = arr[j];
					// 현재 비교대상의 값을 뒤로 한 칸 밀고 비교를 계속한다.
				} else {
					break; // 해당 회전을 종료한다.
				}
			}
			arr[j + 1] = pick;
			// 값을 변경한 마지막 위치
			// (값을 변경하지 않았다면 j의 마지막 번호)
			// 뒤에 복사한 값을 덮어씌운다.
			System.out.println((i + 1) + "회전 : " + Arrays.toString(arr));
		}

	}

	private static void bubbleSort(int[] arr) {
		// 반복횟수만을 위한 for문, 반복 횟수는 배열의 -1만큼
		for (int i = 0; i < arr.length - 1; i++) {
			boolean changed = false; // 교환이 일어나는지 확인.

			// 1회전씩 반복 될수록 큰 숫자들이 맨 뒤로 옮겨져 있으므로 맨 뒤에서 i 갯수만큼의 숫자는 비교 할 필요가 없음
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					changed = true;
				}
			}
			System.out.println((i + 1) + "회전 : " + Arrays.toString(arr));
			if (changed == false) { // 교환이 일어나지 않았다면
				break; // 반복을 종료해라
			}
		}
	}

}
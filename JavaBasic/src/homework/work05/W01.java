package homework.work05;

public class W01 {
// 다음 배열에서 최댓값과 최솟값을 구하시오.

	public static void main(String[] args) {
		int[] num = { 3, 94, 16, 8, 76, 94, 82, 47, 59, 38 };

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length - 1; j++) {
				if (num[j+1] < num[j]) {
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		System.out.printf("최소값 %d, 최대값 %d", num[0], num[9]);

	}

}


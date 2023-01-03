package kr.or.ddit.basic;

import java.util.ArrayList;

public class c_ArrayList04 {
	// 문제2)
	// 5명의 별명을 입력받아 ArrayList에 저장한 뒤 이들 중 별명의 길이가 제일 긴 별명을 출력하시오. (단, 별명의 길이는 같을 수 있다)

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			System.out.print("별명을 입력하시오 : ");
			arr.add(ScanUtil.nextLine());
		}

		int max = arr.get(0).length();
		for (int i = 1; i < arr.size(); i++) {
			if (max < arr.get(i).length()) {
				max = arr.get(i).length();
			}
		}
		ArrayList<String> arr2 = new ArrayList<String>();
		for (int i = 0; i < arr.size(); i++) {
			if (max == arr.get(i).length()) {
				arr2.add(arr.get(i));
			}
		}System.out.println(arr2.toString());

		System.out.println("====================================================================");

		ArrayList<String> aliasList = new ArrayList<String>();

		System.out.println("별명 5개 입력하세요");
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "번째 별명 : ");
			aliasList.add(ScanUtil.nextLine());
		}
		
		//제일 긴 별명의 길이가 저장될 변수를 선언하고 첫번째 별명의 길이를 저장함.
		int maxLength = aliasList.get(0).length();
		for (int i = 1; i < aliasList.size(); i++) {
			if (maxLength < aliasList.get(i).length()) {
				maxLength = aliasList.get(i).length();
			}
		}

		//제일 긴 별명의 길이와 같은 길이를 가진 별명들을 출력
		System.out.println("제일 긴 별명들 ... ");
		for(String alias : aliasList) {
			if(alias.length() == maxLength) {
				System.out.println(alias);
			}
		}
	}
}

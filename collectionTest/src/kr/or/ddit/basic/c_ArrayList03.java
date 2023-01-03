package kr.or.ddit.basic;

import java.util.ArrayList;

public class c_ArrayList03 {
	// 문제1)
	// 5명의 별명을 입력받아 ArrayList에 저장한 뒤 이들 중 별명의 길이가 제일 긴 별명을 출력하시오. (단, 별명의 길이는 모두 다르게 입력한다)

	//	int length() : 문자열의 길이를 반환한다.
	//	String split() : 문자열을 특정 문자를 기준으로 나누어 배열형태로 반환한다.
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			System.out.print((i+1)+"번째 '길이가 서로 다른' 별명을 입력하시오 : ");
			arr.add(ScanUtil.nextLine());
		}

		// 길이비교
		int max = arr.get(0).length();
		for (int i = 1; i < arr.size(); i++) {
			if (max < arr.get(i).length()) {
				max = arr.get(i).length();
			}
		}
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).length() == max) {
				System.out.println(arr.get(i));
			}
		}

//		// 정렬
//		String tmp = arr.get(0);
//		for (int i = 0; i < arr.size(); i++) {
//			for (int j = 0; j < arr.size(); j++) {
//				if (arr.get(i).length() < arr.get(j).length())
//					tmp = arr.get(j);
//			}
//		}
//		System.out.println(tmp);

		System.out.println("====================================================================");

		ArrayList<String> aliasList = new ArrayList<String>();

		System.out.println("길이가 서로 다른 별명 5개 입력");
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "번째 별명 : ");
			aliasList.add(ScanUtil.nextLine());
		}
		
		String maxAlias = aliasList.get(0);
		for (int i = 1; i < aliasList.size(); i++) {
			if(aliasList.get(i).length() == maxAlias.length()) {
				maxAlias = aliasList.get(i);
			}
		}System.out.println(maxAlias);

	}
}

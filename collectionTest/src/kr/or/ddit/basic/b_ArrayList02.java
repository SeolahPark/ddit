package kr.or.ddit.basic;

import java.util.ArrayList;

// 문제) 5명의 사람 이름을 입력받아서 ArrayList에 저장한 후 
// 		 이들 중 '김'씨 성의 이름을 모두 출력하시오.
public class b_ArrayList02 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			System.out.print("이름을 입력하시오 : ");
			arr.add(ScanUtil.nextLine());
		}
		
//		for (String s : arr) {
//			if (s.contains("김"))
//				System.out.print(s + " ");
//		}
		
//		for (int i = 0; i < arr.size(); i++) {
//			if (i == arr.indexOf("김"))
//				System.out.print(arr.get(i));
//		}
		
//		for (int i = 0; i < arr.size(); i++) {
//			if (i == arr.("김"))
//				System.out.print(arr.get(i));
//		}
		
		System.out.println("김씨 성을 가진 사람들");
		// 방법1
		for (String s : arr) {
			// substring(0, 1) : 0번 인덱스'부터' 1번 인덱스 '전까지' 추출.
			if (s.substring(0, 1).equals("김"))
				System.out.print(s + " ");
		}System.out.println();
		
		// 방법2
		for (String s : arr) {
			if (s.indexOf("김") == 0)
				System.out.print(s + " ");
		}System.out.println();
		
		// 방법3
		for (String s : arr) {
			if (s.startsWith("김"))
				System.out.print(s + " ");
		}System.out.println();
		
		// 방법4
		for (String s : arr) {
			if (s.charAt(0)=='김')
				System.out.print(s + " ");
		}
		
	}
}
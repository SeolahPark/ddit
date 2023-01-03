package h_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ListScoreBook {

	public static void main(String[] args) {
//		김범수 나얼 박효신 이수 신용재 하현우 총 여섯명의 
//		국어 수학 영어 과학 코딩 점수를 각 0~100까지의 랜덤값으로 입력하고,
//		학생별 평균을 구하세요. (List와 Map 사용)
//		
//		-------------------원점수-------------------
//		학생명	국어	수학	영어	과학	코딩
//		김범수	 87		 68		 56		 87		 87
//		나얼	 87		 68		 56		 87		 87
//		박효신	 87		 68		 56		 87		 87
//		이수	 87		 68		 56		 87		 87
//		신용재	 87		 68		 56		 87		 87
//		하현우	 87		 68		 56		 87		 87
//		--------------------------------------------
//		-----------------평균점수---------------------------
//		학생명	국어	수학	영어	과학	코딩	평균
//		김범수	 87		 68		 56		 87		 87		 00
//		나얼	 87		 68		 56		 87		 87		 00
//		박효신	 87		 68		 56		 87		 87		 00
//		이수	 87		 68		 56		 87		 87		 00
//		신용재	 87		 68		 56		 87		 87		 00
//		하현우	 87		 68		 56		 87		 87		 00
//		----------------------------------------------------
//		
//		(tip)

		String[] type = { "학생명", "국어", "영어", "수학", "과학", "코딩", "평균" };
		String[] names = { "김범수", "나  얼", "박효신", "이  수", "신용재", "하현우" };
		// 길이 6, index 5까지
		List<Map<String, Object>> userList = new ArrayList<>();
		Map<String, Object> user = new HashMap<>();

		for (int i = 0; i < 6; i++) {
			user = new HashMap<>();
			user.put(type[0], names[i]);
			for (int j = 1; j < type.length - 1; j++) {
				user.put(type[j], (new Random().nextInt(50) + 51));
			}
			int sum = 0;
			for (String key : user.keySet()) {
				sum = (key.equals("학생명") || key.equals("평균")) ? (sum + 0) : (sum + (int) user.get(key));
			}
			double avg = (double) sum / (type.length - 2);
			user.put(type[type.length - 1], avg);
			userList.add(user);
		}
//		System.out.println(userList);
		
		System.out.println("------------------- 원점수 -------------------");
		for (int i = 0; i < type.length-1; i++) {
			System.out.print(type[i] + "\t");
		}System.out.println();
		for (int i = 0; i < names.length; i++) { // userList의 길이만큼 == 학생수.
			System.out.print(names[i] + "\t");
			for (int j = 1; j < type.length - 1; j++) { // type의 길이-2만큼 == 과목수
				System.out.print((int) userList.get(i).get(type[j]) + "\t");
			}System.out.println();
		}System.out.println("----------------------------------------------");

		System.out.println();
		System.out.println("---------------------- 평균점수 ----------------------");
		for (int i = 0; i < type.length; i++) {
			System.out.print(type[i] + "\t");
		}System.out.println();
		for (int i = 0; i < names.length; i++) { // userList의 길이만큼 == 학생수.
			System.out.print(names[i] + "\t");
			for (int j = 1; j < type.length - 1; j++) { // type의 길이-2만큼 == 과목수
				System.out.print((int) userList.get(i).get(type[j]) + "\t");
			}
			System.out.println(userList.get(i).get(type[type.length-1]));
		}System.out.println("------------------------------------------------------");

	}

}

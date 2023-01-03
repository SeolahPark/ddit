package h_collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayListClass {
	
	// 
	// * 컬레션프레임워크 자주 쓰는 함수 *
	// boolean add(Object o)			: 마지막 위치에 객체를 추가 후 성공여부를 반환한다.
	// void add(int i, Object o)		: 지정된 위치에 객체를 추가한다.
	// Object set(int i, Object o)		: 지정된 위치에 객체를 저장한 후 기존 객체를 반환한다.	arr[0] = 1	-> list.set(0,1);
	// Object get(int i)				: 지정된 위치의 객체를 반환한다. 						arr[0] 		-> list.get(0)
	// int size()						: 지정된 객체의 수를 반환한다.							arr.length 	-> list.size();
	// boolean remove(int i)			: 지정된 위치의 객체를 제거한다.						
	// 
	// ArrayList 선언할 때 길이를 지정하지 않는다. add로 뒤에 더해준다
	// 사용자가 배열을 어렵지 않게 사용할 수 있도록 만들어둔게 ArrayList
	
	public static void main(String[] args) {
		List list = new ArrayList(); // 삽입과 삭제의 속도가 느린 대신 불러올 때 편하다
//		List list2 = new LinkedList(); -> 지금은 안씀. 삽입과 삭제가 간편한 대신 속도가 느리다
		
		list.add("abc"); // 파라미터 : Object
		list.add(100);
		list.add(new Scanner(System.in));
		
		// 제네릭을 저정하지 않으면 넣을때는 편하지만 꺼낼때는 타입을 예측하기 어렵다.
		// 따라서 제네릭(= 박스 라벨링)의 사용이 권장된다.
		List<Integer> list2 = new ArrayList</*생략가능:Integer*/>();
		list2.add(10); // 파라미터 : Integer

		list2.add(20);
		System.out.println(list2.add(20));
		System.out.println(list2);
		
		list2.add(1, 40);
		System.out.println(list2);
//		list2.add(10, 40);
//		System.out.println(list2); //-> java.lang.IndexOutOfBoundsException: Index: 10, Size: 4
		
		int before = list2.set(2, 50);
		System.out.println("before : " + before);		
		System.out.println("after : " + list2.get(2));		
		
		System.out.println(list2);
		for(int i=0;i<list2.size(); i++) {
			System.out.println(i + " : " + list2.get(i));
			list2.remove(i);
			// 배열과 달리 삭제되면 자리가 하나씩 앞으로 당겨진다. 그래서 0번인덱스인 10이 지워지고 2번인덱스에 있던 50이 1번인덱스에 들어온다.
			// 따라서 내용을 지우고싶으면 뒤에서부터 지워야한다.
		}
		System.out.println(list2);
		
		for (int i = list2.size() - 1; i >= 0; i--) {
			System.out.println(i + " : " + list2.get(i));
			list2.remove(i);
		}
		System.out.println(list2);
				
		
		
		//예제1) list3에 1부터 100까지 랜덤값을 10개 저장해주세요.
		List<Integer> list3 = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list3.add(new Random().nextInt(100) + 1);
		}
		System.out.println(list3);
		
		
		//예제2) list3에 저장된 값의 합계와 평균을 구해주세요.
		int sum = 0;
		double avg = 0;
		for (int item : list3) {
			sum += item;
		}
		avg = (double) sum / list3.size();
		System.out.println("합계 : " + sum + ", 평균 : " + avg);
		
		
		//예제3) list3에서 최솟값과 최댓값을 구해주세요. 
		int min = list3.get(0); // 1
		int max = list3.get(0); // 100
				
		for(int item : list3) {
			if(min > item) min = item;
			if(max < item) max = item;
		}
		System.out.println("최소값 : " + min + ", 최대값 : " + max);
		System.out.println("--------------------------------------");
		
		

		//예제4) list3을 오름차순으로 정렬해주세요. sort() 미사용.
//		for (int i = 0; i < list3.size(); i++) {
//			for (int j = i + 1; j < list3.size(); j++) {
//				if (list3.get(i) > list3.get(j)) {
//					int tmp = list3.set(j, list3.get(i));
//					list3.set(i, tmp);
//				}
//			}
//		}
//		System.out.println(list3);

		// 개발자라면 정렬은 이렇게 하는거다.
		Comparator<Integer> c = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 > o2) {
					return 1;
				} else if (o1 == o2) {
					return 0;
				} else {
					return -1;
				}
			}
		};
		list3.sort(c);
		System.out.println(list3);
		
	}

}

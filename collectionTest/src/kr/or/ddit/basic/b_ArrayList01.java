package kr.or.ddit.basic;

import java.util.ArrayList;

public class b_ArrayList01 {
	public static void main(String[] args) {
		// ArrayList는 기본적인 사용법이 Vector와 같다.
		
		ArrayList list1 = new ArrayList();
		
		list1.add("aaa");
		list1.add("bbb");
		list1.add(123);
		list1.add('k');
		list1.add(true);
		list1.add(123.45);
		
		System.out.println("list1 : " + list1.toString());
		System.out.println("size : " + list1.size());
		
		//get()메서드로 꺼내온다
		System.out.println("1번째 자료 : " + list1.get(1));
		
		//데이터 끼워넣기도 같다
		list1.add(3, "Zzz");
		System.out.println("list1 : " + list1.toString());
		
		//데이터 변경하기
		String temp = list1.set(3, "Xxx").toString();
		System.out.println("temp : " + temp);
		System.out.println("list1 : " + list1.toString());
		
		//삭제도 같다
		list1.remove(3);
		System.out.println("list1 : " + list1.toString());
		
		list1.remove("bbb");
		System.out.println("list1 : " + list1.toString());
		System.out.println("-------------------------------------------------------");
		
		// 제네릭
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("aaa");
		list2.add("bbb");
		list2.add("ccc");
		list2.add("ddd");
		list2.add("eee");
		
		for(int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i));
		}System.out.println("-------------------------------------------------------");
		for(String z : list2) {
			System.out.println(z);
		}
		
		// * boolean contains(비교객체) * 
		// ==> List에 '비교객체'가 있으면 true, 없으면 false를 반환한다.
		System.out.println("'ddd' 값 존재 여부 : "+ list2.contains("ddd")); //->true
		System.out.println("'fff' 값 존재 여부 : "+ list2.contains("fff")); //->false
		
		// * indexOf(비교객체), lastIndexOf(비교객체) *
		// ==> List에 '비교객체'가 있으면 '비교객체'가 있는 위치값을 반환한다.
		// ==> indexOf()는 검색을 앞 -> 뒤 방향으로 하고, lastIndexOf()는 검색을 뒤 -> 앞 방향으로 한다.
		
		System.out.println("'ddd'의 위치값 : " + list2.indexOf("ddd"));
		System.out.println("'ddd'의 위치값 : " + list2.lastIndexOf("ddd"));
		System.out.println();
		System.out.println("'kkk'의 위치값 : " + list2.indexOf("kkk"));
		System.out.println("'kkk'의 위치값 : " + list2.lastIndexOf("kkk"));
		System.out.println("-------------------------------------------------------");
		
		// * toArray() *
		// ==> List안의 데이터를 배열로 변환하여 반환한다.
		// ==> 반환값은 기본적으로 Object형 배열로 반환한다.
		
		// * toArray(new 제네릭타입['배열크기']) * ?????????????????????????????? 꼭 [0]이라고 써야하는지? 
		// ==> 제네릭타입의 배열로 반환한다.
		Object[] strArr = list2.toArray();
//		String[] strArr = (String[])list2.toArray();
		
		System.out.println("배열의 크기 : " + strArr.length );
		for(int i=0;i<strArr.length;i++) {
			System.out.println(i+"번째 자료 : "+strArr[i]);
		}
		
		String[] strArr2 = list2.toArray(new String[0]);
		for(String str : strArr2 ) {
			System.out.println(str);
		}
	}
}

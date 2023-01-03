package kr.or.ddit.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class CollectionTest {
	//
	// * 컬렉션 프레임워크 *
	//
	// 널리 알려져 있는 자료구조를 사용해서 객체들을 효율적으로
	// 추가, 삭제, 검색 할 수 있도록 인터페이스와 구현 클래스를
	// java.util 패키지에서 제공한다.
	// 이들을 총칭해서 컬렉션 프레임워크라고 한다.
	//
	// 컬렉션 프레임워크의 주요 인터페이스로는 [List, Set, Map]이 있다.
	// 이러한 인터페이스 List, Set, Map으로 사용 가능한 컬렉션 클래스는 다음과 같다.
	//
	// [ List ]
	// - ArrayList
	// - LinkedList
	// - vector
	//
	// [ Set ]
	// - HashSet
	// - TreeSet
	//
	// [ Map ]
	// - HashMap
	// - HashTable
	// - TreeMap
	// - Properties
	//

	// [ List ]
	//
	// List컬렉션은 배열과 비슷하게 객체를 인덱스로 관리한다.
	// 배열과의 차이점은 저장용량이 자동으로 증가, 객체를 저장할 때 자동으로 인덱스가 부여된다.
	// 추가, 삭제, 검색을 위한 메소드가 있다.
	//
	// 1) ArrayList
	//
	// ArrayList는 꼭 제네릭 타입이 있거나 없거나해도 된다.
	// index 0번부터 차곡차곡 쌓아가야한다.
	// 초기 default 메모리 공간 길이는 10이다.
	//

	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println("새로 만든 List의 길이 : " + list.size()); // .size() 는 들어있는 데이터의 길이!
		list.add(1); 			// index 0
		list.add(1, "STR"); 	// index 1
		// list.add(3, 10); -> 순서가 있는데 순서를 안지켜서 오류남.

		System.out.println(list.toString());

		// 1.수정 : list index 1번째 있는 STR을 str로 바꾸자
		Object o = list.set(1, "str");
		System.out.println(o);
		System.out.println(list.toString());
		list.add(200); 			// index 2
		list.add("name");		// index 3

		// list 인덱스 3에 있는 값을 "-"로 수정
		list.set(3, "-");
		System.out.println(list.toString());

		
		// 2.삭제 : list 안에 있는 값을 삭제
		list.remove(1); 		// index로 삭제
		list.remove("-"); 		// 값으로 삭제
		System.out.println(list.toString());
		
		
		// 문제.
		// 임의의 데이터 5개를 추가 하고 .get() 함수를 이용해서 index 1,3,4번째 데이터를 출력하시오. 
		
		list.add("e");
		list.add("l");
		list.add("e");
		list.add("m");
		list.add("t");
		
		System.out.println(list.toString());
		System.out.println("[1] : " + list.get(1) + ", [3] : " + list.get(3) + ", [4] : " + list.get(4));
		System.out.println("\n\n");
		
		// 제네릭을 지정하지 않으면 값을 꺼낼때는 굉장히 불편하다........................
		// 제네릭 사용 권장!
		List<String> list2 = new ArrayList<String>();
		List<Integer> list3 = new ArrayList<>();  // 쓰지 않아도 앞에서 선언한 제네릭을 자동으로 따라간다
		
		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("D");
		list2.add(4, "E");
		System.out.println("새로 만든" + list2.toString());
		System.out.println("F를 추가해봅시다. 결과는? : "+ list2.add("F")); // add의 리턴타입은 boolean, 값을 검증할 때 편하다.
		System.out.println("새롭게 list2에 G를 추가 " + list2.add("G"));
		System.out.println("전체 : " + list2.toString());
		System.out.println("list2의 길이 : " + list2.size()); // List의 길이를 가져온다.
		
		list3.add(100); // 0번에 100 추가
		list3.add(200); // 1번에 200 추가
		list3.add(300); // 2번에 300 추가
		list3.add(123); // 4번에 123 추가
		list3.add(202); // 5번에 202 추가
		
		for (int i = 0; i < list2.size(); i++) {
			System.out.print("list2 : (" + i + ")번째 : " + list2.get(i) + " ");
		}
		System.out.println();
		for (int i = 0; i < list3.size(); i++) {
			System.out.print("list3 : (" + i + ")번째 : " + list3.get(i) + " ");
		}
		System.out.println("\n");

		// 문제1) list2 짝수번째 값 ddit로 수정하고 수정된 값을 출력해주세요.
		for (int i = 0; i < list2.size(); i += 2) {
			list2.set(i, "ddit");
		}
		System.out.println(list2.toString());
		// 문제2) list3 값 모두를 더한 총합, 평균을 구하고 출력해주세요.
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < list3.size(); i++) {
			sum += list3.get(i);
			avg = (double) sum / list3.size();
		}
		System.out.println("총합 : " + sum + ", 평균 : " + avg);
		System.out.println();
		
		// 
		// 2) Vector
		// - Vector 는 ArrayList와 동일한 구조를 가진다.
		// - 동기화된 메서드로 구성되어 있어 멀티스레드가 동시에 메서드를 실행할 수 없고, 
		//   하나의 스레드가 메서드를 실행 완료 해야만, 다른 메서드를 실행할 수 있다.
		//   멀티 스레드 환경에서 안전하게 데이터를 추가, 삭제, 수정 할 수 있다.
		// 
		Vector vect = new Vector();
		vect.add(100);
		vect.add("AA");
		vect.add(200);
		vect.set(1, "BB");
		System.out.println(vect.toString());
		System.out.println();
		
		// 
		// 3) LinkedList
		// 
		// 	List 구현 클래스로 ArrayList와 사용 방법은 같으나 내부구조가 다르다.	
		//	ArrayList와 같이 내부 배열에 객체를 저장해서 관리하는게 아닌
		//	인접 참조를 링크해서 체인처럼 관리한다.
		//		
		List<String> list4 = new LinkedList<String>();
		for (int i = 0; i < 20; i++) {
			list4.add(0, String.valueOf(i));
			System.out.print(list4.get(0)+ " ");
		}System.out.println(list4.size());
		System.out.println();
		// 
		// 최종 List정리
		//			
		// List는 add(index), add(index, value), set(index, value), remove(index), remove(value)
		// 함수를 이용하여 데이터를 가용할 수 있다.
		// 
		//-----------------------------------------------------------------------------------------------//
		
		// 
		// 2. Set (주머니)
		// 
		// - Set은 저장 순서가 없다
		// - 객체를 중복해서 저장 할 수 없고, 하나의 null만 저장 할 수 있다.
		// - Set은 인덱스로 개체를 관리하지 않는다.
		// - Iterator라는 녀석을 이용하여 개체를 꺼내올 수 있다. (순차적으로)
		// 
		// Iterator
		// - hasNext() : 가져올 객체가 있으면 true, 없으면 false 리턴
		// - next() : 컬렉션에서 하나의 객체를 가져온다.
		// - remove() : 객체를 제거한다.
		// - 
		// 1) HashSet
		//	- Set 인터페이스의 구현 클래스로, 객체들의 순서 없이 저장하고 동일한 객체는 중복 저장하지 않는다.
		//	- Set은 객체를 저장하기 전에 먼저 저장된 객체와 새로 넣을 객체의 hashCode를 비교하여 동일한 해시코드인지를 먼저 확인한다.
		//	- 그리고 다시 equals 메서드로 두 객체를 비교해서 동일한 객체로 판단되었을때는 중복 저장하지 않는다.
		// 
		Set<String> set = new HashSet<String>();
		set.add(new String("100")); 		// 값에 대한 ① hashcode -> ② equals메서드 를 사용해서 동일한 객체인지를 판단한다.
		set.add(new String("100")); 		// 값에 대한 ① hashcode -> ② equals메서드 를 사용해서 동일한 객체인지를 판단한다.
		set.add("200");
		set.add("300");
		set.add("400");
		set.add("500"); 
		System.out.println(set.toString());
		System.out.println(set.hashCode());
		System.out.println(set.size());
		
		// Set은 get() 메서드를 지원하지 않으므로 Iterator를 사용해야한다.
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) { // set 안에 객체를 다 찾을때까지 while이 작동한다.
			System.out.println("Set iterator로 꺼내는 중 : " + iterator.next());
		}System.out.println();
		
		// 
		// 3. Map (반=클래스)
		// 
		// Map은 키와 값으로 구성된 Map.Entry 객체를 저장하는 구조.
		// 키는 중복으로 저장할 수 없지만 값은 중복으로 저장이 가능하다.
		// 
		// 1) HashMap
		// 		HashMap은 Map인터페이싕 대표적인 구현 컬렉션
		//		Map은 키가 중복되면 안되서 hashCode()와 equlas() 메서드가 중복되지 않게 
		// 		처리하는 기능으로 재정의 되어있다.
		// 		모든 컬렉션이 그렇듯 제네릭 타입은 기본타입을 사용할 수 없다.
		// 
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("오윤균", 100);
		map.put("홍효림", 99);
		map.put("홍지은", 98);
		map.put("정준석", 97);
		map.put("조현준", 90);
		
		// Map에서 데이터를 꺼내올때는 get() 메서드를 사용하고, get() 메서드 파라미터 값으로 key를 전달한다.
		// ex) get(key) = get("오윤균");
		System.out.println(map.get("홍지은"));
		
	
		// Map의 key를 모르는 경우, Map에 담긴 자료 "전체"를 하나씩 순차적으로 꺼내봅시다 => Set 사용. (if, 하나만 꺼낼때는 .get(key);
		// (방법1)
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key1 = keyIterator.next();
			Integer num = (Integer) map.get(key1);
			System.out.println("[방법1] Map에 들어있는 데이터 : " + num);
//			System.out.println(map.get(key1));
		}System.out.println();
		
		// (방법2)
		 Set<Entry<String, Object>> entry = map.entrySet();
		 Iterator<Entry<String,Object>> iter = entry.iterator();
		 String key = "";
		 String value = "";
		 while(iter.hasNext()) {
			 Map.Entry<String, Object> ent = iter.next();
			 key = ent.getKey();
//			 value = String.valueOf(ent.getValue());
			 value = String.valueOf(map.get(key));
			 System.out.println("[방법2] Map에 들어있는 데이터 : " + value);
		 }
	}
}

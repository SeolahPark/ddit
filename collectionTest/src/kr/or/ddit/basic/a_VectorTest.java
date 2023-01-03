package kr.or.ddit.basic;

import java.util.Vector;

//< 고급자바 >
//
//* 수업내용 : 프레임워크, 스레드, 입출력 -> 화면이 아닌 파일에 저장, 네트워크 -> 다른 컴퓨터와 통신을 주고받음, DB연동(JDBC 뿐만 아니라 다른 라이브러리도 사용함), 서블릿...
// 	 + 중프
//
//
//* 컬렉션(List, Set, Map) 쓰는 이유
// - 많은 양의 데이터를 보관, 관리해주는 객체임.
// - 한개의 데이터는 변수에 저장, 데이터가 많아지면 배열 등에 저장 => 변수 및 배열의 단점을 보완한게 프레임워크
//     ex) 배열의 길이가 지정되어 있어서 불편하다 -> List로 단점 보완
//
//* 벡터 vs 리스트
// - 벡터는 스레드 사용시 동기화 처리가 자동으로 된다. -> 무겁다. (=메모리를 많이 차지한다.) 요즘은 잘 안씀

public class a_VectorTest {

	// 데이터 추가 : boolean add(추가할 데이터) => 보통은 객체만 저장한다.
	// 데이터 추가 : addElement(추가할 데이터) => 이전 버전에 사용하던 명령어
	// 데이터 추가 : add(index, data) : 해당하는 index에 data를 끼워넣는다. 반환값은 X
	// 데이터 추출 : get(index) : 해당하는 index에 data를 반환한다.
	// 데이터 수정 : set(index, 새로운 데이터) : 새로운 데이터가 index번째 데이터를 덮어쓴다. 반환값 : 원래 데이터
	// 데이터 삭제하기 : remove(index) : 새로운 데이터가 index번째 데이터를 덮어쓴다.
	// 데이터 삭제하기 : remove(index) : '삭제할데이터'를 찾아서 삭제한다. 여러개이면 맨 앞에서부터 삭제한다.

	public static void main(String[] args) {
		// 객체 생성
		Vector v1 = new Vector();

		System.out.println("선언 후 초기 v1의 크기 : " + v1.size());

		// 데이터 추가 add(추가할 데이터)
		// ==> 보통은 객체만 저장한다.
		// ==> 반환값 : boolean
		v1.add("데이터추가1");
		v1.add(new Integer(123)); // -> 예전에는 8가지 기본타입 일반데이터를 박싱해서 저장했다.
		v1.add(123); // -> 객체가 아닌 일반데이터도 저장은 가능하다. 그럼 자동으로 박싱해준다.(오토박싱)
		// <래퍼 클래스>
		// - boolean : Boolean
		// - char : Character
		// - byte : Byte
		// - short : Short
		// - int : Integer
		// - long : Long
		// - float : Float
		// - double : Double
		v1.add('a'); // ->char
		v1.add(3.14); // ->double
		boolean r = v1.add(true); // ->boolean
		System.out.println("반환값 : " + r);
		System.out.println("데이터 추가 후 현재 크기 : " + v1.size());
		System.out.println("-----------------------------------------------------------------------------");
		
		// 데이터 추가 addElement(추가할 데이터)
		// ==> 이전 버전에 사용하던 명령어
		v1.addElement("CCC");
		System.out.println("v1 : " + v1);
		System.out.println("-----------------------------------------------------------------------------");
		
		// 데이터 추가 add(index, data)
		// ==> 해당하는 index에 data를 끼워넣는다.
		// ==> 반환값 X
		v1.add(3, "test");
		System.out.println("v1 : " + v1);
		System.out.println("-----------------------------------------------------------------------------");
		
		// 데이터 꺼내오기 : get(index)
		// ==> 해당하는 index에 data를 반환한다.
		int tmp1 = (int) v1.get(2);
		String tmp2 = v1.get(3).toString();
		System.out.println("v1[2] : " + tmp1);
		System.out.println("v1[3] : " + tmp2);
		System.out.println("-----------------------------------------------------------------------------");
		
		// 데이터 수정하기 : set(index, 새로운 데이터)
		// ==> 새로운 데이터가 index번째 데이터를 덮어쓴다.
		// ==> 반환값 : 원래 데이터
		tmp2 = v1.set(3, "new data").toString();
		System.out.println(tmp2 + "에서 변경된 v1[3]의 값 : " + v1.get(3));
		System.out.println("-----------------------------------------------------------------------------");
		
		// 데이터 삭제하기 : remove(index)
		// ==> 'index'번째 데이터를 삭제한다.
		// ==> 반환값 : 삭제된 데이터
		v1.remove(0);
		System.out.println("v1[0] 삭제 후 v1 : " + v1);
		tmp2 = v1.remove(0).toString();
		System.out.println("v1[0] 삭제 후 v1 : " + v1);
		System.out.println("삭제된 데이터 : "+tmp2);
		System.out.println("-----------------------------------------------------------------------------");
		
		// 데이터 삭제하기 : boolean remove(삭제할데이터)
		// ==> '삭제할데이터'를 찾아서 삭제한다. 여러개이면 맨 앞에서부터 삭제한다.
		// ==> 삭제할 데이터가 '정수형'이거나 'char형'일 경우에는 반드시 객체형으로 박싱해야한다.
		v1.remove("CCC");
		System.out.println("'CCC' 삭제 후 v1 : " + v1);
//		v1.remove(123); //-> 'java.lang.ArrayIndexOutOfBoundsException' : 오버로딩. '123'을 지우는게 아니라 인덱스 123번째를 지워라 라고 인식함.
		v1.remove(new Integer(123)); //-> 따라서 박싱해야함.
		System.out.println("'123' 삭제 후 v1 : " + v1);
		v1.remove(new Character('a')); //-> char형은 문자가 아닌 코드값으로 바뀌어 저장됨. 따라서 char타입도 박싱해야함.
		System.out.println("'a' 삭제 후 v1 : " + v1);
		v1.remove(true);
		System.out.println("'true' 삭제 후 v1 : " + v1);
		System.out.println("-----------------------------------------------------------------------------");
		
		
		// * 제네릭 타입(Generic Type)
		//  ==> 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 방식. 
		//  ==> 객체를 선언할 때 < > 안에 그 객체의 내부에서 사용할 데이터의 타입을 정해주는 것을 말한다.
		//  ==> 이런식으로 객체를 선언하게 되면, 그 지정된 데이터 타입 이 외의 데이터를 저장 할 수 없다.
		//		(이 때 제네릭으로 선언될 수 있는 데이터 타입은 '클래스형'이다. 즉 int는 Integer ,...)
		//  ==> 제네릭 타입으로 선언하게 되면 데이터를 꺼내올 때 별도의 형변환이 필요없다.
		
		
		Vector<String> strV = new Vector<String>();		// String 자료들만 저장할 수 있다.
		Vector<Integer> intV = new Vector<Integer>();	// int 자료들만 저장할 수 있다.
		
		strV.add("안녕하세요");
//		strV.add(123); //-> 오류 : 제네릭 불일치[ The method add(int, String) in the type Vector<String> is not applicable for the arguments (int) ]
		String temp = strV.get(0); // 형변환 안해줘서 문제 없음.
		System.out.println("temp : " + temp); 
		
		Vector<Vector> vv = new Vector<Vector>();
		Vector<Vector<Vector>> vvv = new Vector<Vector<Vector>>();
		System.out.println("-----------------------------------------------------------------------------");
		
		// 전체 데이터 삭제 : clear()
		strV.clear(); 
		System.out.println(strV); 
		
		strV.add("AAA");
		strV.add("BBB");
		strV.add("CCC");
		strV.add("DDD");
		strV.add("EEE");
		
		Vector<String> strV2 = new Vector<String>();
		
		strV2.add(strV.get(0));
		System.out.println(strV2);
		
		// 데이터 삭제하기 : removeAll ( Collection객체 )
		// ==> 'Collection객체'가 가지고 있는 데이터를 모두 삭제한다.
		// ==> 반환값 : boolean
		strV.removeAll(strV2);
		System.out.println(strV);
		System.out.println("-----------------------------------------------------------------------------");
		
		strV.clear();
		strV.add("AAAAA");
		strV.add("BBBBB");
		strV.add("CCCCC");
		strV.add("DDDDD");
		strV.add("EEEEE");

		// 벡터의 데이터를 순서대로 모두 가져와 사용하고 싶으면 반복문을 사용하면 된다. 주로 for문을 사용
		for (int i = 0; i < strV.size(); i++) {
			System.out.println((i+1) + "번째 자료 : " + strV.get(i));
		}
		System.out.println("-----------------------------------------------------------------------------");
		
		// 향상된 for문
		for(String str : strV) {
			System.out.println(str);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

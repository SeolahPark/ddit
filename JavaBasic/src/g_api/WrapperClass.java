package g_api;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {
	// 
	// * Wrapper 클래스 *
	//  - 기본형 타입을 객체로 사용해야 할 때 대신 사용하는 클래스
	//  - 컬레션프레임워크를 사용할 때 래퍼클래스를 사용한다.
	//
	//  - boolean	: Boolean
	//  - char		: Charact
	//  - byte		: Byte
	//  - short		: Short
	//  - int		: Integer
	//  - long		: Long
	//  - float		: Float
	//  - double	: Double
	// 
	public static void main(String[] args) {
		int a = 0;
//		a. -> 자료형 그 자체이기때문에 a에 포함된 메소드들이 없음.
		
		Integer iw = new Integer(a); // 박싱
		iw.toString();
		int b = iw; // 언박싱
		
		System.out.println(Integer.TYPE + " / " + Integer.SIZE + "bit");
		
		
//		List<객체ok 기본형x> 변수명 = new ArrayList<객체>();
		List<Integer> list = new ArrayList<Integer>();
		List<Object> list2 = new ArrayList<Object>();
//		List<int> list = new ArrayList<int>();
		// 컬렉션프레임워크에는 객체만 담을 수 있다.
		
		list.add(iw);
		
		int[] list3 = new int[0];
		
	}

}

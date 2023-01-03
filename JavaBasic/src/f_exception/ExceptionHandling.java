package f_exception;

import java.util.concurrent.TimeUnit;
import e_oop.ScanUtil;

public class ExceptionHandling {

	//
	// * 에러 *
	// . 컴파일 에러 : 컴파일 할 때 발생되는 에러 (빨간줄) , 문법적으로 맞지 않는 에러
	// . 논리적 에러 : 실행은 되지만 의도와 다르게 동작하는 경우 발생되는 에러 (버그)
	// . 런타임 에러 : 실행시에 발생되는 에러
	//
	// * 런타임 에러 *
	// . 런타임에러 발생시 발생한 위치에서 프로그램이 비정상적으로 종료된다.
	// . 에러 : 프로그램코드에 의해 수습될 수 없는 심각한 오류 (처리불가)
	// . 예외 : 프로그램코드에 의해서 수습될 수 있는 다소 미약한 오류 (처리가능)
	//
	// * 예외 *
	// . 모든 예외는 Exception 클래스의 자식 클래스이다.
	// . RuntimeException 클래스와 그 자식들은 예외처리가 강제되지 않는다.
	// . (RuntimeException 클래스와 그 자식들을 제외한)Exception 클래스의 자식들은 예외처리가 강제된다.
	//
	// * 예외처리(try-catch) *
	// . 예외처리를 통해 프로그램이 비정상적으로 종료되는 것을 방지할 수 있다.
	// . try {} catch(Exception e) {}
	// . try 블럭 안의 내용을 실행하는 중 예외가 발생하면 catch로 넘어간다.
	// . catch안의 () 안에는 처리할 예외를 지정해줄 수 있다.
	// . 여러종류의 예외를 처리할 수 있도록 catch는 하나 이상 올 수 있다.
	// . 발생한 예외와 일치하는 catch블럭 안의 내용이 수행된 후 try-catch를 빠져나간다.
	// . 발생한 예외와 일치하는 catch가 없을 경우 예외는 처리되지 않는다.
	//

	public static void main(String[] args) {
//		int input = ScanUtil.nextInt();
//		문자열 입력시 java.lang.NumberFormatException 예외.

//		예외처리 강제되는 예시.
//		try {
//			TimeUnit.SECONDS.sleep(1); // -> Unhandled exception type InterruptedException ~ try/catch로 해결
//		} catch (NumberFormatException e) {
//			System.out.println("넘버포맷 에러임.");
//		} catch (InterruptedException e) {
//			System.out.println("타임유닛 에러임.");
//		} catch (Exception e) { // -> 이거 하나만으로도 캐치 가능. 따라서 맨 위에 있으면 아래 코드들이 오류남
//			e.printStackTrace(); // -> 오류가 난 부분을 추적해줌.
//		}

		try {
			int result = 10 / 0;
			System.out.println(result);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // -> 여러개 입력 가능
			e.printStackTrace(); // 에러메세지를 출력한다.
			System.out.println("숫자를 0으로 나눌 수 없습니다.");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace(); // 에러메세지를 출력한다.
		} catch (NullPointerException e) {
			// 아무 조치도 하지 않지만 프로그램이 종료되지 않는다.
		} catch (Exception e) {
			// 예상치 못한 모든 에러 처리.
			e.printStackTrace();
		}

		System.out.println("프로그램 정상 종료!");
	}

}

package g_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		String str = "2022-10-05";
		Date today = new Date();
		System.out.println(today);
		
		// date 객체를 보기 편한 문자열로 변환
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(today));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss.SSS");
		// HH : 24h 표기법. hh : 12h 표기법
		System.out.println(sdf2.format(today));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		System.out.println(sdf3.format(today));
		
		
		// w : 올해의 몇번째 주? W : 이번달의 몇번째 주? E : 오늘의 요일 a : am,pm
		// dd : 05일, d : 5일
		SimpleDateFormat sdf4 = new SimpleDateFormat("yy-MM-dd(E)w hh:mm:ss a");
		System.out.println(sdf4.format(today));
		
		// Oracle : 2022/10/05
		// Mysql : 2022-10-05
		
		// 문자열 -> 날짜 객체 반환
		String str1 = "2000년 08월 01일";
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy년 MM월 dd일");
		try {
			Date datestr = sdf5.parse(str1);
			System.out.println(datestr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar cal = Calendar.getInstance(); // 싱글톤 패턴 -> 프로그램을 사용하면서 캘린더라는 객체는 단 하나만 만들 수 있음.
//		cal = new Calendar(); -> 따라서 new로 사용하면 에러.
		
		cal.setTime(today);
		System.out.println(sdf3.format(cal.getTime()));
		cal.set(2020, 10, 1);
		// 캘린더에서 월은 0부터 시작, 따라서 10 -> 11월
		System.out.println(sdf3.format(cal.getTime()));
		
		// 날짜 계산
		cal.add(Calendar.YEAR, 1); // 년
		System.out.println(sdf3.format(cal.getTime()));
		cal.add(Calendar.MONTH, 2); // 월
		System.out.println(sdf3.format(cal.getTime()));
		cal.add(Calendar.DAY_OF_MONTH, 3); // 일
		System.out.println(sdf3.format(cal.getTime()));
		
		cal.add(Calendar.HOUR, 4); // 시
		System.out.println(sdf3.format(cal.getTime()));
		cal.add(Calendar.MINUTE, 40); // 분
		System.out.println(sdf3.format(cal.getTime()));                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
		cal.add(Calendar.SECOND, 400); // 초
		System.out.println(sdf3.format(cal.getTime()));
		
		
		
		
		
		
		
		
		
		
		
	}

}

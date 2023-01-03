package personal;

public class Ect {

	public static void main(String[] args) {
//		ans1();
		int val1 = 123456;
		int val2 = 654321;
		int val3 = 234567;
		
		ans2(123456);
		ans2(123456+654321);
		ans2(123456+654321-234567);
	}
	
	public static void ans2(int second) {
		// 86400 => 60 * 60 * 24 => 1일
		int day = second / 86400;	// 일 수(몇 일) 3.234일
		// 86400 * day : 초
		// _day1 => .234
		int _day1 = second - (86400 * day);
		int hour = (_day1) / 3600;
		int min = ((_day1) % 3600) / 60;
		int sec = ((_day1) % 3600) % 60;
		System.out.println("(123,456초 이후)");
		System.out.printf("%d일 %02d:%02d:%02d\n\n", day, hour, min, sec);
	}
}
	
	/*public static void ans1() {
		int day = 0;
		int hour = 00;
		int min = 00;
		int sec = 00;
		
		System.out.printf("현재 시간 : %d일 %02d:%02d:%02d\n\n", day, hour, min, sec);
		
		//86400 => 60 * 60 * 24 => 1일
		day = 123456 / 86400;	//일수(몇일) 3.234일
		//86400 * day : 초
		//_day1 => .234
		int _day1 = 123456 - (86400 * day);
		hour = (_day1) / 3600;
		min = ((_day1) % 3600) / 60;
		sec = ((_day1) % 3600) % 60;
		System.out.println("(123,456초 이후)");
		System.out.printf("%d일 %02d:%02d:%02d\n\n", day, hour, min, sec);

		
		int _day2 = 654321 - (86400 * (654321 / 86400));
		sec += ((_day2) % 3600) % 60;
		if(sec >= 60) {
			sec -= 60;
			min += 1;
		}
		min += ((_day2) % 3600) / 60;
		if(min >= 60) {
			min -= 60;
			hour += 1;
		}
		hour += (_day2) / 3600;
		if(hour >= 24) {
			hour -= 24;
			day += 1;
		}
		day += 654321 / 86400;
		System.out.println("(654,321초 이후)");	
		System.out.printf("%d일 %02d:%02d:%02d\n\n", day, hour, min, sec);
		
		
		int _day3 = 234567 - (86400 * (234567 / 86400));
		sec -= ((_day3) % 3600) % 60;
		if(sec >= 60) {
			sec -= 60;
			min += 1;
		}else if(sec < 0){
			sec += 60;
			min -= 1;			
		}
		min -= ((_day2) % 3600) / 60;
		if(min >= 60) {
			min -= 60;
			hour += 1;
		}else if(min < 0){
			min += 60;
			hour -= 1;			
		}
		hour -= (_day2) / 3600;
		if(hour >= 24) {
			hour -= 24;
			day += 1;
		}else if(hour < 0){
			hour += 24;
			day -= 1;			
		}
		day -= 234567 / 86400;
		
		System.out.println("(234,567초 이전)");	
		System.out.printf("%d일 %02d:%02d:%02d\n\n", day, hour, min, sec);
	}

}*/

/*24시간 및 일수를 표시하는 디지털 시계를 만들자. (최초 [0일 00:00:00] 으로 설정) 
 * 문제1. 123,456초가 지난 후 시계를 표시하라.  			    ~> 1일 10:17:36
 * 문제2. 위 1. 결과에서 654,321초가 지난 후 시계를 표시하라.   ~> 8일 13:02:57
 * 문제3. 위 2. 결과에서 234,567초 전 시계를 표시하라. 			~> 5일 19:53:30
*/
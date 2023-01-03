package homework.work04;

public class EvenOdd2 {

	public static void main(String[] args) {
//		//시간단위부터 계산하는 경우
//		int day = 0, hour = 0, minute = 0, second = 0, time = 0;
//		System.out.printf("현재 시간 : %d일 %02d:%02d:%02d \n", day, hour, minute, second);
//		// %02d => 2자리 숫자를 입력할건데, 모자르면 0을 붙여라.
//		System.out.println();
//
//		time = 123456;
//		day += time / (60 * 60 * 24);
//		time %= (60 * 60 * 24);
//		hour += time / (60 * 60);
//		time %= (60 * 60);
//		minute += time / 60;
//		second += time % 60;
//
//		if (second >= 60) {
//			second %= 60;
//			minute++;
//		} else if (second < 0) {
//			second += 60;
//			minute--;
//		}
//		if (minute >= 60) {
//			minute %= 60;
//			hour++;
//		} else if (minute < 0) {
//			minute += 60;
//			hour--;
//		}
//		if (hour >= 24) {
//			hour %= 24;
//			day++;
//		} else if (hour < 0) {
//			hour += 24;
//			day--;
//		}
//		System.out.println("(123,456초 이후)");
//		System.out.printf("%d일 %02d:%02d:%02d \n", day, hour, minute, second);
//		System.out.println();
//
//		time = 654321;
//		day += time / (60 * 60 * 24);
//		time %= (60 * 60 * 24);
//		hour += time / (60 * 60);
//		time %= (60 * 60);
//		minute += time / 60;
//		second += time % 60;
//
//		if (second >= 60) {
//			second %= 60;
//			minute++;
//		} else if (second < 0) {
//			second += 60;
//			minute--;
//		}
//		if (minute >= 60) {
//			minute %= 60;
//			hour++;
//		} else if (minute < 0) {
//			minute += 60;
//			hour--;
//		}
//		if (hour >= 24) {
//			hour %= 24;
//			day++;
//		} else if (hour < 0) {
//			hour += 24;
//			day--;
//		}
//		System.out.println("(654,321초 이후)");
//		System.out.printf("%d일 %02d:%02d:%02d \n", day, hour, minute, second);
//		System.out.println();
//
//		time = 234567;
//		day -= time / (60 * 60 * 24);
//		time %= (60 * 60 * 24);
//		hour -= time / (60 * 60);
//		time %= (60 * 60);
//		minute -= time / 60;
//		second -= time % 60;
//
//		if (second >= 60) {
//			second %= 60;
//			minute++;
//		} else if (second < 0) {
//			second += 60;
//			minute--;
//		}
//		if (minute >= 60) {
//			minute %= 60;
//			hour++;
//		} else if (minute < 0) {
//			minute += 60;
//			hour--;
//		}
//		if (hour >= 24) {
//			hour %= 24;
//			day++;
//		} else if (hour < 0) {
//			hour += 24;
//			day--;
//		}
//		System.out.println("(654,321초 이후)");
//		System.out.printf("%d일 %02d:%02d:%02d \n", day, hour, minute, second);
//		System.out.println();

//////////////////////////////////////////////////////////////////////////////////////////////////
		
		//초단위부터 계산하는 경우
		int day = 0, hour = 0, minute = 0, second = 0, time = 0;
		System.out.printf("현재 시간 : %d일 %02d:%02d:%02d \n", day, hour, minute, second);
		System.out.println();
		
		time = 123456;
		second += time % 60; // 나머지가 현재 시계의 초
		time /= 60; // 몫 = 앞으로 계산해야할 분
		if (second >= 60) {
			second %= 60;
			minute++;
		}
		
		minute += time % 60; // 나머지가 현재 시계의 분
		time /= 60; // 몫 = 앞으로 계산해야할 시간
		if (minute >= 60) {
			minute %= 60;
			hour++;
		}
		
		hour += time % 24; // 나머지가 현재 시계의 시간
		time /= 24; // 몫 = 앞으로 계산해야할 일자
		if (hour >= 24) {
			hour %= 24;
			day++;
		}
		
		day += time; // 지난 일자

		System.out.println("(123,456초 이후)");
		System.out.printf("%d일 %02d:%02d:%02d \n", day, hour, minute, second);
		System.out.println();
		
		time = 654321;
		second += time % 60;
		time /= 60;
		if (second >= 60) {
			second %= 60;
			minute++;
		}
		
		minute += time % 60;
		time /= 60;
		if (minute >= 60) {
			minute %= 60;
			hour++;
		}
		
		hour += time % 24;
		time /= 24;
		if (hour >= 24) {
			hour %= 24;
			day++;
		}
		
		day += time;

		System.out.println("(654,321초 이후)");
		System.out.printf("%d일 %02d:%02d:%02d \n", day, hour, minute, second);
		System.out.println();
		
		time = 234567;
		second -= time % 60;
		time /= 60;
		if (second < 0) {
			second += 60;
			minute--;
		}
		
		minute -= time % 60;
		time /= 60;
		if (minute < 0) {
			minute += 60;
			hour--;
		}
		
		hour -= time % 24;
		time /= 24;
		if (hour < 0) {
			hour += 24;
			day--;
		}
		
		day -= time;

		System.out.println("(234,567초 이전)");
		System.out.printf("%d일 %02d:%02d:%02d \n", day, hour, minute, second);
	}

}

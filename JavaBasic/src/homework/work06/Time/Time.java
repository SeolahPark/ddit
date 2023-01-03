package homework.work06.Time;

public class Time {
	private int hour, minute, second;

	public Time() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;

	}

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		if (hour < 0 || hour > 23)
			this.hour = 0;
		this.minute = minute;
		if (minute < 0 || minute > 59)
			this.minute = 0;
		this.second = second;
		if (second < 0 || second > 59)
			this.second = 0;
	}

//	@Override : 부모클래스의 메서드를 재정의할 때 사용함
	public String toString() {
		return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
	}

}

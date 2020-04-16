package test;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		this(0,0,0);
	}
	
	public Time(int h, int m, int s) {
		hour = ((h>=0&&h<24) ? h:0);
		minute = ((m>=0&&m<60)?m:0);
		second = ((s>=0&&s<60)? s:0);
	}
	
	public String toString() {
		return String.format("%02d : %02d : %02d", hour, minute, second);
	}
	
	public static void main(String[] args) {
		Time t=new Time();
		System.out.println("기본 생성자 호출 후 시간 : " + t.toString());
		
		Time t1 = new Time(13, 27, 06);
		System.out.println("두번째 생성자 호출 후 시간 : "+ t1.toString());
		
		Time t2 = new Time(94, 74, 541);
		System.out.println("올바르지 않은 시간 설정 후 시간 : "+t2.toString());
	}

}

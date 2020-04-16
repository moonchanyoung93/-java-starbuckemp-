package ch06;

import java.util.Scanner;

public class Holiday2 {
	static int y; //전역변수

	static void input() {
		Scanner scan = new Scanner(System.in);//출력값 입력
		System.out.print("근속년수를 입력하시오! -->");
		y= scan.nextInt();
		scan.close();

	}

	static int holiday(int year) {
		int day=0;
		if(year <=5) {//근속년수 5년이하
			day =10;
		}else if (year <=10) { // 근속년수 6~10
			day = 15;
		}else {//근속년수 10년 이d
			day =20;
		}
		return day;	}


	static void e() {
		input ();
		System.out.println(holiday(y));
	}

	public static void main(String[] args) {
		e();
	}

}

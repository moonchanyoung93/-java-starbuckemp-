package test;

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		int month;
		Scanner scan=new Scanner(System.in);
		System.out.print("몇 월이 궁금해?");
		month = scan.nextInt();
		scan.close();
		int days;
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: days = 31;
		break;
		case 4:
		case 6:
		case 9:
		case 11: days = 30;
		break;
		default : days = 28;
		break;
		}
System.out.println(month +"월의 날 수는 " + days +"입니다!");
	}

}

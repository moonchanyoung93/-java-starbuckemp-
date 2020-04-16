package test;

import java.util.Scanner;

public class StringSwitch {

	public static void main(String[] args) {
		int month;
		Scanner scan=new Scanner(System.in);
		System.out.print("원하는 월을 적으시오");
		month = scan.nextInt();
		
		String eng ;
		
		switch(month) {
		case 1: eng = "january";
		break;
		case 2: eng = "feb";
		break;
		case 3: eng = "mar";
		break;
		case 4: eng = "apr";
		break;
		default :eng = "몰라잉";
		break;
		}
System.out.println(month +"월은 영어로 " +eng+"입니다.");
	}

}

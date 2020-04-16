package test;

import java.util.Scanner;

public class CheckInput {

	public static void main(String[] args) {
		int month;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("올바른 월을 입력하시오 [1~12] :");
		month = scan.nextInt();
				
		}while(month>12||month<1);
System.out.println("사용자가 입력한 월은" + month + " 입니다");
	}

}

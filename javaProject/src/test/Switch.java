package test;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		int a;
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력하시오.");
		a = scan.nextInt();
		
		switch(a) {
		case 0: System.out.println("영");
		break;
		case 1 : System.out.println("하나");
		break;
		case 2: System.out.println("둘");
		break;
		case 3 : System.out.println("셋");
		break;
		default : System.out.println("몰라");
		break;
		}
	}

}

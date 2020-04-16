package test;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		int a,b,c;
	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 숫자를 입력하시오.");
		a = scan.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요.");
		b = scan.nextInt();
		
		c= a+b;
		System.out.println("두수의 합은 "+c+" 입니다.");
		
		scan.close();

		

	}

}

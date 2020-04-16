package ch02;

import java.util.Scanner; // ctrl+ shift + o

//키보드로부터의 사용자 입력 프로그램!

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("첫번째 정수값?");
		int  x =in.nextInt();
		
		System.out.println("두번째 정수값?");
		int y = in.nextInt();
		
		System.out.printf("%d * %d은 %d입니다. \n" ,  x, y, x*y);
		
		in.close();
			
		

	}

}

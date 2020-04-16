package ch02;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("첫번째 입력값은?");
		int x = in.nextInt();
		
		System.out.println("두 번째 입력값은?");
		int y = in.nextInt();
		
		System.out.printf("%d + %d은 %d이다  \n", x, y, x+y);

		in.close();
		
		
	}

}

package test;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		long f =1;
		int n;
		Scanner scan= new Scanner(System.in);
		System.out.print("정수를 입력하시오!");
		n = scan.nextInt();
		
		for (int i=1; i<=n; i++) {
			f = f*i;
		}
		System.out.printf("%d!는 %d이다!", n,f);
		

	}

}

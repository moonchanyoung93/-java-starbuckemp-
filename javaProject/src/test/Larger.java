package test;

import java.util.Scanner;

public class Larger {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		a = scan.nextInt();
		System.out.print("두번째 정수 : ");
		b = scan.nextInt();
		scan.close();
		if(a>b) {
			c=a;
			
		}else {
			c=b;

}System.out.println(" 큰 정수는 " +c);
	}
}

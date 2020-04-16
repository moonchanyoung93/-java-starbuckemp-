package ch05;

import java.util.Scanner;

public class ArrayLength2 {

	public static void main(String[] args) {
		int a[] = new int[3];
		int sum =0;
				
		Scanner scan = new Scanner(System.in);
		System.out.print(a.length+"개의 정수를 입력하시오>>");
		
		for(int i = 0 ; i<a.length; i++) {
			a[i]= scan.nextInt();
			sum +=a[i];
		}
		System.out.println("평균은 "+ (double)sum/a.length);
		scan.close();
	}

}

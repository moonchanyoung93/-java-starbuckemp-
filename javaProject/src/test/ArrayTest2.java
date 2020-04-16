package test;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		int count =0;
		int sum=0;
		double avg =0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("학생수는?");
		count =scan.nextInt();
		
		int[] a = new int[count];
		for(int i=0; i<a.length;i++) {
			System.out.print("성적을 입력하시오");
			a[i]=scan.nextInt();
			}
		
		for(int i=0; i<a.length;i++) {
			sum += a[i];
			avg= (double)sum/a.length;
			
		}
		System.out.println("학생들의 총점은 : " + sum);
		System.out.printf("학생들의 평균은 : %4.1f ", avg);
		
	
		

	}

}

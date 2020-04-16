package ch05;

import java.util.Scanner;


public class ArrayScanScore {

	public static void main(String[] args) {
		int tot =0;
		double avg =0;
		int size;
		Scanner scan= new Scanner(System.in);
		System.out.println("======================");
		System.out.print("성적 처리할 학생의 수를 입력하시오.=>");
		size = scan.nextInt();
		
		int[] scores= new int[size];
		for(int i=0; i<scores.length;i++) {
			System.out.print("성적을 입력하시오."+(i+1)+"번째 학생의 성적 :");
			scores[i]= scan.nextInt();
		}
		for(int i=0; i<scores.length;i++) {
			tot +=scores[i];
			avg=tot/scores.length;
		}
		System.out.println("학생들의 총점은 : " +tot);
		System.out.println("학생들의 평균은 : "+ avg );
		System.out.println("======================");
		scan.close();

	}

}

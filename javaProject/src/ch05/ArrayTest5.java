package ch05;

import java.util.Scanner;

//사용자가 배열의 크기를 지정

public class ArrayTest5 {

	public static void main(String[] args) {
		int total = 0;
		int size;
		Scanner scan= new Scanner(System.in);
		System.out.print("배열의 크기를 입력하시오 : ");
		size = scan.nextInt();
		
		int[] scores =new int[size];
		for(int i=0; i<scores.length;i++) {
			System.out.print("성적을 입력하시오! :");
			scores[i] = scan.nextInt();
		}
		for(int i =0; i<scores.length; i++) {
			total += scores[i];
		}
		System.out.println("성적의 총점은 : " + total);
		System.out.println("평균성적은 " +(double)total/scores.length +"점 입니다.");
		scan.close();

	}

}

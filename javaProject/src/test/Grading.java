package test;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		int point;
		String grade = "";
		Scanner scan = new Scanner(System.in);
		System.out.print("성적을 입력하시오 : ");
		point = scan.nextInt();
		scan.close();
		
		if(point>=90) {
			grade = "A";
		}else if(point>=80) {
			grade = "B";
		}else if (point >=70) {
			grade = "C";			
		}else {
			grade = "F";
		}
		
		System.out.println("당신의 이번학기 학점은 " +grade + "입니다.");
		
	}

}

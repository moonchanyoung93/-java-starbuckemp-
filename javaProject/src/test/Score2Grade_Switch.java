package test;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Score2Grade_Switch {

	public static void main(String[] args) {
		int score;
		Scanner scan=new Scanner(System.in);
		System.out.print("점수를 입력하시오");
		score = scan.nextInt();
		scan.close();
		
		String grade ="" ;
		
		switch(score/10) {
		case 10: grade = "S";
		break;
					
		case 9: grade = "A";
		break;
		
		case 8 : grade = "B";
		break;
		
		case 7 : grade = "C";
		break;
		
		default : grade = "재시험";
		break;
		}
		System.out.println("당신의 성적은 "+grade+"입니다.");
		
	}

}

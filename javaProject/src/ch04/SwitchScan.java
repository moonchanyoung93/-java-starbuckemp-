package ch04;

import java.util.Scanner;

public class SwitchScan {

	public static void main(String[] args) {
		int java, html, jsp, db;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("java : ");
		java = scan.nextInt();
		System.out.print("html : ");
		html = scan.nextInt();
		System.out.print("jsp : ");
		jsp = scan.nextInt();
		System.out.print("db : ");
		db = scan. nextInt();
		scan.close();
		
		int tot = java+html + jsp+ db;
		double avg = tot/4.0;
		String grade = "";
		
		
		switch((int)(avg/10)) {
		case 10:
		case 9 : grade = "수";
		break;
		
		case 8 : grade = "우";
		break;
		case 7 : grade = "미";
		break;
		
		case 6 : grade = "양";
		break;
		
		default : grade = "가";
		
		}
		System.out.println("java\thtml\tjsp\tdb\t총점\t평균\t등급");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%4.1f\t%s", java, html, jsp, db, tot, avg, grade);
	}

}

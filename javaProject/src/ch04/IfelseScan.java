package ch04;

import java.util.Scanner;

public class IfelseScan {

	public static void main(String[] args) {
		int java, html, jsp, db;
		

		
		Scanner scan = new Scanner(System.in);
		System.out.print("java :  " );
		java = scan.nextInt();
		System.out.print("html :" );
		html = scan.nextInt();
		System.out.print("jsp : ");
		jsp = scan.nextInt();
		System.out.print("db : ");
		db = scan.nextInt();
		scan.close();
		
		int tot = java+ html+jsp+ db;
		double avg = tot / 4.0;
		String grade ="";
		
		if (avg >=90) {
			grade = "수";
			
		} else if(avg >= 80) {
			grade = "우";
			
		} else if (avg >= 70) {
			grade = "미";
			
		}else if (avg >=60) {
			grade = "양";
			
		} else {
			grade = "가";
			
		}
		System.out.println("java\t html\t jsp\t db\t 총점\t 평균\t 등급");
		//System.out.println(java +"\t" + html +"\t" + jsp +"\t" + db +"\t" +tot +"\t" + avg +"\t" + grade);
		System.out.printf("%d\t %d\t %d\t %d\t %d\t %4.1f\t %s", java, html, jsp, db, tot, avg, grade);
	}

}

package ch03;

import java.util.Scanner;

public class Jumsoo {

	public static void main(String[] args) {
		String name;
		int ja, HT, JS, DB, tot; 
		double avg;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		name = scan.next();
		System.out.print("java :");
		ja = scan.nextInt();
		System.out.print("HTML : ");
		HT = scan.nextInt();
		System.out.print("JSP : ");
		JS = scan.nextInt();
		System.out.print("DB :");
		DB = scan.nextInt();
		
		scan.close();
		
		tot = ja+ HT+ JS+DB;
		avg = tot /4.0;
		
		//결과출력
		System.out.println("이름 \tjava \tHTML \tJSP \tDB \t 총점 \t 평균 ");
		System.out.println(name +"\t"+ja +"\t"+HT +"\t"+JS +"\t"+DB +"\t"+tot +"\t"+avg);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%4.1f", name, ja, HT, JS, DB, tot, avg);
				
		
	}
	
}

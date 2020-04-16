package test;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		final int targetSales = 1000;
		int a;
		int bonus;
		String result ="";
		
		Scanner scan= new Scanner(System.in);
		System.out.print("실적을 입력하시오.(단위: 만원)");
		a=scan.nextInt();
		scan.close();
		if(a>=targetSales) {
			result = "실적달성";
			bonus = (a-targetSales)/10;
			
		}else {
			result = "실적 개망";
			bonus =0;
			
		}
		System.out.println(result + "\n"+ "당신의 보너스는 :"+ bonus );

	}

}

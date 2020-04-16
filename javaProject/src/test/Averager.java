package test;

import java.util.Scanner;

public class Averager {

	public static void main(String[] args) {
		int tot=0;
		int count=0;
		double avg=0;
		int n;
		while(true) {
			Scanner scan=new Scanner(System.in);	
			System.out.print("점수를 입력하시오!");
			n=scan.nextInt();
			if(n==-1) {
				break;

			}
			tot=tot+n;
			count++;
			avg= tot/count;

			scan.close();
		}
		System.out.println("합계는 :" + tot);
		System.out.println("평균은 : "+ avg);
	}

}

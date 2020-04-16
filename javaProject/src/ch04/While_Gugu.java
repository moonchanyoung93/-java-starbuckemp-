package ch04;

import java.util.Scanner;

public class While_Gugu {
	public static void main(String[] args) {
		int dan;
		Scanner sc=new Scanner(System.in);
		System.out.print("몇 단을 하시겠습니까?");
		dan = sc.nextInt();
		
	int i=1;			
		while(i<10) {
		
		System.out.println(dan +"*"+i +"="+ dan*i);
		i++;
		}
		sc.close();
		
	}

}

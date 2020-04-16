package test;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {

		
		Random g= new Random();
		int sum =0;
				int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("난수의 개수 : ");
		n=scan.nextInt();
		for(int i=0; i<n;i++) {
			int num = g.nextInt(100);
			sum +=num;
				}
		System.out.println(sum);
		

	}

}

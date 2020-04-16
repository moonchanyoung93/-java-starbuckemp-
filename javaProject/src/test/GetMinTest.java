package test;

import java.util.Scanner;

public class GetMinTest {

	public static void main(String[] args) {
		int size;
		Scanner scan=new Scanner(System.in);
		System.out.println("몇개의 값을 입력하시겠습니까?");
		size = scan.nextInt();
		
		int[] s= new int[size];
		for(int i=0;i<s.length;i++) {
			System.out.println(size +"개의 값을 입력하시오!");
			s[i]=scan.nextInt();	
		}
		int min;
		min=s[0];
		for(int i=0;i<s.length;i++) {
			if(i<min) {
				min=s[i];
			}

		}
		System.out.println("최소값은 :"+ min);

	}

}

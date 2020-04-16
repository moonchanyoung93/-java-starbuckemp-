package test;

import java.util.Scanner;

public class SeqSearch {

	public static void main(String[] args) {
		int[] a= {0,10,20,30,40,50};
		
		int b,c=0;
		System.out.println("<<(보기)0,10,20,30,40,50>>");
		Scanner scan=new Scanner(System.in);
		System.out.print("\n위 보기에서 탐색할 값을 입력하시오!: ");
		b=scan.nextInt();

		for(int i =0; i<a.length;i++) {
			if(a[i]==b) {
				c=i;
			}
			
}
		System.out.println("입력하신 번호는 index " +c+"의 위치에 있습니다!" );
	}

}

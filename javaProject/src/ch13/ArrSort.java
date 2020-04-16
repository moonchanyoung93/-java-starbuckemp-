package ch13;

import java.util.Arrays;

public class ArrSort {
	public static void main(String[] args) {
		int[] num = {50,40,70,90,120,-20};
		
		System.out.print("배열 데이터 : ");
		for(int i=0;i<num.length; i++) {
			System.out.print(num[i]+"\t");
			
		}
		System.out.println();
		System.out.println("오름차순 : ");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+"\t");
		}
		System.out.println();
		System.out.println("내림차순 : ");
		for(int i=num.length-1 ; i>=0; i--) {
			System.out.print(num[i]+"\t");
		
	}
		System.out.println();
		//bubble sort(버블정렬)
		Arrays.sort(num);//오름차순만 제공한다.
		System.out.print("Arrays.sort()를 활욜한 정렬: ");
		for(int a: num) {
			System.out.print(a+"\t");
		}

}
}
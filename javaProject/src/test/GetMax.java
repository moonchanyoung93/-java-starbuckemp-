package test;

import java.util.Scanner;

public class GetMax {
	public static void main(String[] args) {
		int[] a= {1,68,8,1,79,536,84};
		int max;
		max=a[0];

		for(int i =0; i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println("최댓값은 : " + max);
		
	}
}
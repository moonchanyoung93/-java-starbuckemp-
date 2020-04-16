package test;

import java.util.Scanner;

public class ArrayProc {
	public void getValues(int[] array) {
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<array.length; i++) {
			System.out.print("성적을 입력하시오 : ");
			array[i]= scan.nextInt();
			scan.close();
		}
	}
	
	public double getAverage(int[] array) {
		double total = 0;
		for(int i= 0; i<array.length;i++) {
			total +=array[i];
		}
		return total/array.length;
	}

	
	final static int STUDENTS =5;
	public static void main(String[] args) {
		int[] scores = new int[STUDENTS];
		ArrayProc obj=new ArrayProc();
		obj.getValues(scores);
		System.out.println(obj.getAverage(scores));
		
	}
}

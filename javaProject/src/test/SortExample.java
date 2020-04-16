package test;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		int size =10;
		int[] numbers =new int[size];
		
		for(int i=0; i<numbers.length;i++) {
			int r=(int)(Math.random()*200);
			numbers[i]=r;
			
		}

		System.out.print("최초의 리스트 : ");
	for(int r: numbers) 
		System.out.print(r + " ");
	Arrays.sort(numbers);
	
	System.out.print("\n정렬된 리스트 : ");
	for(int r : numbers)
		System.out.print(r + " ");
	}

}

package ch02;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x;
		double y;
		double sum;
		
		System.out.print("가로의 길이 : ");
		x= input.nextDouble();
		
		System.out.print("세로의 길이 : ");
		y= input.nextDouble();
		
		sum= x*y;
		System.out.println("직사각형의 넓이는 " +sum + " 입니다.");
		
		
		input.close();
		

	}

}

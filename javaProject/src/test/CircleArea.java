package test;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		double radius;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("반지름을 입력하시오 ");
		radius = scan.nextDouble();
		scan.close();
		double area;
		area = radius*radius*3.14;
		
		System.out.println(area);
		
	}

}

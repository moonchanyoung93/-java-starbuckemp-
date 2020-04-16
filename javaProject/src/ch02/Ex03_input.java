package ch02;

import java.util.Scanner;

public class Ex03_input {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하시오.");
		String name = scan.next();
		scan.close();
		System.out.println("당신의 이름은 " + name + "입니다.");
		
		

	}

}

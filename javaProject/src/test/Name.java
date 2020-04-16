package test;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		String name ; 
		int a;
		
		Scanner scan= new Scanner(System.in);
		System.out.print("이름 : ");
		name = scan.nextLine();
		System.out.print("나이 : ");
		a = scan.nextInt();
		scan.close();
		
		System.out.println(name +"님 안녕하세요?" + a+ "살이시네요!!");
		
	}

}

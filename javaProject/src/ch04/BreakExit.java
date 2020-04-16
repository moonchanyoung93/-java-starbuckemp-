package ch04;

import java.util.Scanner;

public class BreakExit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("exit를 입력하면 종료합니다");
			System.out.print(">>");
			String text = scan.nextLine();
			if(text.equals("exit"))  //"exit"가 입력되면 반복 종료
			//문자열 비교시 equals()사용
			break;
		}
		
		System.out.println("종료하겠습니다!");
scan.close();
	}

}

package test;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		String s;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("문자열을 입력하시오>");
			s=scan.next();
			if(s.equals("quit")) {
				break;
			}else if(s.matches("^www\\.(.+)")) {
				System.out.println(s+"는 www로 시작합니다");
			}else {
				System.out.println(s+"는 www로 시작하지 않아유");
			}
			scan.close();
		}

	}

}

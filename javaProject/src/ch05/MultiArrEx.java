package ch05;

import java.util.Scanner;

public class MultiArrEx {

	public static void main(String[] args) {
		String[][] words = {{"chair","의자"},{"computer", "컴퓨터"},{"integer","정수"}};
		
		
	
	Scanner scan = new Scanner(System.in);
	
	for(int i =0; i<words.length; i++) {
		System.out.printf("Q%d, %s의 뜻은?", i+1,words[i][0]);
		String tmp = scan.next();
		if(tmp.equals(words[i][1])) {
			System.out.printf("정답쓰~%n%n");
		}else { 
			System.out.printf("땡! 정답은 %s입니다"+ "%n%n", words[i][1]);
			scan.close();
		}
	}
		

	}

}

package test;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		int num=(int)(Math.random()*100);
		int guess;
		Scanner scan =new Scanner(System.in);
		int tries = 0;
		
		do {
			System.out.println("정답이 뭐게~?");
			guess = scan.nextInt();
			tries++;
			
			if(guess>num) {
				System.out.println("너무 커유~");
			
			}else if(guess<num) {
				System.out.println("너무 작아유~");
			}
		

	}while(guess!=num);
		
		System.out.println("성공! 시도횟수 : " + tries);

}
}

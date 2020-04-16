package ch04;
//for문 안에 if else를 사용한 1부터 10까지의 합!

public class For_If_Else {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1 ; i<=10 ;i++) {//<1~10까지 반복!>
			sum+=i;
			System.out.print(i);
		
			 if(i<=9) //1~9까지는 '+'출력
				System.out.print("+");
			 
			 else {
				System.out.print("=");
				
				System.out.print(sum);
			}
			
		}
		

	}

}

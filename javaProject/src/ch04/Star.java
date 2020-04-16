package ch04;

public class Star {
//삼각형그리기
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("*");//줄바꿈 안함
				
			}//end inner
			System.out.println();
			}//end outer
		
		//역삼각형 그리기
		for(int i = 5; i>=1; i--) {
			for(int j =1; j<=i;j++) {
				System.out.print("*");
			
			}
			System.out.println();
		}
	}//end main

}//end class

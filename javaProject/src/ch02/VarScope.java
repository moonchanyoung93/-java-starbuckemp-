package ch02;

public class VarScope {

	static int x ;//전역변수 선언
	
	
	public static void main(String[] args) {
		int y = 0;//지역변수 선언
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		

	}

}

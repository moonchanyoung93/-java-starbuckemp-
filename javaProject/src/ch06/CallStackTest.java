package ch06;

public class CallStackTest {

	public static void main(String[] args) {
		firstMethod(); //firstMethod 호출
		
		//프로그램 종료

	}

	private static void firstMethod() {
		secondMethod();//secondMethod 호출
		
		
	}

	private static void secondMethod() {
		System.out.println("secondMethod()");
		
	}

}

package ch06;

public class CallEx {
	static void test (int b) {//int b를 매개변수,arguments, parameter라고 불림!
		System.out.println(" test method 호출");//3-1번째 실행
		System.out.println(b);//3-2번째 실행
	}

	
	
	public static void main(String[] args) {
		System.out.println("시작");//1번째 실행
		int a=10;//2번째 실행
		test(a);//3번째 실행
		System.out.println("끝");//4번째 실행
		

	}

}

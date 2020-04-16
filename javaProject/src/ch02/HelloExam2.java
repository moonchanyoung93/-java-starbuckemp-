package ch02;

public class HelloExam2 {
	
	public static int sum(int a, int b) {
		return a - b;
		
	}
	
	public static void main(String[] args) {
		int i =50; //지역변수 초기화
		int s;
		
		
		s=sum(i,30);
    	System.out.println(s);
		System.out.println("문찬영");
	}

}

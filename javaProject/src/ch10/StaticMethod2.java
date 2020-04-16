package ch10;

public class StaticMethod2 {
	static String name="문찬영";
	int age =27;
	String num = "010-5777-8339";

	public static void printA() {
		System.out.println("------------------");
		System.out.println("이름 : "+name);
	}

	
	public void printB() {
		System.out.println("나이 : "+ age);
		System.out.println("전화번호 : "+ num);
		System.out.println("------------------");
	}
	
	public static void main(String[] args) {
		printA();
		StaticMethod2 a= new StaticMethod2();
		a.printB();
		
	}

}

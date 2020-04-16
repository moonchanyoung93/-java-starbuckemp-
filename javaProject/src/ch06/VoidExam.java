package ch06;

public class VoidExam {
	
	static void hello() {//void :리턴값이 없을때 사용!!!!!!
		System.out.println("안녕하세요!");
		return;//리턴값이 없을땐 return 이 있어도 되고, 생략도 가능하다!!
	}
	

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		hello();//method call
		System.out.println("프로그램 끝!");

	}

}

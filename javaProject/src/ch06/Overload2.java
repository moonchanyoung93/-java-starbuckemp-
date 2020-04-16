package ch06;

public class Overload2 {

	public static void main(String[] args) {
		ending();

	}


	static void ending() { //출력메소드

		System.out.println("-------------");
		print("문찬영");
		print(27);
		print("경기도", " 안산시");
		print("010","5777",8339);
		System.out.println("-------------");

	}



	static void print(String a) {
		System.out.println(a);

	}
	static void print(int a) {
		System.out.println(a);
	}

	static void print(String a, String b) {
		System.out.println( a+" "+ b);

	}

	static void print(String a, String b, int c) {
		System.out.println(a +"-"+b+"-"+c);
	}

}


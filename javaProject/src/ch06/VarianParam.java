package ch06;

//자료형 ...변수 =>가변사이즈 매개변수처리, 변수가 배열참조변수가 됨!
//같은 자료형의 매개변수의 갯수에 관계없이 처리!
//매개변수들이 배열로 저장됨!
//실제로는 많이 안쓰임.

public class VarianParam {
	static void print(String ... n) {//n이 가변형 매개변수(배열처리의 주소값)이 됨
		for(int i=0; i<n.length;i++) {
			System.out.println(n[i]);
		}
		
	}
		//	static void print(String a) {
		//		System.out.println(a);
		//	}
		//	
		//	static void print(String a, String b) {
		//		System.out.print(a);
		//		System.out.println(b);
		//	}
		//	
		//	static void print(String a, String b, String c) {
		//		System.out.print(a);
		//		System.out.print(b);
		//		System.out.print(c);
		//	}
		//	static void print(String a, String b, String c, String d) {
		//		System.out.print(a);
		//		System.out.print(b);
		//		System.out.print(c);
		//		System.out.print(d);
		//	}


		public static void main(String[] args) {
			print("java");
			print("\njava","program");
			print("\njava","program" , "jsp");
			print("\njava","program" , "jsp","big");
		}

	}

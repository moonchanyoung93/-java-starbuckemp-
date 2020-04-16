package ch06;

public class Overload {

	public static void main(String[] args) {
		print(10);
		print(100.5);
		print("java");



	}
	
	//파라미터를Object로 하면 메소드 1개로 처리할 수 있으나 이렇게 쓰지는 않음.(속도문제(느려짐), 최상위 클래스임)
//	static void print(Object obj){
//		System.out.println(obj);
//	}

	static void print(String str) {
		System.out.println(str);

	}


	static void print(double d) {
		System.out.println(d);		
	}

	static void print(int i) {
		System.out.println(i);

	}

}

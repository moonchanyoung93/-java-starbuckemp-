package ch02;

public class TypeMismatch {

	public static void main(String[] args) {
		byte n; //byte타입의 변수에는 -128~127까지만 사용 가능 그 이상은 short
		
		n = 127;
		System.out.println(n);

	}

}

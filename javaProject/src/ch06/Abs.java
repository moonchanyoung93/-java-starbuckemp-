package ch06;

public class Abs {//절대값 계산
	static int abs(int num) {
		return num>0 ? num: -num; //-15가 들어오면 -num 실행
	}

	public static void main(String[] args) {
		int a = -15;
		System.out.println(a);
		System.out.println(abs(a));
		System.out.println(Math.abs(a));

	
	}

}

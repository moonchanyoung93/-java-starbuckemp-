package ch10;

public class Finalvar {
	final static int MAX_NUM=1000;
	//final변수는 전역변수화 해도 선언만하면 에러
	
	public static void main(String[] args) {
		int max =100;
		System.out.println(max);
		System.out.println(MAX_NUM);
		//MAX_NUM = 1054; -> final 변수는 수정할수 없음!!
		
	}

}

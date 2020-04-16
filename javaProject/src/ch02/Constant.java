package ch02;
//상수처리(변하지 않는값 )

public class Constant {
	public static void main(String[] args) {

		final double KM_PER_MILE =1.609344; // final을 붙여서 변수의 상수처리
		double km;
		double mile = 60.0;
		km = KM_PER_MILE *mile;
		
		System.out.println("60마일은 " +km + "킬로미터입니다.");
		

	}

}

package ch13;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		System.out.println(Math.ceil(10.1));//올림처리!
		System.out.println(Math.round(10.5));//반올림
		System.out.println(Math.floor(10.9));//내림처리
		System.out.println(Math.pow(10, 3));//pow(값,지수)
		System.out.println(Math.pow(2, 3));
		Random r =new Random();
		System.out.println("정수값 : " +r.nextInt(100));//100이하의 랜덤정수
		System.out.println("실수값 : "+r.nextDouble());//1이하의 랜덤실수
		System.out.println();System.out.println("------------------");

		int a =10;
		Integer b = 20;//내부적으로 intValue()가 작동
		Integer c = new Integer(30);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c.intValue());//요게 정석! 근데 그냥 c만 해도 됨
	}

}

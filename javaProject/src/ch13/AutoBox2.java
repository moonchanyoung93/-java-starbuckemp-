package ch13;

public class AutoBox2 {

	public static void main(String[] args) {
		//기본자료형
		int num1 =30;
		int num2;
		int num3;
		
		//클래스자료형(객체자료형)
		Integer i1;
		Integer i2 = new Integer(40);//auto boxing
		Integer i3 = new Integer(50);
		
		i1=num1;//업캐스팅
		num2 =i2; //auto unboxing
		num3 = i3;
		
		System.out.println("-------------------");
		System.out.println("기본자료형 : "+ num1+", 객체자료형 : "+ i1);
		System.out.println("기본자료형 : "+ num2+", 객체자료형 : "+ i2);
		System.out.println("기본자료형 : "+ num3+", 객체자료형 : "+ i3);
		System.out.println("-------------------");
	}

}

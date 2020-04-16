package ch13;

public class AutoBox {

	public static void main(String[] args) {
		//기본자료형
		int num1=10;
		int num2;
		//클래스자료형(객체자료형)
		Integer i1;
		Integer i2 = new Integer(20);//auto boxing(기본자료형을 객체로 박싱처리)
		i1= num1;//업캐스팅
		num2 = i2;//auto unboxing(객체안에 들어있는 값을 풀어서 저장)
		//다운캐스팅
		System.out.println(num1+","+num2+","+i1+","+i2);

	}
}

package ch13;

//import java.lang.*;이 기본적으로 생략되어있습니다
public class Obj {//extends Object가 기본적으로 생략되어있다

	public static void main(String[] args) {
		Obj e1 = new Obj();
		System.out.println(e1.getClass());//클래스의 정보를 알수있다.
		System.out.println(e1);//객체의 주소값
		System.out.println(e1.toString());//Object를 문자열로 변환(toString())
		//계층구조를 볼때는 F4키를 눌러 확인가능!
		//코드를 볼때는 F3키를 눌러 확인가능!
		
		
	}

}

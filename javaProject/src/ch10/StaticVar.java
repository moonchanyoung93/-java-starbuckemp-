package ch10;

public class StaticVar {

	static int a =10;// static member
	int b =20; //non static member =>new를 사용하여 객체생성해야만한다
	
	public static void main(String[] args) {
		System.out.println(StaticVar.a);
		//static member는 new를 쓰지않고 바로 클래스 이름.멤버로 사용가능
		StaticVar s= new StaticVar();
		System.out.println(s.b);
		//non static member는 new를 써서 객체생성후 사용하여야 함.
	}
}

package ch10;
//static => 자동으로 메모리에 로딩
//non static => 객체를 생성한 후에나 로딩
//static method에서는 static안의 로컬변수나 static으로 정의된 멤버변수만 사용가능!


public class A {
	String name = "kim"; //non static member
	static int n = 20;//static member
	
	public void print() {//non static member
		System.out.println(name);
		System.out.println(n);
	}
	
	public static void main(String[] args) {//static member
		int a =10;
		double b =20.5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(n);
		
		A aa= new A();
		System.out.println(aa.name);
		System.out.println(aa.n);
		aa.print();
		//객체를 생성한 후에나 non static 멤버들을 사용할수 있음
	}
}

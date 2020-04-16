package ch08;

public class Foo {
	//멤버변수 선언
	int a;
	double b;

	public Foo() {//기본생성자
		this(1);//다른 생성자 호출, 제일 첫 라인에서 호출해야한다!! 두번째줄 가면 안됩니다!!
		int c=1;

	}

	public Foo(int x) {
		a=x;//멤버변수 = 로컬변수
		b=20.0;
	}
	
	public void print() {
		System.out.println("a = " + a);
		System.out.println("b = " +b);
	}

}

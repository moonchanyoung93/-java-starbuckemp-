package ch10;

class A2{
	 void print() {
		System.out.println("a");
	}
}

class B extends A2{
	@Override
	//오버라이딩
	//method 재정의
	void print() {//상속받은 관계에서 같은 메소드가 있다면 재정의하게되어 실행이됨
		//만약 class A2에서 final void print()하면 오버라이드가 안된다. 즉,final로 지정한 클래스는 상속이 안된다.
		super.print();
		System.out.println("b");
	}
}

public class Test2 {
	public static void main(String[] args) {
		B b= new B();
		b.print();
	}
}
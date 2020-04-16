package ch10;

public class StaticMethod {
	static int a=10;// static member
	int b=20; //non static member

	public static void printA() {
		//static 메소드는 non static 멤버를 쓸수 없다
		System.out.println(a);

	}
	public void printB() {
		//non static 메소드는 static이나 non static을 다 쓸수 있다.
		System.out.println(a);
		System.out.println(b);

	}

	public static void main(String[] args) {
		printA();
		//non static 멤버는 new를 통해 객체생성 후 써야한다.
		StaticMethod a = new StaticMethod();
		a.printB();
	}

}

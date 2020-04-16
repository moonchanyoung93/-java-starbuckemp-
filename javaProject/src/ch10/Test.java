package ch10;

public class Test {

	static int a=1; //static member
	int b=2; //non static member
	
	public void print () {
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public static void main(String[] args) {
		System.out.println(a);

		Test t= new Test();//객체생성 후에나 nonstatic 멤버사용가능
		System.out.println(t.b);
		t.print();
		
//		t=null;//객체가 주소를 잃고 떠돌아 다님
//		System.out.println(t.b);
	}
}

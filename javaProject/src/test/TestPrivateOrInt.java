package test;
class A{
	private int a;  	  //전용
	int b;					 //default
	public int c;		//공용
	
}

public class TestPrivateOrInt {

	public static void main(String[] args) {
		A obj=new A();
		
		//obj.a=3;   =>>전용 멤버는 다른 클래스에서는 접근이 안됨
		obj.b=2;
		obj.c=1;
		
		System.out.println(obj.b);
		

	}

}

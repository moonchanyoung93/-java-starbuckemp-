package test10;
class LocalInner{
	
private int data = 30;//인스턴스 변수

void display() {
	final String msg = "현재의 데이터 값은 : ";

	class Local{
		void print() {
			System.out.println(msg + data);
		}
	}
	
	Local l=new Local();
	l.print();
	
}
}

public class LocalInnerTest {
	public static void main(String[] args) {
		LocalInner l1=new LocalInner();
		l1.display();
		
	}

}

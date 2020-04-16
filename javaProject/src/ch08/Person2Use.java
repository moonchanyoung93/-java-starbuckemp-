package ch08;

public class Person2Use {

	public static void main(String[] args) {
		
		Person2 p1 = new Person2();//객체생성, 기본생성자 호출
		p1.print();
		
		
		Person2 p2 =new Person2("문찬영");
		p2.print();
		
		Person2 p3 = new Person2("문찬영", 27);
		p3.print();
		
		Person2 p4 = new Person2("문찬영",27,"경기도 안산시");
		p4.print();
		
		Person2 p5 = new Person2("문찬영",27,"경기도 안산시","010-5777-8339");
		p5.print();

	}

}

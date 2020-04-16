package ch07;

public class PersonUse {

	public static void main(String[] args) {
		//클래스를 사용하기 위해서는 메모리에 올려야함
		//객체(인스턴스)생성, 인스턴스화

		Person p1= new Person();//객체 참조변수 =new 객체();
		p1.setName("문찬영"); //참조변수.멤버변수
		p1.setAge(27);
		p1.setHeight(180); 
		//p1.print();
		System.out.println("이름 : " +p1.getName());
		System.out.println("나이 : " +p1.getAge());
		System.out.println("키 : " +p1.getHeight());

//				System.out.println("이름 : " +p1.name);
//				System.out.println("나이 : " +p1.age);
//				System.out.println("키 : " +p1.height);

	}

}

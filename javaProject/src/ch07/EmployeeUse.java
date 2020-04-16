package ch07;

public class EmployeeUse {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		System.out.println(e1);
		e1.input("김철수", "관리부", "과장", 1560000);

		e1.calc();
		e1.print();

		Employee e2 = new Employee();//참조변수는 반드시 달라야해요 e1,e2
		System.out.println(e2);
		e1.input("홍길동", "관리부", "과장", 1374000);

		e1.calc();
		e1.print();


	}


}

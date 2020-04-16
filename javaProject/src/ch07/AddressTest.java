package ch07;

public class AddressTest {

	public static void main(String[] args) {
		Address my = new Address();
		my.name = "문찬영";
		my.age = 27;
		my.num = "010-5777-8339";

		System.out.println("-------------------");
		System.out.println("이름 : " +my.name);
		System.out.println("나이 :" + my.age);
		System.out.println("전화번호 : "+ my.num);
		System.out.println("-------------------");

	}

}

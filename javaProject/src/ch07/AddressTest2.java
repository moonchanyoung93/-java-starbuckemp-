package ch07;

public class AddressTest2 {

	public static void main(String[] args) {
		Address my = new Address();

		my.setName("문찬영");
		String name=my.getName();

		my.setAge(27);
		int ag= my.getAge();

		my.setNum("010-5777-8339");
		String num = my.getNum();


		my.print();

	}

}

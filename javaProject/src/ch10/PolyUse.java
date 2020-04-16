package ch10;

class Pa{
	String name = "문찬영";
	public void print() {
		System.out.println("---------------");
		System.out.println("이름 : "+ name);
}
}

class Ch extends Pa{
	int age =27;
	String num ="010-5777-8339";
	@Override
	public void print() {
		
		super.print();
		System.out.println("나이 : "+ age);
		System.out.println("전화번호 : "+ num);
		
	}
}


public class PolyUse {

	public static void main(String[] args) {
		Pa end = new Ch();
		end.print();
		System.out.println("---------------");
	}

}

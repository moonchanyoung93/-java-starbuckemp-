package ch08;

public class Member2Use {

	public static void main(String[] args) {
		Member2 m1= new Member2();
		m1.print();


		Member2 m2= new Member2("문찬영", "moon","컴퓨터",120000);
		m2.print();

		Member2 m3 = new Member2("권영훈", "kyhoon");
		m3.print();


		Member2 m4= new Member2();
		m4.input("김지현", "rosa", "라면", 120000);	
		m4.printinput();
	}


}

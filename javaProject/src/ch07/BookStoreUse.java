package ch07;

public class BookStoreUse {

	public static void main(String[] args) {
		BookStore b1= new BookStore();
		
		b1.setBookName("바람이 되어");
		b1.setAuthor("문찬영");
		b1.setPress("찬영쓰");
		b1.setYear(2018);
		b1.setPrice(14000);
		b1.setAmount(15);
		
		
		b1.print();

	}

}

package ch04;

public class Do_while_Ex {

	public static void main(String[] args) {
		int n=1;
		do {
			System.out.println(n+ "Hello World");
			n++; //조건식에 위배될때까지 1 씩 증가한후 while문 빠져나감
		}while(n<=10);
		System.out.println("while 문 빠져나옴!");
	}

}

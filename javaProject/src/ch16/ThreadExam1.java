package ch16;

public class ThreadExam1 {
	public static void main(String[] args) {
		//main도 쓰레드이다.
		MyThread1 t1 = new MyThread1("*");
		MyThread1 t2 = new MyThread1("-");
		t1.start();
		t2.start();
		System.out.println("main end !!!");
		//총 실행되는 쓰레드는 3개이다.
	}

}

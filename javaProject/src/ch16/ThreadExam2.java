package ch16;

public class ThreadExam2 {
	public static void main(String[] args) {
		//main도 쓰레드이다.
		MyThread1 r1 = new MyThread1("*");
		MyThread1 r2 = new MyThread1("-");
		
		//Runnable을 쓸때는 Thread를 별도로 생성시켜야한다.
		Thread t1=new Thread(r1);
		Thread t2 = new Thread(r2);
		
		
		t1.start();
		t2.start();
		System.out.println("main end !!!");
		//총 실행되는 쓰레드는 3개이다.
	}

}

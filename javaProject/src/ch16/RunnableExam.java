package ch16;

public class RunnableExam implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10; i++) {
			System.out.println(Thread.currentThread().getName()+"==>"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		RunnableExam e1 = new RunnableExam();
		//Runnable을 쓸 때는  Thread를 별도로 생성해서 써야 한다.
		Thread t1=new Thread(e1,"thread1");
		Thread t2 = new Thread(e1, "thread2");
		
		//t1.run(); =>에러는 아니지만 main인 싱글쓰레드가 실행된다
		t1.start();//run()이 호출됨
		t2.start();
		
	}
	

}

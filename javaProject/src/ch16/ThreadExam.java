package ch16;

/**멀티스레드 : 작업단위가 2개 이상
 * 멀티스레드를 구현하는 방법
 * 1.Thread를 상속
 * 2.Runnable을 구현 */

public class ThreadExam extends Thread {
	public ThreadExam(String name) {
		super(name);//부모클래스(Thread)의 생성자 호출 스레드의 title설정
	}
	
	//반드시 오버라이드 해야함
	@Override
	public  void run() {
		for(int i =1; i<=5;i++) {
			System.out.println(Thread.currentThread().getName());//현재 실행중인 스레드의 이름 출력
			try {
				Thread.sleep(1000);//cpu 실행을 1초간 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace(); //개발자 디버깅 ->에러 메세지를 화면에 출력
			}
		}
	}

	public static void main(String[] args) {
		ThreadExam t1 = new ThreadExam("thread1");
		ThreadExam t2 = new ThreadExam("thread2");
		ThreadExam t3 = new ThreadExam("thread3");
		t1.start();//스레드객체.start()==>run()을 자동 호출
		t2.start();
		t3.start();
		
	}
	

}

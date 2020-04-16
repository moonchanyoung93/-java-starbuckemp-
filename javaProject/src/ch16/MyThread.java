package ch16;

public class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
		
	}
	
	@Override
	public void run() {
		for(int i =1; i<=5;i++) {
			System.out.println(Thread.currentThread().getName());//현재 실행중인 스레드의 이름 출력
			try {
				Thread.sleep(1000);//cpu 실행을 1초간 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace(); //개발자 디버깅 ->에러 메세지를 화면에 출력
			}
		}
	}

}

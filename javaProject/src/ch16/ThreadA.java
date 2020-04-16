package ch16;

public class ThreadA {
	public static void main(String[] args) {
		//앞에서 만든 쓰레드 B를 객체생성 후 start
		ThreadB b = new ThreadB();
		//해당 쓰레드가 실행되면, 해당 쓰레드는 run메소드 안에서
		//자신의 모니터링 락을 획득
		b.start();
		
		//b에 대해 동기화 블럭 설정
		synchronized (b) {
			System.out.println("b가 완료될때까지 기다립니다.");
			try {
				//wait 메소드 호출
				b.wait();
				//메인쓰레드는 정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//깨어난 후 결과를 출력
			System.out.println("Total is: "+ b.total);
		}//end synchronized()
	}
}

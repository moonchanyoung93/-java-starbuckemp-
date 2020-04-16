package ch16;

public class JoinExam {
	public static void main(String[] args) {
		
		MyThread5 thread = new MyThread5();
		thread.start();//Thread 시작=>run()메소드 호출
		System.out.println("Thread가 종료될때까지 기다립니다.");
		try {
			thread.join();//해당 쓰레드가 종료될 때까지 기다림
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread가 종료되었습니다.");
	}

}

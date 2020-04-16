package ch16;

public class MyThread5 extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("MyThread5 : "+i);
			try {
				Thread.sleep(500);//0.5초 동안 cpu 간섭
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

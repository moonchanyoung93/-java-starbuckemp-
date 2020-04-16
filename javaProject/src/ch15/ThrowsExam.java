package ch15;

public class ThrowsExam {
	public static void main(String[] args) throws InterruptedException {

/**예외처리 방법
  1)try~catch: 직접처리
  2)throws : 예외처리클래스를 시스템에 위임
  메소드 이름 throws 예외처리클래스 1,예외처리클래스 2,....등등{}*/
 
		for(int i =1;i<=10;i++) {
			System.out.println(i);
			Thread.sleep(1000);//Interrupt(cpu 간섭)
		}
	}

}

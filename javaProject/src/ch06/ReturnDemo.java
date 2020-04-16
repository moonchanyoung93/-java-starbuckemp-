package ch06;

public class ReturnDemo {

	public static void main(String[] args) {
		printScore(99);
		printScore(120);

	}

	private static void printScore(int i) {
		if(i<=0 ||i>=100) {
			System.out.println("잘못된 점수 : " +i);
			return;
		}
		System.out.println("점수 : "+i);
		}

}

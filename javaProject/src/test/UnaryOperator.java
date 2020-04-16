package test;

public class UnaryOperator {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		
		int nextx = ++x;
		int nexty = y++;
		
		System.out.println(nextx); //1을 먼저 증가시킨 후에 x값을 사용한다
		System.out.println(nexty); //1을 사용한 후에 1을 증가시킨다.
		System.out.println(y + x); //y값에는 이제 1이 증가하였다.
	}

}

package ch06;

public class EchoDemo {

	public static void main(String[] args) {
	
		echo("안녕!",10);//매개변수가 2개인 경우!

	}

	private static void echo(String s, int n) {
		for(int i=0; i<n;i++)
			System.out.println(s );
	
		
	}

}

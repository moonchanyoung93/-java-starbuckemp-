package ch04;

public class Multi {

	public static void main(String[] args) {
		long sum = 1;
		long num = 10;
		for (int i = 1; i <=num; i++) {
			sum = sum*i;
		}
		System.out.println("1~" + num+"까지의 곱 : " + sum);
	}

}

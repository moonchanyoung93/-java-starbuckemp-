package ch04;

public class GuguDan2 {

	public static void main(String[] args) {
		for(int dan = 2 ; dan<10; dan++) {
			System.out.println("**" + dan + "단 **");
			for(int n=1;n<10; n++) {
				System.out.println(dan + "*" + n +"=" +dan*n);
			}System.out.println();
		}

	}

}

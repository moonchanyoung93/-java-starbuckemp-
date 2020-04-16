package ch04;

public class GuguDan3 {

	public static void main(String[] args) {
		for(int dan = 1;dan<10;dan++) {
		System.out.println( "*" +dan +"단*");
			
			for(int i = 1; i<=9; i++) {
				System.out.print(dan + "*" +i +"=" +dan*i +"\t");
			}System.out.println();
		}
	}

}

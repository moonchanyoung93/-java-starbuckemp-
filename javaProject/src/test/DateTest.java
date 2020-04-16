package test;

public class DateTest {
	public static void main(String[] args) {
		Date d1=new Date();
		Date d2=new Date(2020);
		Date d3 = new Date(1900,"1월",1);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
	}

}

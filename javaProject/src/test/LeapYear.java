package test;

public class LeapYear {

	public static void main(String[] args) {
		int year =2020;
		boolean isLeapYear;
		
		isLeapYear =(year % 4 ==0);
		System.out.println(isLeapYear);
	}

}

package ch09;

public class Scholar2 extends Student2{
	
	private String grade; //학점
	private String major;
	private int year;

	public void input(String name, String num, String major, int year ) {
		super.input(name, num);
		this.major = major ;
		this.year = year;
		
	}
	
	public void input(String name, String num, String major, int year, String grade) {
		this.input(name, num, major, year);
		this.grade = grade ;
	}
	
	public void print1() {
		System.out.println("--------------------------------");
		System.out.println("이름\t학번\t전공\t학년\t학점");
		System.out.println(name +"\t"+num +"\t"+major +"\t"+year +"\t"+grade);
		
	}
	
	public void print2() {
		System.out.println("--------------------------------");
		System.out.println("이름\t학번\t전공\t학년");
		System.out.println(name +"\t"+num +"\t"+major +"\t"+year);
		
		
	}
	
	public void print3() {
		System.out.println("--------------------------------");
		System.out.println("이름\t학번");
		System.out.println(name +"\t"+num );
		
	}

}

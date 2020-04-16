package test;

public class Date {
	private int year;
	private String month;
	private int day;
	
	public Date() {
		this(2015,"8월",10);
	}
	public Date(int year) {
		this(year,"1월",1);
		
	}
	
	
	public Date(int year, String month, int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	
	@Override
	public String toString() {
		return "Date [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	
	

}

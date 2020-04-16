package ch07;

public class Point2 {

	private String name;
	private int j;
	private int d;
	private int h;
	private int js;
	private int tot;
	private double avg;
	private String grade;


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}


	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}


	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}


	public int getJs() {
		return js;
	}
	public void setJs(int js) {
		this.js = js;
	}


	public int getTot() {
		tot = j+d+h+js;
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		avg = tot/4.0;
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getGrade() {
		if(avg>=90) {
			grade ="수";
		}else if(avg>=80) {
			grade ="우";
		}else if(avg>=70) {
			grade ="미";
		}else if(avg>=60) {
			grade ="양";
		}else {
			grade ="가";
		}
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void print() {
		System.out.println("--------------------------------------------------------");
		System.out.println("이름\tJava\tDB\tHTML\tJSP\t총점\t평균\t등급");
		System.out.println("--------------------------------------------------------");
		System.out.println(name+"\t"+j+"\t"+d+"\t"+h+"\t"+js+"\t"+getTot()+"\t"+String.format("%.2f", getAvg())+"\t"+getGrade());
		System.out.println("--------------------------------------------------------");
	}





}

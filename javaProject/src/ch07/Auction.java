package ch07;

public class Auction {
	private String name;//이름
	private String userid;//아이디
	private int money;//구매금액
	private String grade;//등급(구매금액이 10만원 이상 gold, 7만원 이상 silver, 3만원 이상 bronze)

	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}


	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	

	public String getGrade() {//등급(구매금액이 10만원 이상 gold, 7만원 이상 silver, 3만원 이상 bronze)
		if(money>=100000) {
			grade= "gold";	
		}else if(money>=70000) {
			grade="silver";

		}else if(money>=30000) {
			grade = "bronze";
		} 
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void print() {
		System.out.println("----------------------------");
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println("----------------------------");
		System.out.println(name+"\t"+userid+"\t"+money+"\t"+getGrade());
	}

	


}

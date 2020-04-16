package ch08;

public class Member2 {
	//이름, 아이디, 상품명, 구매금액, 회원등급
	//등급 : 100만원이상  gold, 10만원이상 silver,그외 bronze

	private String name;
	private String userid;
	private String gift;
	private int money;
	private String grade;

	public Member2() {//기본생성자
		this("김철수", "kim", "냉장고", 2000000);
		System.out.println("===============================");
	
	}

	//매개변수있는 생성자
	public Member2(String name, String userid) {
		this(name, userid, "청소기",70000);
	}

	
	public Member2(String name, String userid, String gift, int money) {
		this.name = name;
		this.userid = userid;
		this.gift = gift;
		this.money = money;

	}

	public void input(String name, String userid, String gift, int money) {

		this.name = name;
		this.userid = userid;
		this.gift = gift;
		this.money = money;
	}
	
	public void printinput() {
		System.out.println("-------------------------------");
		System.out.println("매개변수가 있는 메소드 호출...");
		System.out.println("이름\t아이디\t상품명\t구매금액\t등급");
		System.out.println(name +"\t"+ userid+"\t"+gift+"\t"+money+"\t"+ getGrade());
		System.out.println();
	}



	public String getGrade() {
		if(money>=1000000) {
			grade = "gold";
		}else if(money>=100000) {
			grade = "silver";
		}else {
			grade = "bronze";

		}
		return grade;

	}

	//출력메소드
	public void print() {	
		System.out.println("-------------------------------");
		System.out.println("매개변수가 있는 생성자 호출...");
		System.out.println("이름\t아이디\t상품명\t구매금액\t등급");
		System.out.println(name +"\t"+ userid+"\t"+gift+"\t"+money+"\t"+ getGrade());
		System.out.println();

	}








}

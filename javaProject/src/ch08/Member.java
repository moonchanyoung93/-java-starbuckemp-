package ch08;

public class Member {//구매정보 클래스
	//이름, 아이디, 구매금액, 회원등급
	//회원등급: 구매금액이 10만원이상 골드회원, 그렇지않으면 실버회원
	//입력값 : 이름, 아이디, 구매금액
	//출력 : 이름, 아이디 , 구매금액, 회원등급

	private String name;
	private String userid;
	private int money; //구매금액
	private String grade; //10만원이상 gold, 아니면 silver

	//Ctrl + Space =>constructor ...
	public Member() {
		System.out.println("기본 생성자 호출...");

	}

	public void input(String name, String userid, int money) {
		this.name = name;
		this.userid = userid;
		this.money = money;
		
	}

	//매개변수가 있는 생성자
	public Member(String name, String userid, int money) {
		System.out.println("매개변수가 있는 생성자 호출...");
		this.name = name;
		this.userid = userid;
		this.money = money;

	}

	public String getGrade() {
		if(money>=100000) {
			grade = "gold";
		}else {
			grade = "silver";
		}
		return grade;
	}


	public void print() {
		System.out.println("이름\t아이디\t구매금액\t회원등급");
		System.out.println(name +"\t"+ userid +"\t"+ money +"\t"+ grade);
		System.out.println();
	}



}

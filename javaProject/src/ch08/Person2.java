package ch08;

public class Person2 {
	
	private String name;
	private int age;
	private String live;
	private String num;

	
	public Person2() {//기본생성자
		this("문찬영",27,"경기도 안산시","010-5777-8339");
	}
	
	public Person2(String name) {
		this(name,27,"경기도 안산시","010-5777-8339");
	}
	
	public Person2(String name, int age) {
		this(name, age,"경기도 안산시","010-5777-8339");
	}
	
	public Person2(String name, int age, String live) {
		this(name, age,live,"010-5777-8339");
	}
	
	public Person2(String name, int age, String live, String num) {
		this.name=name;
		this.age =age;
		this.live =live;
		this.num = num;
	}
	
	public void print() {
		System.out.println("===개인 정보===");
		System.out.println("이 름 : " +name);
		System.out.println("나 이 : " + age);
		System.out.println("주 소 : " + live);
		System.out.println("전 화 번 호 : " + num);
		System.out.println();
	}
	
}

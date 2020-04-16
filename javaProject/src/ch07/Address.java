package ch07;

public class Address {
	String name;//이름
	int age;//나이
	String num;//전화번호

	int getAge() {
		return age;//멤버변수 값 age값을 리턴.
	}
	
	String getName() {
		return name;
	}
	
	String getNum() {
		return num;
	}
	
	void setName(String a) {
		name= a;
	}
	
	void setNum(String b) {
		num= b;
	}

	void setAge(int ag) {
		age= ag;//멤버변수 = 지역변수
	}

	void print() {
		System.out.println("----------------");
		System.out.println("이름 : " +getName());
		System.out.println("나이 : " +getAge());
		System.out.println("전화번호 :" + getNum());
		System.out.println("----------------");

	}
}


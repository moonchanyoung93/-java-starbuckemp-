package ch07;

public class Person {
	//private는 내부에서만 가능하므로 외부와 연결하는경우 사용할수 없음
	String name;
	int age;
	double height; 
	
	//setter : set+변수명 =>값을 저장하는 일
	public void setName(String name) {
		//this =>멤버변수를 가리킴
		this.name = name;
		
	}
	//getter : get+변수명 =>값을 리턴하는일
	public String getName() {
		return name;
	}
	
	public void setHeight(double height) {
		this.height =height;
		
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setAge(int age) {
		if(age<0|| age>150) {
			System.out.println("입력값이 정확하지 않습니다");
		}else {
			this.age= age ;
		}
	}

	public int getAge() {
		return age;
	}
	public void print() {
		System.out.println("이름 : "+ name+", 나이 : " +age+", 키 : " +height);
		
		
		
	}
}

package ch09;

public class Manager extends Employee {

	public void input(String name, String address, String num, int salary) {
		setName(name);
		setAddress(address);
		setNum(num);
		setSalary(salary);
	}
	
	public void print() {
		System.out.println("-----------------------");
		System.out.println("이름 : " + getName());
		System.out.println("주소 : " +getAddress());
		System.out.println("주민번호 : " +getNum());
		System.out.println("연봉 : "+getSalary());
		System.out.println("-----------------------");
	}
}

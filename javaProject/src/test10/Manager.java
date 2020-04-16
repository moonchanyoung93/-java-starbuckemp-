package test10;

public class Manager extends Employee1{
private int bonus;

	public Manager(String name, String address, int num, int salary , int bonus) {
		super(name, address, num, salary);
		this.bonus=bonus;
		
	}
	
	void print() {
		System.out.println("name = " + name);
		System.out.println("address = "+address);
		System.out.println("salary = "+salary);
	}
	
	public static void main(String[] args) {
		Manager m=new Manager("문찬영", "경기도", 930330, 3500000, 1005000);
		System.out.println(m);
		m.print();
	}
}

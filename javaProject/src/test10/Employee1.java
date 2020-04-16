package test10;

public class Employee1 {
	public String name;
	public String address;
	private int num;
	protected int salary;
	
	
	


public Employee1(String name, String address, int num, int salary) {
		this.name = name;
		this.address = address;
		this.num = num;
		this.salary = salary;
	}


@Override
public String toString() {
	return "Employee1 [name=" + name + ", address=" + address + ", num=" + num + ", salary=" + salary + "]";
}

}

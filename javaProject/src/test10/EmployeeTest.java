package test10;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee("문찬영", 6000);
		Employee e2 = new Employee("권영훈", 4500);
		Employee e3 = new Employee("이다희", 2400);
		
		int n =Employee.getCount();
		
		System.out.println("현재 직원수는 :" +n);
	}

}

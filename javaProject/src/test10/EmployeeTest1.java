package test10;


public class EmployeeTest1  {
	public static void main(String[] args) {
		Date birth = new Date(1993,03, 30);
		
		System.out.println(birth);
		
		Employees e=new Employees("문찬영", birth);
		System.out.println(e);

	}

}

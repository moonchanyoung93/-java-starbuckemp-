package test10;


interface Emp{
	String getName();
	
	static boolean isEmpty(String str) {
		if(str ==null||str.trim().length()==0) {
			return true;
		}else {
			return false;
		}
	}
}

class Empl implements Emp{

	private String name;
	
	public Empl(String name) {
		if(Emp.isEmpty(name)==true) {
			throw new RuntimeException( "이름 입력해야되요.");
		}
		this.name=name;

	}
	@Override
	public String getName() {
		return this.name;
	}
	
}

public class StaticMethodTest2 {

	public static void main(String[] args) {
		Emp e=new Empl("홍길동");
		
	}
}

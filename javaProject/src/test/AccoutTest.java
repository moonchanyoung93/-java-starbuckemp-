package test;

class Accout{
	private String name;
	private int accout;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAccout() {
		return accout;
	}
	public void setAccout(int accout) {
		this.accout = accout;
	}
	
}

public class AccoutTest {
	public static void main(String[] args) {
		Accout a=new Accout();
		a.setName("문찬영");
		a.setAccout(50000);
		
		System.out.println(a.getName()+"님의 잔액은 " + a.getAccout()+"원 입니다");
	}

}

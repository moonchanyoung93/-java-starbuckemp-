package ch12;

class Outer1{
	class InstanceInner{
		int num =2;
	}//end InstanceInner
	
	static class StaticInner{
		static String name ="문찬영";
	}//end class StaticInner

	void myMethod() {
		class LocalInner{
			String email = "khm932001@naver.com";
		}//end class LocalInner
		
		LocalInner a=new LocalInner();
		System.out.println("이메일 : " + a.email+"- (local inner class)");
		
	}//end myMethod()


}

public class InnerEx2 {

	public static void main(String[] args) {
		Outer1 b = new Outer1();
		Outer1.InstanceInner c=b.new InstanceInner();
		System.out.println("------------------------------");
		System.out.println("고객번호 : " +c.num+"- (inner class)");
		System.out.println("이름 : " +Outer1.StaticInner.name+"- (static inner class)");
		b.myMethod();
		System.out.println("------------------------------");
		
		
		

	}

}

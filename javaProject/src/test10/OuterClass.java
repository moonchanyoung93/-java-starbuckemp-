package test10;

public class OuterClass {
	private int value =10;
	
	class InnerClass{
		public void myMethod() {
			System.out.println("외부클래스의 private 변수 값 : " +value);
		}
	}//end Innerclass
	
	public OuterClass() {
		InnerClass i = new InnerClass();
		i.myMethod();
	}
	
	public static void main(String[] args) {
		OuterClass o= new OuterClass();
	}

}

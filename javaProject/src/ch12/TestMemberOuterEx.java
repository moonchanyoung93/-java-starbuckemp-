package ch12;

public class TestMemberOuterEx {
	private int num =1;
	private String name = "문찬영";
	private String email = "khm932001@naver.com";
	
	class TestInner {
		void print() {
			System.out.println("--------------------");
			System.out.println("고객번호 :" +num);
			System.out.println("이름 : " +name);
			System.out.println("이메일 : " +email);
			System.out.println("--------------------");

		}//end print()
	}//end TestInner class
	
	public static void main(String[] args) {
		//outer 객체 생성
		TestMemberOuterEx obj = new TestMemberOuterEx();
		TestMemberOuterEx.TestInner in = obj.new TestInner();//inner 객체생성
		in.print();
	}

}//end class

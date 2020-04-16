package ch12;

public class StaticOuter {
	static int data=30;//static member
	int data2 =50;//non-static member
	
	static class StaticInner{//static member
		void msg() {
			System.out.println("data is " +data);
			//System.out.println("data is " +data2);
			//non-static 멤버 사용불가능

		}

	}

	public static void main(String[] args) {
		StaticOuter.StaticInner in = new StaticInner();
		in.msg();
	}

}

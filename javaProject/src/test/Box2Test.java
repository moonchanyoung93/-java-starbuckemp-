package test;

public class Box2Test {

	public static void main(String[] args) {

		Box2 b= new Box2();
		b.height=30;
		b.width = 20;
		b.length = 20;
		
		System.out.println("상자의 가로,세로, 높이는 " + b.width+","+ b.length+","+ b.height+"입니다!");
	}

}

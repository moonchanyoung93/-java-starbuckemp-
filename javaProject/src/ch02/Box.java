package ch02;

public class Box {

	public static void main(String[] args) {
		double 가로, b, c, d;
		가로= 10.0; // 가로의 길이
		b = 5.0; //세로의 길이
		
		c= 가로 * b;
		d = 2.0 * (가로+b);
		
		System.out.println("사각형의 넓이 : "  + c);
		System.out.println("사각형의 둘레 : "  + d);
		
	}
	
}

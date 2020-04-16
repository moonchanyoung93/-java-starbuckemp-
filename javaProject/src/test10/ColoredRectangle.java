package test10;
class Shape1{
	private int x , y;

	public Shape1(int x, int y) {
		System.out.println("Shape()");
		this.x = x;
		this.y = y;
	}
	
}

class Rectangle1 extends Shape1 {
	private int w,h;

	public Rectangle1(int x, int y, int w, int h) {
		super(x, y);
		System.out.println("Rectangle()");
		this.w = w;
		this.h = h;
	}
	
	double calcArea() {
		return w*h;
	}
	
	
}

public class ColoredRectangle extends Rectangle1 {
String c;

public ColoredRectangle(int x, int y, int w, int h, String c) {
	super(x, y, w, h);
	System.out.println("ColoredRectangle()");
	this.c = c;
}

public static void main(String[] args) {
	ColoredRectangle obj = new ColoredRectangle(10, 10, 10, 10, "red");

	System.out.println(obj.calcArea());
}
	

}

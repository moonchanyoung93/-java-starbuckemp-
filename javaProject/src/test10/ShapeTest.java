package test10;

class Shapes{
	protected int x,y;
	
	void draw() {
		System.out.println("Shape Draw");
	}
	
}

class Rectangles extends Shapes{
	private int w,h;
	
	void draw() {
		System.out.println("Rectangle Draw");
		
	}
}

class Triangles extends Shapes{
	private int b,h;
	
	void draw() {
		System.out.println("Triangle Draw");
		
	}
}

class Circle extends Shapes{
	private int r;
	
	void draw() {
		System.out.println("Circle Draw");
		
	}
}

public class ShapeTest {
	public static void main(String[] args) {
		Shapes s1,s2,s3,s4;
		
		s1=new Shapes();
		s2 =new Rectangles();
		s3 = new Triangles();
		s4=new Circle();
		
		s1.draw();
		s2.draw();
		s3.draw();
		s4.draw();
	}
	

}

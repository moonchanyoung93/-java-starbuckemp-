package test;

 class Point{
	private int x,y;
	 
	public Point(int x, int y){
		this.x =x;
		this.y=y;
	 }

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}

public class Circle {
	private int radius;
	private Point center;
	
	public Circle(Point p, int r) {
		center = p;
		radius = r;
		
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", center=" + center + "]";
	}
	
	
	public static void main(String[] args) {
		Point p = new Point(25, 78);
		Circle c= new Circle(p, 10);
		System.out.println(c.toString());
		
	}
}

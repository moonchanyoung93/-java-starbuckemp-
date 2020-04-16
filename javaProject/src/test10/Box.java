package test10;

public class Box {
	private int width;
	private int height;
	private int length;

	Box(int width, int height, int length){
		this.width=width;
		this.height=height;
		this.length=length;
	}

	boolean a(Box o) {
		if((o.width==width)&(o.height==height)&(o.length==length)) {
			return true;
		}else return false;
		
	}
	
	

	public static void main(String[] args) {
		Box o1=new Box(10, 30, 40);
		Box o2 = new Box(20, 10, 30);
		
		System.out.println(o1.a(o2));
		
		Box o3 = new Box(10, 20, 30);
		Box o4 = new Box(10, 20, 30);
		
		System.out.println( o3.a(o4));
	}
}

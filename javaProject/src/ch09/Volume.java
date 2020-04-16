package ch09;


public class Volume extends Area {
	private int height;
	
	public Volume() {
		
	}
	
	public Volume(int width, int length, int height) {
		super(width,length);//부모클래스의 생성자 호출
		this.height = height;
	}
	
	public int getVolume() {
		//getArea()는 부모클래스의 메소드
		return getArea()*height;
	}

}

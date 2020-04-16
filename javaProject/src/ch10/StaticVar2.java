package ch10;

public class StaticVar2 {
	static int total;//static은 클래스 메모리영역에 생성
	String model;//non static은 heap영역에 생성
	
	public StaticVar2(String model) {//생성자
		this.model=model;
		total++;
	}

	
}

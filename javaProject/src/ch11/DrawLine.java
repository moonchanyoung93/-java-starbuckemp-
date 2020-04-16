package ch11;

import java.awt.Graphics;

public class DrawLine extends Point implements Draw {

	private int x,y;
	public DrawLine() {


	}

	public DrawLine(int a, int b, int x, int y) {
		super(a,b);//부모 생성자 호출
		this.x =x;
		this.y = y;
	}

	@Override
	public void paint(Graphics g) {
		//선그리기 메소드(x1,y1,x2, y2)
		g.drawLine(a, b, x, y);
	}

}

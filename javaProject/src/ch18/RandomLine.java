package ch18;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JApplet;

public class RandomLine extends JApplet{
	private Random r;
	
	@Override
	public void init() {
		setSize(300, 300);
		r=new Random();
		
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for(int i=0;i<100;i++) {
			int red = r.nextInt(256);//0~255
			int green=r.nextInt(256);
			int blue = r.nextInt(256);
			
			//색상표현을 하기위한 두가지 방법 중 하나는 Color.상수
			//둘째는 Color(r,g,b)
			g.setColor(new Color(red,green, blue));//컬러값을  rgb패턴으로
			
			int x1 = r.nextInt(300);
			int y1=r.nextInt(300);
			int x2=r.nextInt(300);
			int y2=r.nextInt(300);
			g.drawLine(x1, y1, x2, y2);
			
		}
	}

}

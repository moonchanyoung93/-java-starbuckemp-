package ch18;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class StringLine2 extends JApplet{
	
	@Override
	public void init() {
		getContentPane().setBackground(new Color(255,255,255));
		setSize(300, 300);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.red);
		g.drawLine(250, 30, 10, 30);
		g.setColor(Color.red);
		g.drawString("이름 : 홍길동 ", 20, 50);
		g.setColor(Color.red);
		g.drawLine(250, 60, 10, 60);
		g.setColor(Color.green);
		g.drawString("이메일 : hong@gmail.com ", 20, 80);
		g.setColor(Color.green);
		g.drawLine(250, 90, 10, 90);
		g.setColor(Color.blue);
		g.drawString("hp : 010-1234-5678 ", 20, 110);
		g.setColor(Color.blue); 
		g.drawLine(250, 120, 10, 120);
	}

}

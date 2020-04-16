package ch18;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class StringLine extends JApplet{
	
	@Override
	public void init() {
		getContentPane().setBackground(new Color(255,255,255));//배경색생설정

		setSize(300, 300);
		
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.blue);
		g.drawLine(250, 50, 30, 160);
		g.setColor(Color.red);
		g.drawString("Red string",10,50);
		g.setColor(Color.green);
		g.drawString("Green string", 10, 80);
		g.setColor(Color.blue);
		g.drawString("Blue string", 10, 110);
	}

}

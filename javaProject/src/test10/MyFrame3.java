package test10;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame3 extends JFrame{
	JPanel p1;
	public MyFrame3() {
		setSize(300, 200);
		setTitle("연습쓰");
		p1= new JPanel();
		p1.setLayout(new FlowLayout());
		for(int i=0;i<10;i++) {
			p1.add(new JButton("button"+i));
		}
		add(p1);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		MyFrame3 m3=new MyFrame3();
	}

}

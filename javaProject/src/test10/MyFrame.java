package test10;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize =kit.getScreenSize();
		setTitle("연습용");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		//setResizable(true);
	
		
		setLayout(new FlowLayout());
		JButton b=new JButton("button");
		JButton b1=new JButton("button2");
		this.add(b);
		this.add(b1);

		
	}
	
	public static void main(String[] args) {
		MyFrame m=new MyFrame();
		
	}
	
	

}

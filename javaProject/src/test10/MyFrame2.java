package test10;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame{
	public MyFrame2() {
		setTitle("연습하자");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLayout(new GridLayout(0,3));

		add(new JButton("b1"));
		add(new JButton("b2"));
		add(new JButton("b3"));
		add(new JButton("b4"));
		add(new JButton("b5"));

		pack();
		setVisible(true);


	}

	public static void main(String[] args) {
		MyFrame2 m= new MyFrame2();
	}


}

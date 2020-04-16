package ch17;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelExam2 extends JFrame {
	public PanelExam2() {
		
		JPanel p=new JPanel();
		p.setBackground(Color.blue);
		
		//버튼생성
		JButton button1 = new JButton("버튼1");
		JButton button2 = new JButton("버튼2");
		JButton button3 = new JButton("버튼3");
		JButton button4 = new JButton("버튼4");
		JButton button5 = new JButton("버튼5");
		JButton button6 = new JButton("버튼6");
		JButton button7 = new JButton("버튼7");
		p.add(button1);
		p.add(button2);
		p.add(button3);
		add(p, BorderLayout.SOUTH);
		add(button4);
		add(button5,"West");
		add(button6,"East");
		add(button7,"North");
		
		setSize(300, 400);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {
		new PanelExam2();
	}

}

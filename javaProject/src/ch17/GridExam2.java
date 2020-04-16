package ch17;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridExam2 extends JFrame {
	public GridExam2() {
		setLayout(new GridLayout(3,4));//3행4열의 그리드레이아웃 변경
		for(int i =1; i<=12; i++) {
			JButton button = new JButton("Button"+i);
			add(button);
		}
		setSize(1000, 750);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new GridExam2();
	}
}

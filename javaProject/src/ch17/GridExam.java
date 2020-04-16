package ch17;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridExam extends JFrame{
	public GridExam() {
		//JFrame의 기본 레이아웃은 BorderLayout
		//기본레이아웃을 쓰지않고 GridLayout으로 변경가능.
		
		setLayout(new GridLayout(2, 3));//2행 3열의 그리드레이아웃 변경
		for(int i =1; i<=6; i++) {
			JButton button = new JButton("Button"+i);
			add(button);//프레임에 버튼 추가
		}
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new GridExam();
	}

}

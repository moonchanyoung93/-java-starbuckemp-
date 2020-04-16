package test10;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Mylab {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		JPanel panel=new JPanel();
		f.add(panel);

		//레이블 생성
		JLabel l1=new JLabel("화씨온도");
		JLabel l2 = new JLabel("섭씨온도");
		JTextField f1=new JTextField(15);
		JTextField f2=new JTextField(15);

		//버튼생성
		JButton button = new JButton("변환");

		//생성한것들을 판넬에 추가!
		panel.add(l1);
		panel.add(f1);
		panel.add(l2);
		panel.add(f2);
		panel.add(button);
		
		f.setSize(300,150);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("온도변환기");



	}

}

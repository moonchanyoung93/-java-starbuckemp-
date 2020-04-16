package ch17;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventExamEx extends JFrame {
	
	private JButton button1,button2,button3,button4,button5;
	
	public EventExamEx() {
		setLayout(new FlowLayout());
		button1 =new JButton("Magenta");//버튼생성
		button2 =new JButton("Black");
		button3 =new JButton("Blue");
		button4 =new JButton("Orange");
		button5 =new JButton("Gray");
		
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		
		button1.addActionListener(new MyColorAction(this,  Color.magenta) );
		button2.addActionListener(new MyColorAction(this,  Color.black) );
		button3.addActionListener(new MyColorAction(this,  Color.blue) );
		button4.addActionListener(new MyColorAction(this,  Color.orange) );
		button5.addActionListener(new MyColorAction(this,  Color.gray) );
		
		setSize(750, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new EventExamEx();
	}

}

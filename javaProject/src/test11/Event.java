package test11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Event1 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton)e.getSource();
		b.setText("버튼 눌림");
	}
}

class MyFrame extends JFrame{
	private JButton b;
	private JLabel l;
	
	public MyFrame() {
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("제목!");
		JPanel p=new JPanel();
		b=new JButton("버튼누르기");
		l=new JLabel("아직 안눌렸어요");
		b.addActionListener(new Event1());
		p.add(b);
		p.add(l);
		this.add(p);
		this.setVisible(true);
	}
}

public class Event{
	public static void main(String[] args) {
		MyFrame t=new MyFrame();
	}
}
package test10;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pizza extends JFrame{
	public Pizza() {
		setTitle("pizza~");
		setSize(600,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//패널 생성
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();

		//패널2에 넣을것들
		JLabel label = new JLabel("자바 피자에 오신것을 환영합니다. 피자의 종류를 선택하세요!");
		p2.add(label);

		//패널3에 넣을것들
		JButton b1=new JButton("고구마피자");
		JButton b2=new JButton("포테이토피자");
		JButton b3=new JButton("불고기피자");

		JLabel label2= new JLabel("개수");
		JTextField text=new JTextField(15);

		p3.add(b1);
		p3.add(b2);
		p3.add(b3);
		p3.add(label2);
		p3.add(text);
		
		//패널4에 넣을것들
		JButton b4=new JButton("주문하기");
		p4.add(b4);
		

		//패널에 패널 2,3 넣기
		p1.add(p2);
		p1.add(p3);
		p1.add(p4);
		add(p1);
		setVisible(true);
	}
	public static void main(String[] args) {
		Pizza p=new Pizza();
	}


}

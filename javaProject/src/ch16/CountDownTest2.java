package ch16;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDownTest2 extends JFrame {
	private JLabel label;

	class MyThread extends Thread{

		@Override
		public void run() {
			for(int i =20; i>=0; i--) {
				try {
					Thread.sleep(100);

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				label.setText(i+"");
			}
		}
	}//end class

	public CountDownTest2() {
		setTitle("카운트 다운");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		label = new JLabel("시작");
		label.setFont(new Font("Serif", Font.BOLD, 100));
		add(label);
		(new MyThread()).start();
		setVisible(true);
	}

	public static void main(String[] args) {
		CountDownTest2 t = new CountDownTest2();
	}
}

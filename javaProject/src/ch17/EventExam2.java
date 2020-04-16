package ch17;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventExam2 extends Frame implements WindowListener{
	
	public EventExam2() {
		addWindowListener(this);//(new...)해서 하지않고 WindowListener를 상속받아서 쓰면 (this)만으로 사용가능!
		setSize(300, 300);
		setVisible(true);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		
	}
public static void main(String[] args) {
	new EventExam2();
}
}

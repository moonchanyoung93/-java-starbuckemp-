package ch17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventExam extends Frame{
	/**이벤트 처리방법
	 * 1.WindowListener익명내부클래스로 구현,
	 * 2. 윈도우아답터익명내부클래스로 구현
	 * 3.외부파일에서 구현 */
	
	public EventExam() {
		setSize(300, 300);
		setVisible(true);
		
		//이벤트 소스.이벤트리스너(이벤트핸들러)
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	public static void main(String[] args) {
		 new EventExam();
	}

}

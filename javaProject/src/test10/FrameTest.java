package test10;

import javax.swing.JFrame;//swing클래스

public class FrameTest {
	public static void main(String[] args) {
		JFrame f=new JFrame("Frame Test");
		f.setSize(300,300);//프레임크기
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//종료버튼생성
		f.setVisible(true);//화면에 나타나게 하기
		
	}

}

package ch18;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class FrameColor extends JFrame {
	public FrameColor() throws InterruptedException {
		setVisible(true);//프레임을 화면에 표시
		//프레임의 컨텐츠 영역
		Container c= getContentPane();
		for(int i =0;i<=255; i++) {
			setSize(i*2,i);//프레임의 사이즈
			setLocation(i*2,i);//프레임의 좌표
			c.setBackground(new Color(i,0,0));
			Thread.sleep(10);//0.01초 멈춤
			
		}
		for(int i =0;i<=255;i++) {
			setSize(i*2, i);
			setLocation(i*2,i);
			c.setBackground(new Color(255,i,i));
			Thread.sleep(10);
		}
		setDefaultCloseOperation(EXIT_ON_CLOSE);//창닫기
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		new FrameColor();
	}

}

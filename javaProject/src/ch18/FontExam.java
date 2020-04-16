package ch18;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JApplet;

public class FontExam extends JApplet{
	private Font font;
	private FontMetrics fm;//글꼴관련 정보들 제공하는 클래스

	private int x,y;
	private String message;
	private Dimension dim;
	
	@Override
	public void init() {
		message = "그래픽 테스트 ";
		//new Font("폰트", 옵션, 사이즈)
		font = new Font("굴림", font.ITALIC,30);
		fm =getFontMetrics(font);
		setSize(250,250 );
		dim = getSize();//화면 크기계산해서 Dimension에 저장
		System.out.println(dim.width);
		System.out.println(dim.height);
		//문자열의 가로, 세로 길이 계산해서 화면의 중앙에 위치
		x=(dim.width/2)-(fm.stringWidth(message)/2);//폰트의 가로길이값
		y=(dim.height/2)-(fm.getDescent()/2);//폰트의 세로길이값
		
				
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setFont(font);//폰트설정
		g.drawString(message, x, y);
	}
	
		

}

package ch16;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class BufferingAnim extends Applet implements Runnable  {
	private Image[] img;
	private int idx;
	private Image offImage;//백그라운드 이미지(버퍼영역)
	private Graphics bg; //백그라운드에 그래픽을 출력하는 객체
	
	@Override
	public void init() {
		img = new Image[10];//이미지 10개를 가리키는 참조변수
		for(int i=0;i<img.length;i++) {
			img[i]=Toolkit.getDefaultToolkit().getImage(getClass().getResource("duke"+(i+1)+ ".gif"));
		}
		Thread t= new Thread(this);
		t.start();
	}

	@Override
	public void update(Graphics g) {
		Dimension d = getSize();//화면크기 계산
		if(offImage == null) {//버퍼이미지 영역이 null일때
			offImage = createImage(d.width,d.height);
			//화면사이즈만큼 생성
			bg= offImage.getGraphics();//그래픽 처리 객체 생성
		}
		bg.setColor(getBackground());//백그라운드 영역의 배경색상
		bg.fillRect(0, 0, d.width, d.height);//백그라운드 영역
		bg.drawImage(img[idx], 0, 0, null);//백그라운드 영역에 그래픽
		paint(g);//paint호출
	}
	
	@Override
	public void paint(Graphics g) {
		if(offImage != null) {//백그라운드 이미지를 그래픽 화면에 출력
			g.drawImage(offImage, 90, 73, this);
		}
	}
	@Override
	public void run() {
		while(true) {
			idx++;
			if(idx >=10) {
				idx =0;
			}
			repaint();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}

package ch16;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class BufferingAnim2 extends Applet implements Runnable {
	private Image[] img;
	private int idx;
	private Image offImage;//백그라운드 이미지
	private Graphics bg;//백그라운드에 그래픽을 출력하는 객체

	@Override
	public void init() {
		img = new Image[9];//이미지 9개를 가리키는 참조변수
		for(int i =0;i<img.length; i++) {
			img[i] = Toolkit.getDefaultToolkit().getImage(getClass().getResource("i"+(i+1)+ ".jpg"));
		}
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void update(Graphics g) {
		Dimension d=getSize();//화면크기 계산
		if(offImage == null) {
			offImage = createImage(d.width, d.height);
			bg=offImage.getGraphics();
		}
		bg.setColor(getBackground());
		bg.fillRect(0, 0, d.width, d.height);
		bg.drawImage(img[idx], 0, 0, null);
		paint(g);//paint()호출

	}

	@Override
	public void paint(Graphics g) {
		if(offImage != null) {//백그라운드 이미지를 그래픽 화면에 출력
			g.drawImage(offImage, 20, 73, this);
		}
	}

	@Override
	public void run() {
		while(true) {
			idx++;
			if(idx>=9) {
				idx = 0;
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

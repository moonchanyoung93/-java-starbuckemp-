package ch16;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class BufferedBall extends Applet implements Runnable, ComponentListener{
	private int x,y;
	private int mx =2, my=3;
	private int width=200, height =200;
	private Graphics bg;//백그라운드 메모리 영역에 그래픽 처리를 할 객체
	private Image offScreen;//백그라운드 이미지 객체
	private Dimension dim;//화면의 가로, 세로 사이즈를 저장하는 객체
	
	//애플릿을 초기화시키는 메소드
	@Override
	public void init() {
		setSize(300,300);//애플릿의 가로, 세로 길이 설정
		dim = getSize();//애플릿의 가로, 세로길이를 Dimension객체에 저장
		offScreen = createImage(dim.width, dim.height);//화면 사이즈만큼백그라운드 그래픽 영역 생성
		bg=offScreen.getGraphics();//백그라운드 영역에 그래픽 처리를 하기 위한 객체 생성
		
		//화면 변화 감지
		this.addComponentListener(this);
		Thread t= new Thread(this);
		t.start();
		
	}
	
	//그래픽 처리
	@Override
	public void paint(Graphics g) {
		//백그라운드 메모리에 그래픽 출력
		bg.setColor(Color.MAGENTA);
		bg.fillRect(0, 0, getWidth(), getHeight());//사각형을 그리는 메소드
		bg.setColor(Color.yellow);
		bg.fillOval(x, y, 30, 30);
		//백그라운드 메모리에 출력된 그림을 화면에 출력
		g.drawImage(offScreen, 0, 0, this);//drawImage(이미지, x, y, 이미지관촬객체)
	}

	@Override
	public void run() {
		while(true) {
			//x,y 좌표값 변경
			if(x > (width-30) || x<0) {//공이 벽에 맞았을때 좌표가 오른쪽 벽에서 -30만큼 공 포인터가 있어야 하고 x가 음수가 되면 안된다.
				mx= -mx; //방향을 반대로 바꿈 즉, x축 2씩 증가하던것을 반대로 2씩 감소시키는 효과를 갖는다.
			}
			x=x+mx; //x좌표의 가중치 부여
			if(y >(height-30) ||y<0) {//공이 하단벽에 맞았을 때 좌표가 하단벽에서 -30만큼 공 포인터가 있어야하고 y가 음수가 되면 안된다
				my=-my; //y축 방향으로 2씩 증가하던것을 2씩 감소시킴.				
			}
			y = y+my;//y좌표의 가중치 부여
			repaint();//화면을 새로 고침 =>paint()가 호출됨
			
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	@Override
	public void componentResized(ComponentEvent e) {
		//화면의 가로,세로 사이즈를 저장(화면크기가 바뀌더라도 정상적으로 출력되게 해줌)
				width = getWidth();//가로사이즈를 get함
				height = getHeight();//세로사이즈를 get함

				System.out.println("가로 : " +width+"세로 : "+ height);
		
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		
	}


}

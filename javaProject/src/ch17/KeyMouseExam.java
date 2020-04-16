package ch17;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;
import javax.swing.event.MouseInputListener;

/**MouseListener : 마우스 이벤트 처리를 위한 인터페이스
 * MouseMotionListener : 마우스이동 이벤트 처리를 위한 인터페이스
 * KeyListener : 키보드이벤트 처리를 위한 인터페이스 */


public class KeyMouseExam extends JApplet implements MouseListener, MouseInputListener, KeyListener{
	private int x, y;//이미지 출력할 x,y좌표값
	private int width, height;//가로,세로 사이즈
	private Image img; //이미지 car.gif 사용할 변수
	private boolean flag=false;//이미지가 처음실행할땐 안보이게 불린값으로 false로 쓰기

	//애플릿을 초기화 하는 코드
	@Override
	public void init() {
		setSize(300,300);//화면 사이즈 설정
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("car.gif"));
		//현재 클래스에 마우스 이벤트 기능을 추가(중요코드)
		this.addMouseListener(this);
		this.addMouseListener(this);
		this.addKeyListener(this);//현재클래스에 키보드(키)이벤트 기능을 추가

		//키입력을 받을 수 있도록 설정
		setFocusable(true);

		//현재 화면에 키 입력을 요청
		requestFocus();

	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);//이미지의 가로,세로 길이 계산
		width = img.getWidth(null);
		height = img.getHeight(null);
		System.out.println(width+","+height);
		if(flag) {//마우스 클릭시 true로 바뀌면서 실행
			g.drawImage(img, x, y, this);

		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		//컴포넌트상에서 마우스 버튼을 눌러 드래그했을때에 호출
		System.out.println("mouse drag : x: "+x +", y: "+y);

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		//마우스 커서가 컴포넌트상에 이동했지만 버튼이 작동않는 경우에 호출
		x=e.getX();
		y=e.getY();
		System.out.println(" mouse move : x : "+x+", y : "+y);
		repaint();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		//키를 입력하면 호출


	}

	@Override
	public void keyPressed(KeyEvent e) {
		//키를 눌렀을때에 호출
		System.out.println(e.getKeyCode());//키 코드값
		System.out.println(e.getKeyChar());//문자를 가지고와서 출력
		switch(e.getKeyCode()) {//키코드값에 따라 분기
		case KeyEvent.VK_UP://위쪽 키를 눌렀을때
			y=Math.max(0, y-5);
			break;
		case KeyEvent.VK_DOWN:
			y=Math.min(300-height, y+5);
			break;
		case KeyEvent.VK_LEFT://왼쪽키를 눌렀을때
			x=Math.max(0, x-5);
			break;
		case KeyEvent.VK_RIGHT://오른쪽 키를 눌렀을때
			x=Math.min(300-width, x+5);
			break;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	//컴포넌트상에서 마우스 버튼을 클릭(눌렀다 놓았다)했을때에 호출
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e);
		flag =true;//클릭할때 그림을 true로 설정해서 보여지게 함.
		//마우스 클릭한 좌표 저장
		x = e.getX();//x좌표값을 가져옴
		y = e.getY();//y좌표값을 가져옴
		//그래픽 갱신 요청
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//컴포넌트상에서 마우스 버튼을 눌렀을때에 호출


	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//컴포넌트상에서 mouse button이 떼어 놓아지면 호출

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//마우스가 컴포넌트상에 들어갔을때에 호출

	}

	@Override
	public void mouseExited(MouseEvent e) {
		//마우스가 컴포넌트를 종료하면 호출.

	}

}

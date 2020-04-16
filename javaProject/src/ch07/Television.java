package ch07;

public class Television {

	//멤버변수 선언
	int channel;// 채널 번호 
	int volume;//볼륨
	boolean onoff; //전원상태
	
	void print() {
		System.out.println("채널은 " +channel+"이고 볼륨은 " +volume+"입니다");
	}
	int getChannel() {
		return channel;//멤버변수의 값 channel을 리턴하겠다.
	}
	
	void setChannel(int ch) {
		channel = ch;//멤버변수 = 지역변수
		
		
	}
	
	
	
}

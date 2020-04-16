package test;

public class Tv {
	private int channel;
	private int volume;
	private boolean onoff;
	
	Tv(int c, int v, boolean o){
		channel =c;
		volume = v;
		onoff = o;
		
	}
	void print() {
		System.out.println("채널은 " +channel +"이고 볼륨은 " +volume+"이다");
		
	}
	
	
	int getchannel() {
		return channel;
	}
	
	void setchannel(int ch) {
		channel = ch;
	}

}

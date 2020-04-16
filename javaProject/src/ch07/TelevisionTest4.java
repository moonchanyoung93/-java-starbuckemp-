package ch07;

public class TelevisionTest4 {

	public static void main(String[] args) {
Television myTv = new Television();
myTv.channel=9;
myTv.volume =9;
myTv.onoff = true;
int ch = myTv.getChannel();
System.out.println("현재채널은 " +ch+"입니다!");
	}

}
